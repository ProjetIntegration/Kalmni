<template>
    <div class="">
        <aside
            class="border-4 border-currentColor-500/50  fixed bottom-4 end-4  items-center justify-center gap-4 rounded-lg bg-white  shadow-2xl">
            <div class="relative flex items-center overflow-hidden bg-white px-4 h-20 shadow-2xl ">
                <img v-if="user && user.photo != null" class="h-12 w-12 flex-none rounded-full bg-gray-50"
                    :src="'http://localhost:8000' + user.photo" alt="" />
                <div v-else
                    class="relative inline-flex items-center justify-center h-12 w-12 overflow-hidden bg-gray-100 rounded-full dark:bg-gray-600">
                    <span class="font-medium text-gray-600 dark:text-gray-300">{{ user && user.prenom ? user.prenom.charAt(0) : '' }}.{{ user && user.nom ? user.nom.charAt(0) : '' }}</span>
                </div>
                <a  target="_blank" rel="noreferrer" class="text-sm font-medium hover:opacity-75 pl-4">
                    {{ user.nom + " " + user.prenom }} 👋
                </a>

                <button type="button" @click="closeView"
                    class="absolute right-4 top-4 bg-sky-100 text-gray-400 hover:text-gray-500 sm:right-4 sm:top-4 md:right-6 md:top-6 lg:right-8 lg:top-6">
                    <span class="sr-only">Close</span>
                    <svg class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor"
                        aria-hidden="true">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M6 18L18 6M6 6l12 12" />
                    </svg>
                </button>
            </div>
            <div class="col-12 col-lg-7 col-xl-9 bg-slate-100 ">
                <div class="flex flex-col flex-grow w-full max-w-xl bg-white shadow-xl rounded-lg overflow-hidden ">
                    <div class="py-2 px-4 border-bottom d-none d-lg-block">
                        <div>
                            <div class="flex flex-col flex-grow  p-4 overflow-auto h-72">
                                <div v-for="chats in chat" :key="chats.id" ref="messsageContainers">
                                    <div class="flex w-full mt-2 space-x-3 max-w-xs">
                                        <div v-if="this.envoi_id == chats.receiver_id">

                                            <div class="bg-gray-300 p-3 rounded-r-lg rounded-bl-lg w-52">
                                                <p class="text-sm">{{ chats.message }}</p>
                                            </div>
                                            <span class="text-xs text-gray-500 leading-none">{{ 
                                                moment(chats.created_at).format("DD-MM-yy, h:m a") }}</span>
                                        </div>
                                    </div>
                                    <div class="flex w-full mt-2 space-x-3 max-w-xs ml-auto justify-end">
                                        <div v-if="this.envoi_id == chats.sender_id">
                                            <div class="bg-blue-600 text-white p-3 rounded-l-lg rounded-br-lg w-52">
                                                <p class="text-sm"> {{ chats.message }} </p>
                                            </div>
                                            <span class="text-xs text-gray-500 leading-none">{{
                                                moment(chats.created_at).format("DD-MM-yy, h:m a") }}</span>
                                        </div>
                                    </div>
                                </div>


                            </div>
                        </div>
                    </div>
                </div>

                <div class="flex-grow-0 py-2 px-2 border-top">
                    <div class="flex flex-row items-center h-16 rounded-xl bg-white w-full px-4">
                        <div>
                            <button class="flex items-center justify-center text-gray-400 hover:text-gray-600">
                                <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24"
                                    xmlns="http://www.w3.org/2000/svg">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                        d="M15.172 7l-6.586 6.586a2 2 0 102.828 2.828l6.414-6.586a4 4 0 00-5.656-5.656l-6.415 6.585a6 6 0 108.486 8.486L20.5 13">
                                    </path>
                                </svg>
                            </button>
                        </div>
                        <div class="flex-grow ml-4">
                            <div class="relative w-full">
                                <input type="text" v-model="message"
                                    class="flex w-full border rounded-xl focus:outline-none focus:border-indigo-300 pl-4 h-10" />
                                <button
                                    class="absolute flex items-center justify-center h-full w-12 right-0 top-0 text-gray-400 hover:text-gray-600">
                                    <svg class="w-6 h-6" fill="none" stroke="currentColor" viewBox="0 0 24 24"
                                        xmlns="http://www.w3.org/2000/svg">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                            d="M14.828 14.828a4 4 0 01-5.656 0M9 10h.01M15 10h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z">
                                        </path>
                                    </svg>
                                </button>
                            </div>
                        </div>
                        <div class="ml-4">
                            <button @click="sentMessage"
                                class="flex items-center justify-center bg-indigo-500 hover:bg-indigo-600 rounded-xl text-white px-4 py-1 flex-shrink-0">
                                <span>Send</span>
                                <span class="ml-2">
                                    <svg class="w-4 h-4 transform rotate-45 -mt-px" fill="none" stroke="currentColor"
                                        viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                            d="M12 19l9 2-9-18-9 18 9-2zm0 0v-8"></path>
                                    </svg>
                                </span>
                            </button>
                        </div>
                    </div>
                </div>

            </div>
        </aside>

    </div>
</template>

<script>

import UserService from "../../service/User"
import chatService from '../../service/chat'
import { useAuthStore } from "@/store/index.js"
import moment from 'moment'

export default {
    mounted() {
        window.Echo.channel('public').listen('ChatMessageSent', (e) => {
            this.getMessages();
            this.getUserById(this.recu_id)
        })
        
    },
    props: {
        envoi_id: Number,
        recu_id: Number,
    },
    setup() {

    },
    async created() {
        if (this.recu_id !== null && this.recu_id !== undefined) {
            this.getMessages();
            this.getUserById(this.recu_id);
            this.moment = moment;
        }
    },

    components: {

    },
    data() {
        return {
            store: useAuthStore(),
            user: [],
            messages: [],
            chat: [],
            message: '',
            isSendingForm: false,
            name:"",
            lastName:"",
        }
    },
    methods: {
        scrollToLastMessage() {
            this.$nextTick(() => {
                let items = this.$refs.messsageContainers;
                if (items && items.length > 0) {
                    let last = items[items.length - 1];
                    last.scrollIntoView({
                        block: "nearest",
                        inline: "center",
                        behavior: "smooth",
                        alignToTop: false
                    });
                }
            })
        },
        async getMessages() {
            try {
                const res = await chatService.getMessages({
                    envoi_id: store.getUser['id'],
                    recu_id: this.recu_id
                });
               
                
                this.chat = res.data.data;
                
                this.scrollToLastMessage();



            } catch (error) {
                console.error('Error fetching messages:', error);
            }
        },
        async sentMessage() {
            try {
                this.isSendingForm = true;
                const res = await chatService.sentMessage({
                    message: this.message,
                    envoi_id: this.envoi_id,
                    recu_id: this.recu_id
                });
                this.message = "";
                this.isSendingForm = false;

            } catch (error) {
                console.error('Error fetching messages:', error);
            }
        },
        getUserById(id) {
            UserService.getUserById(id).then((res) => {
                this.user = res.data.data;
            })
        },
        closeView() {

            this.$emit('close-view');
        },
    }
}
</script>
