<template>
  <div class="flex flex-row justify-end basis-3/5">
        <div class="flex  basis-3/5 ">
          <div :style="{ width: '360px' }" class="bg-white rounded-lg p-6 fixed shadow-lg">
            <div class="flex flex-col items-center">
              <img :src="'http://localhost:8000'+user.photo" class="w-32 h-32 bg-gray-300 rounded-full mb-4 shrink-0" />

              <h1 class="text-xl font-bold" v-if="user">{{user.nom +" " +user.prenom}}</h1>

              <p class="text-gray-700">{{ user.adresse }}</p>
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
                        <img src="../../assets/list_alt_20dp_FILL0_wght400_GRAD0_opsz20.png" alt=""
                          class="w-5 h-5 mr-2" />
                        <span class="text-sm">Portfolio</span>
                      </div>
                    </router-link>
                  </button>
                </li>
                <li class="mb-2">
                  <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                    class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                    <router-link to="/Settings">
                      <div class="flex items-center">
                        <img src="../../assets/tune_20dp_FILL0_wght400_GRAD0_opsz20.png" alt="" class="w-5 h-5 mr-2" />
                        <span class="text-sm">Settings</span>
                      </div>
                    </router-link>
                  </button>
                </li>
                <li class="mb-2">
                  <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                    class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                    <div class="flex items-center">
                      <img src="../../assets/home_20dp_FILL0_wght400_GRAD0_opsz20.png" alt="" class="w-5 h-5 mr-2" />
                      <span class="text-sm">Home</span>
                    </div>
                  </button>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div class="basis-4/5 shadow-lg ">
          <div class="bg-white shadow rounded-lg p-6 flex flex-col items-center">
            <div class="max-w-md container bg-white border border-gray-200 rounded-lg mb-5 grid grid-cols-3 shadow-lg">
              <h1 class="text-2xl mt-2 ml-4 font-bold text-center text-gray-300 cursor-pointer col-span-2">
                cree votre publication
              </h1>

              <button type="button" @click="add = true"
                class="text-white font-bold m-3 bg-amber-500 hover:bg-amber-600 focus:ring-4 focus:outline-none focus:ring-amber-400 rounded-lg text-sm px-4 py-2 text-center dark:bg-amber-500 dark:focus:ring-amber-500">
                Create
              </button>
              <!-- create section  -->
              <div class="relative z-10 rounded-lg" role="dialog" v-if="add == true">
                <div class="fixed inset-0 hidden bg-gray-500 bg-opacity-75 transition-opacity md:block"></div>

                <div class="fixed inset-0 z-10 w-screen overflow-y-auto">
                  <div class="flex min-h-full items-stretch justify-center text-center md:items-center md:px-2 lg:px-4">
                    <div
                      class="flex w-full transform text-left text-base transition md:my-8 md:max-w-2xl md:px-4 lg:max-w-4xl">
                      <div
                        class="relative flex items-center overflow-hidden bg-white px-4 pb-8 pt-14 shadow-2xl sm:px-6 sm:pt-8 md:p-6 lg:p-8">
                        <button type="button" @click="close()"
                          class="absolute right-4 top-4 text-gray-400 hover:text-gray-500 sm:right-6 sm:top-8 md:right-6 md:top-6 lg:right-8 lg:top-8">
                          <span class="sr-only">Close</span>
                          <svg class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor"
                            aria-hidden="true">
                            <path stroke-linecap="round" stroke-linejoin="round" d="M6 18L18 6M6 6l12 12" />
                          </svg>
                        </button>
                        <form @submit.prevent="SavePost()" enctype="multipart/form-data"
                          class="w-200 mb-0 mt-6 space-y-4 rounded-lg p-4 shadow-lg sm:p-6 lg:p-8">
                          <p class="text-center text-lg font-medium">
                            cree une poste
                          </p>
                          <div>
                            <label for="Username" class="relative block rounded-md border border-gray-200 shadow-sm">
                              <input type="text" v-model="nom"
                                class="w-[500px] peer border-none bg-transparent placeholder-transparent focus:border-transparent focus:outline-none focus:ring-0 p-4 pe-12"
                                placeholder="Username" />

                              <span
                                class="pointer-events-none absolute start-2.5 top-0 -translate-y-1/2 bg-white p-0.5 text-xs text-gray-700 transition-all peer-placeholder-shown:top-1/2 peer-placeholder-shown:text-sm peer-focus:top-0 peer-focus:text-xs">
                                titre du publication
                              </span>
                            </label>
                          </div>
                          <div>
                            <label for="description" class="relative block rounded-md border border-gray-200 shadow-sm">
                              <textarea type="text" v-model="description"
                                class="w-[500px] peer border-none bg-transparent placeholder-transparent focus:border-transparent focus:outline-none focus:ring-0 p-4 pe-12"
                                placeholder="description"></textarea>

                              <span
                                class="pointer-events-none absolute start-2.5 top-0 -translate-y-1/2 bg-white p-0.5 text-xs text-gray-700 transition-all peer-placeholder-shown:top-1/2 peer-placeholder-shown:text-sm peer-focus:top-0 peer-focus:text-xs">
                                description du publication
                              </span>
                            </label>
                          </div>
                          <!-- TW Elements is free under AGPL, with commercial license required for specific uses. See more details: https://tw-elements.com/license/ and contact us for queries at tailwind@mdbootstrap.com -->
                          <div class="mb-3">
                            <label for="formFile"
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200">image</label>
                            <input
                              class="relative m-0 block w-full min-w-0 flex-auto rounded border border-solid border-neutral-300 bg-clip-padding px-3 py-[0.32rem] text-base font-normal text-neutral-700 transition duration-300 ease-in-out file:-mx-3 file:-my-[0.32rem] file:overflow-hidden file:rounded-none file:border-0 file:border-solid file:border-inherit file:bg-neutral-100 file:px-3 file:py-[0.32rem] file:text-neutral-700 file:transition file:duration-150 file:ease-in-out file:[border-inline-end-width:1px] file:[margin-inline-end:0.75rem] hover:file:bg-neutral-200 focus:border-primary focus:text-neutral-700 focus:shadow-te-primary focus:outline-none dark:border-neutral-600 dark:text-neutral-200 dark:file:bg-neutral-700 dark:file:text-neutral-100 dark:focus:border-primary"
                              ref="photo" @change="Saveimage" type="file" id="formFile" />
                          </div>
                          <button @click="afficher()" type="submit"
                            class="block w-full rounded-lg bg-amber-400 px-5 py-3 text-sm font-medium text-white">
                            ajouter
                          </button>
                        </form>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- end of creat section  -->
            <div class="max-w-md container bg-white border border-gray-200 rounded-lg mb-5 shadow-lg">
              <div>
                <h1
                  class="text-2xl mt-2 ml-4 font-bold text-gray-800 cursor-pointer hover:text-gray-900 transition duration-100">
                  Service plambier
                </h1>
                <p class="ml-4 mt-1 mb-2 text-gray-700">
                  J'ai besoin de plambier chez manar
                </p>
              </div>
              <div class="flex p-4 justify-between">
                <div class="flex items-center space-x-2">
                  <img class="w-10 rounded-full"
                    src="https://d2qp0siotla746.cloudfront.net/img/use-cases/profile-picture/template_3.jpg"
                    alt="sara" />
                  <h2 class="text-gray-800 font-bold cursor-pointer">
                    Felipe Sacudon
                  </h2>
                </div>
                <div class="flex space-x-2" @click="getComments()">
                  <div class="flex space-x-1 items-center">
                    <span>
                      <svg xmlns="http://www.w3.org/2000/svg" class="h-7 w-7 text-gray-600 cursor-pointer" fill="none"
                        viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                          d="M8 12h.01M12 12h.01M16 12h.01M21 12c0 4.418-4.03 8-9 8a9.863 9.863 0 01-4.255-.949L3 20l1.395-3.72C3.512 15.042 3 13.574 3 12c0-4.418 4.03-8 9-8s9 3.582 9 8z" />
                      </svg>
                    </span>
                    <span>22</span>
                  </div>
                  <div class="flex space-x-1 items-center">
                    <span>
                      <svg xmlns="http://www.w3.org/2000/svg"
                        class="h-7 w-7 text-red-500 hover:text-red-400 transition duration-100 cursor-pointer"
                        viewBox="0 0 20 20" fill="currentColor">
                        <path fill-rule="evenodd"
                          d="M3.172 5.172a4 4 0 015.656 0L10 6.343l1.172-1.171a4 4 0 115.656 5.656L10 17.657l-6.828-6.829a4 4 0 010-5.656z"
                          clip-rule="evenodd" />
                      </svg>
                    </span>
                    <span>20</span>
                  </div>
                </div>
              </div>
              <comment v-if="com == 1"></comment>
            </div>
            <div class="max-w-md container bg-white border border-gray-200 rounded-lg mb-5 shadow-lg">
              <div>
                <h1
                  class="text-2xl mt-2 ml-4 font-bold text-gray-800 cursor-pointer hover:text-gray-900 transition duration-100">
                  Service plambier
                </h1>
                <p class="ml-4 mt-1 mb-2 text-gray-700">quelque description</p>
              </div>
              <div class="flex flex-col items-center">
                <img class="h-60 w-auto" src="../../assets/lavage.jpeg" />
              </div>
              <div class="flex p-4 justify-between">
                <div class="flex items-center space-x-2">
                  <img class="w-10 rounded-full"
                    src="https://d2qp0siotla746.cloudfront.net/img/use-cases/profile-picture/template_3.jpg"
                    alt="sara" />
                  <h2 class="text-gray-800 font-bold cursor-pointer">
                    Felipe Sacudon
                  </h2>
                </div>
                <div class="flex space-x-2" @click="getComments()">
                  <div class="flex space-x-1 items-center">
                    <span>
                      <svg xmlns="http://www.w3.org/2000/svg" class="h-7 w-7 text-gray-600 cursor-pointer" fill="none"
                        viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                          d="M8 12h.01M12 12h.01M16 12h.01M21 12c0 4.418-4.03 8-9 8a9.863 9.863 0 01-4.255-.949L3 20l1.395-3.72C3.512 15.042 3 13.574 3 12c0-4.418 4.03-8 9-8s9 3.582 9 8z" />
                      </svg>
                    </span>
                    <span>22</span>
                  </div>
                  <div class="flex space-x-1 items-center">
                    <span>
                      <svg xmlns="http://www.w3.org/2000/svg"
                        class="h-7 w-7 text-red-500 hover:text-red-400 transition duration-100 cursor-pointer"
                        viewBox="0 0 20 20" fill="currentColor">
                        <path fill-rule="evenodd"
                          d="M3.172 5.172a4 4 0 015.656 0L10 6.343l1.172-1.171a4 4 0 115.656 5.656L10 17.657l-6.828-6.829a4 4 0 010-5.656z"
                          clip-rule="evenodd" />
                      </svg>
                    </span>
                    <span>20</span>
                  </div>
                </div>
              </div>
              <comment v-if="com == 1"></comment>
            </div>
            <div class="max-w-md container bg-white border border-gray-200 rounded-lg mb-5 shadow-lg">
              <div>
                <h1
                  class="text-2xl mt-2 ml-4 font-bold text-gray-800 cursor-pointer hover:text-gray-900 transition duration-100">
                  Service plambier
                </h1>
                <p class="ml-4 mt-1 mb-2 text-gray-700">quelque description</p>
              </div>
              <div class="flex flex-col items-center">
                <img class="h-60 w-auto" src="../../assets/lavage.jpeg" />
              </div>
              <div class="flex p-4 justify-between">
                <div class="flex items-center space-x-2">
                  <img class="w-10 rounded-full"
                    src="https://d2qp0siotla746.cloudfront.net/img/use-cases/profile-picture/template_3.jpg"
                    alt="sara" />
                  <h2 class="text-gray-800 font-bold cursor-pointer">
                    Felipe Sacudon
                  </h2>
                </div>
                <div class="flex space-x-2" @click="getComments()">
                  <div class="flex space-x-1 items-center">
                    <span>
                      <svg xmlns="http://www.w3.org/2000/svg" class="h-7 w-7 text-gray-600 cursor-pointer" fill="none"
                        viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                          d="M8 12h.01M12 12h.01M16 12h.01M21 12c0 4.418-4.03 8-9 8a9.863 9.863 0 01-4.255-.949L3 20l1.395-3.72C3.512 15.042 3 13.574 3 12c0-4.418 4.03-8 9-8s9 3.582 9 8z" />
                      </svg>
                    </span>
                    <span>22</span>
                  </div>
                  <div class="flex space-x-1 items-center">
                    <span>
                      <svg xmlns="http://www.w3.org/2000/svg"
                        class="h-7 w-7 text-red-500 hover:text-red-400 transition duration-100 cursor-pointer"
                        viewBox="0 0 20 20" fill="currentColor">
                        <path fill-rule="evenodd"
                          d="M3.172 5.172a4 4 0 015.656 0L10 6.343l1.172-1.171a4 4 0 115.656 5.656L10 17.657l-6.828-6.829a4 4 0 010-5.656z"
                          clip-rule="evenodd" />
                      </svg>
                    </span>
                    <span>20</span>
                  </div>
                </div>
              </div>
              <comment v-if="com == 1"></comment>
            </div>
          </div>
        </div>
        
    
  </div>
</template>

<script>



import Post from "@/service/Post";

import chat from "../chat/chatComponent.vue";
import { useAuthStore } from "../../store/index"


export default {
  computed: {
    user() {

      let x = localStorage.getItem("user")
        ? JSON.parse(localStorage.getItem("user"))
        : "";
        console.log(x);
      return x;
    },
  },
  
  components: {
    chat
  },
  data() {
    return {
      com: 0,
      add: false,

      nom:"",
      description:"",
      photo: null,

    };
  },
  methods: {
    afficher() {
      console.log(this.nom + " "+ this.description)
    },
    getComments() {
      if (this.com == 0) {
        this.com = 1;
      } else {
        this.com = 0;
      }
    },
    close() {
      this.add = false;
    },
    SavePhoto() {
      this.photo = this.$refs.photo_name.files[0];
      console.log(this.photo);
    },
    SavePost(){
      Post.AddPost({
        nom: this.nom,
        description: this.description,
        photo: this.photo,
      }).then((res) => {
        console.log(res);
      })
    }
  },
 
};
</script>
