<template>
    <div class="bg-gray-100 pl-20">
        <div class="container mx-auto py-8">
            <div class="flex flex-row gap-6">
                <div class="flex justify-end basis-1/4">
                    <div :style="{ width: '360px' }" class="bg-white rounded-lg p-6 fixed shadow-lg">
                        <div class="flex flex-col items-center">
                            <img src="../../assets/wessim.jpg"
                                class="w-32 h-32 bg-gray-300 rounded-full mb-4 shrink-0" />

                            <h1 class="text-xl font-bold">John Doe</h1>
                            <p class="text-gray-700">Software Developer</p>
                        </div>
                        <hr class="my-6 border-t border-gray-300" />
                        <div class="flex flex-col">
                            <h2 class="text-xl font-bold mb-4">About Me</h2>
                            <ul>
                                <li class="mb-2">
                                    <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                                        class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                                        <router-link to="/profile">
                                            <div class="flex items-center">
                                                <img src="../../assets/list_alt_20dp_FILL0_wght400_GRAD0_opsz20.png"
                                                    alt="" class="w-5 h-5 mr-2" />
                                                <span class="text-sm">Portfolio</span>
                                            </div>
                                        </router-link>
                                    </button>
                                </li>
                                <li class="mb-2">
                                    <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                                        @click="openChat(2)"
                                        class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                                        <div class="flex items-center">
                                            <img src="../../assets/message.png" alt="" class="w-5 h-5 mr-2" />
                                            <span class="text-sm">contacter</span>
                                        </div>
                                    </button>
                                </li>

                            </ul>
                        </div>
                    </div>
                </div>

                <div class="w-[40%] shadow-lg ">
                    <div class="bg-white shadow rounded-lg p-6">
                        <div
                            class="transition ease-in-out mb-4 delay-150 hover:-translate-y-1 hover:scale duration-300  rounded-3xl border-2 border-gray-200 p-4 bg-white lg:p-8 grid grid-cols-12 max-lg:max-w-lg max-lg:mx-auto gap-y-4 ">
                            <div class="col-span-12 lg:col-span-2 img box">
                                <img src="https://pagedone.io/asset/uploads/1701162826.png" alt="speaker image"
                                    class="max-lg:w-full lg:w-[180px] ">
                            </div>
                            <div class="col-span-12 lg:col-span-10 detail w-full lg:pl-3">
                                <div class="flex items-center justify-between w-full mb-4">
                                    <h5 class="font-manrope font-bold text-2xl leading-9 text-gray-900">Round white
                                        portable
                                        speaker</h5>

                                </div>
                                <p class="font-normal text-base leading-7 text-gray-500 mb-6">
                                    Introducing our sleek round white portable speaker, the epitome of style and
                                    sound!
                                    Elevate your auditory experience with this compact yet powerful device that
                                    delivers
                                    crystal-clear audio wherever you go.
                                </p>
                                <div class="flex justify-between items-center">
                                    <div class="flex items-center gap-4">
                                        <a href="#"
                                            class="text-white justify-end font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Réserver</a>
                                    </div>
                                    <h6 class="text-indigo-600 font-manrope font-bold text-2xl leading-9 text-right">
                                        220 DT
                                    </h6>
                                </div>
                            </div>
                        </div>
                        <div
                            class="transition ease-in-out mb-4 delay-150 hover:-translate-y-1 hover:scale duration-300  rounded-3xl border-2 border-gray-200 p-4 bg-white lg:p-8 grid grid-cols-12 max-lg:max-w-lg max-lg:mx-auto gap-y-4 ">
                            <div class="col-span-12 lg:col-span-2 img box">
                                <img src="https://pagedone.io/asset/uploads/1701162826.png" alt="speaker image"
                                    class="max-lg:w-full lg:w-[180px] ">
                            </div>
                            <div class="col-span-12 lg:col-span-10 detail w-full lg:pl-3">
                                <div class="flex items-center justify-between w-full mb-4">
                                    <h5 class="font-manrope font-bold text-2xl leading-9 text-gray-900">Round white
                                        portable
                                        speaker</h5>

                                </div>
                                <p class="font-normal text-base leading-7 text-gray-500 mb-6">
                                    Introducing our sleek round white portable speaker, the epitome of style and
                                    sound!
                                    Elevate your auditory experience with this compact yet powerful device that
                                    delivers
                                    crystal-clear audio wherever you go.
                                </p>
                                <div class="flex justify-between items-center">
                                    <div class="flex items-center gap-4">
                                        <a href="#"
                                            class="text-white justify-end font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Réserver</a>
                                    </div>
                                    <h6 class="text-indigo-600 font-manrope font-bold text-2xl leading-9 text-right">
                                        220 DT
                                    </h6>
                                </div>
                            </div>
                        </div>
                        <div
                            class="transition ease-in-out mb-4 delay-150 hover:-translate-y-1 hover:scale duration-300  rounded-3xl border-2 border-gray-200 p-4 bg-white lg:p-8 grid grid-cols-12 max-lg:max-w-lg max-lg:mx-auto gap-y-4 ">
                            <div class="col-span-12 lg:col-span-2 img box">
                                <img src="https://pagedone.io/asset/uploads/1701162826.png" alt="speaker image"
                                    class="max-lg:w-full lg:w-[180px] ">
                            </div>
                            <div class="col-span-12 lg:col-span-10 detail w-full lg:pl-3">
                                <div class="flex items-center justify-between w-full mb-4">
                                    <h5 class="font-manrope font-bold text-2xl leading-9 text-gray-900">Round white
                                        portable
                                        speaker</h5>

                                </div>
                                <p class="font-normal text-base leading-7 text-gray-500 mb-6">
                                    Introducing our sleek round white portable speaker, the epitome of style and
                                    sound!
                                    Elevate your auditory experience with this compact yet powerful device that
                                    delivers
                                    crystal-clear audio wherever you go.
                                </p>
                                <div class="flex justify-between items-center">
                                    <div class="flex items-center gap-4">
                                        <a href="#"
                                            class="text-white justify-end font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Réserver</a>
                                    </div>
                                    <h6 class="text-indigo-600 font-manrope font-bold text-2xl leading-9 text-right">
                                        220 DT
                                    </h6>
                                </div>
                            </div>
                        </div>
                        <div
                            class="transition ease-in-out mb-4 delay-150 hover:-translate-y-1 hover:scale duration-300  rounded-3xl border-2 border-gray-200 p-4 bg-white lg:p-8 grid grid-cols-12 max-lg:max-w-lg max-lg:mx-auto gap-y-4 ">
                            <div class="col-span-12 lg:col-span-2 img box">
                                <img src="https://pagedone.io/asset/uploads/1701162826.png" alt="speaker image"
                                    class="max-lg:w-full lg:w-[180px] ">
                            </div>
                            <div class="col-span-12 lg:col-span-10 detail w-full lg:pl-3">
                                <div class="flex items-center justify-between w-full mb-4">
                                    <h5 class="font-manrope font-bold text-2xl leading-9 text-gray-900">Round white
                                        portable
                                        speaker</h5>

                                </div>
                                <p class="font-normal text-base leading-7 text-gray-500 mb-6">
                                    Introducing our sleek round white portable speaker, the epitome of style and
                                    sound!
                                    Elevate your auditory experience with this compact yet powerful device that
                                    delivers
                                    crystal-clear audio wherever you go.
                                </p>
                                <div class="flex justify-between items-center">
                                    <div class="flex items-center gap-4">
                                        <a href="#"
                                            class="text-white justify-end font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Réserver</a>
                                    </div>
                                    <h6 class="text-indigo-600 font-manrope font-bold text-2xl leading-9 text-right">
                                        220 DT
                                    </h6>
                                </div>
                            </div>
                        </div>
                        <div
                            class="transition ease-in-out mb-4 delay-150 hover:-translate-y-1 hover:scale duration-300  rounded-3xl border-2 border-gray-200 p-4 bg-white lg:p-8 grid grid-cols-12 max-lg:max-w-lg max-lg:mx-auto gap-y-4 ">
                            <div class="col-span-12 lg:col-span-2 img box">
                                <img src="https://pagedone.io/asset/uploads/1701162826.png" alt="speaker image"
                                    class="max-lg:w-full lg:w-[180px] ">
                            </div>
                            <div class="col-span-12 lg:col-span-10 detail w-full lg:pl-3">
                                <div class="flex items-center justify-between w-full mb-4">
                                    <h5 class="font-manrope font-bold text-2xl leading-9 text-gray-900">Round white
                                        portable
                                        speaker</h5>

                                </div>
                                <p class="font-normal text-base leading-7 text-gray-500 mb-6">
                                    Introducing our sleek round white portable speaker, the epitome of style and
                                    sound!
                                    Elevate your auditory experience with this compact yet powerful device that
                                    delivers
                                    crystal-clear audio wherever you go.
                                </p>
                                <div class="flex justify-between items-center">
                                    <div class="flex items-center gap-4">
                                        <a href="#"
                                            class="text-white justify-end font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Réserver</a>
                                    </div>
                                    <h6 class="text-indigo-600 font-manrope font-bold text-2xl leading-9 text-right">
                                        220 DT
                                    </h6>
                                </div>
                            </div>
                        </div>


                    </div>

                </div>
                <div class="flex basis-1/3 ">
                    <div :style="{ width: '360px', height: '900px' }" class="bg-white rounded-lg fixed p-6 shadow-lg ">
                        <div class="flex  flex-col items-center">
                            <form>
                            <div class="relative mr-2">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                    <img src="../../assets/search.png" alt=""
                                        class="w-10 h-10 text-gray-500 dark:text-amber-400" />
                                </div>
                                <input name="search" type="search" id="search"
                                    class="bg-gray-100 w-full shadow-lg p-4 ps-16 text-m px-4 py-3.5 rounded-md outline-amber-500"
                                    placeholder="Quel prestataire recherchez . . ."  v-model="name"/>
                                   
                                </div>
                                <button type ="button" @click="recher_presta" class=" mt-3 text-white justify-end font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Chercher</button>
                                <div v-if="prestataires">
                                    <!-- houni tebda-->

<div class="w-full mt-5 max-w-md p-4 bg-white border border-gray-200 rounded-lg shadow sm:p-8 light:bg-gray-800 light:border-gray-700">
    <div class="flex items-center justify-between mb-4">
        <h5 class="text-xl font-bold leading-none text-gray-900 light:text-white">Latest Customers</h5>
      
   </div>
   <div class="flow-root">
        <ul role="list" class="divide-y divide-gray-200 light:divide-gray-700">
            <li class="py-3 sm:py-4" v-for="(presta,index) in prestataires" :key="index">
                <div class="flex items-center">
                    <div class="flex-shrink-0">
                        <img class="w-8 h-8 rounded-full" :src="presta.photo" alt="Neil image">
                    </div>
                    <div class="flex-1 min-w-0 ms-4">
                        <p class="text-sm font-medium text-gray-900 truncate light:text-white">
                            {{presta.nom+ " "+presta.prenom}}
                        </p>
                        <p class="text-sm text-gray-500 truncate light:text-gray-400">
                           {{presta.addresse}}
                        </p>
                    </div>
                    <div class="inline-flex items-center text-base font-semibold text-gray-900 light:text-white">
                        $320
                    </div>
                </div>
            </li>
         
      
           
           
        </ul>
   </div>
</div>
<!-- houni tekef-->
                                </div>
                            </form>

                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!-- <chat v-if="chat == true" :recu_id="this.recu_id" :envoi_id="store.getuser['id']" @close-view="closeViewHandler">
      </chat> -->
        <chat v-if="chat == true" :recu_id="2" :envoi_id="store.getUser['id']" @close-view="closeViewHandler">
        </chat>
    </div>

</template>

<script>
import comment from "./CommentComponent.vue";
import chat from "../chat/chatComponent.vue"
import UserService from "../../service/User"
import { useAuthStore } from "../../store/index"
export default {
    created() {



    },

    components: {
        chat
    },

    data() {
        return {
            store: useAuthStore(),
            chat: false,
            userChat: "",
            id: "",
            name:"",
            prestataires:"",
        };
    },

    methods: {
        recher_presta()
        {
            let data ={}; 
            data.name  =  this.name; 
            UserService.getPrestataires(data).then((res)=>{
                console.log(res.data);
                this.prestataires =  res.data.data; 
            });
        },

        openChat(id) {
            if (this.chat == true) {
                this.chat = false
                console.log(id);
            }
            else {
                // this.recu_id = id;
                this.chat = true;
            }

        },
        closeViewHandler() {
            this.chat = false
        },


    },
};
</script>