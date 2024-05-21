<template>
    <div>
     <header class="bg-gray-50 shadow">
      <div class="mx-auto max-w-7xl py-8 sm:px-6">
        <div class="flex items-center gap-4">
          <h1 class="text-3xl font-bold tracking-tight text-gray-900">
            Demande 
          </h1>
        </div>
      </div>
    </header>
    <div class="divide-y-4 divide-slate-400/25 ...">
      <ul role="list" class="mx-auto max-w-7xl">
        <li class="flex justify-between gap-x-6 py-5" v-for="user in Prestatataire" :key="user.id">
          <div class="flex min-w-0 gap-x-4" >
            <img
              class="h-12 w-12 flex-none rounded-full bg-gray-50"
              :src="'http://localhost:8000' + user.photo" alt="vgvgbv"            />
            <div class="min-w-0 flex-auto">
                <p class="text-sm font-semibold leading-6 text-gray-900">
                  {{ user.nom }}
                </p>
                <p class="text-sm font-semibold leading-6 text-gray-900">
                  {{ user.prenom }}
                </p>
              <p class="mt-1 truncate text-xs leading-5 text-gray-500">
                {{ user.email }}
              </p>
            </div>
          </div>
          <div
            class="inline-flex rounded-lg border border-gray-100 bg-gray-100 p-1"
          >
            <button
            type="button"
                @click="add = true"
              class="inline-flex items-center gap-2 rounded-md px-4 py-2 text-sm text-gray-500 hover:text-gray-700 focus:relative"
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke-width="1.5"
                stroke="currentColor"
                class="h-4 w-4"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  d="M2.036 12.322a1.012 1.012 0 010-.639C3.423 7.51 7.36 4.5 12 4.5c4.638 0 8.573 3.007 9.963 7.178.07.207.07.431 0 .639C20.577 16.49 16.64 19.5 12 19.5c-4.638 0-8.573-3.007-9.963-7.178z"
                />
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  d="M15 12a3 3 0 11-6 0 3 3 0 016 0z"
                />
              </svg>

              Consulter
            </button>
            <div
                class="relative z-10 rounded-lg"
                role="dialog"
                v-if="add == true"
              >
                <div
                  class="fixed inset-0 hidden bg-gray-500 bg-opacity-75 transition-opacity md:block"
                ></div>

                <div class="fixed inset-0 z-10 w-screen overflow-y-auto">
                  <div
                    class="flex min-h-full items-stretch justify-center text-center md:items-center md:px-2 lg:px-4"
                  >
                    <div
                      class="flex w-full transform text-left text-base transition md:my-8 md:max-w-2xl md:px-4 lg:max-w-4xl"
                    >
                      <div
                        class="relative flex items-center overflow-hidden bg-white px-4 pb-8 pt-14 shadow-2xl sm:px-6 sm:pt-8 md:p-6 lg:p-8"
                      >
                        <button
                          type="button"
                          @click="close()"
                          class="absolute right-4 top-4 text-gray-400 hover:text-gray-500 sm:right-6 sm:top-8 md:right-6 md:top-6 lg:right-8 lg:top-8"
                        >
                          <span class="sr-only">Close</span>
                          <svg
                            class="h-6 w-6"
                            fill="none"
                            viewBox="0 0 24 24"
                            stroke-width="1.5"
                            stroke="currentColor"
                            aria-hidden="true"
                          >
                            <path
                              stroke-linecap="round"
                              stroke-linejoin="round"
                              d="M6 18L18 6M6 6l12 12"
                            />
                          </svg>
                        </button>
                        <div class="w-200 mb-0 mt-6 rounded-lg p-6 shadow-lg sm:p-8 lg:p-10 space-y-8">
  <p class="text-center text-xl font-bold">Données du prestataire</p>
  <img class="lg:h-80 md:h-64 h-48 w-full object-cover object-center" :src="'http://localhost:8000'+user.photo" alt="blog">
  <div>
    <label for="Username" class="block font-bold text-lg">Addresse du prestataire:</label>
    <p class="bg-gray-100 p-4 rounded-md">{{user.adresse}}</p>
  </div>
  <div>
    <label for="description" class="block font-bold text-lg">Email du prestataire :</label>
    <p class="bg-gray-100 p-4 rounded-md">{{ user.email }}</p>
  </div>
  <div class="flex justify-center space-x-4">
        <button class="rounded-lg bg-green-500 hover:bg-green-600 px-6 py-4 text-lg font-medium text-white transition-colors" type="button" @click="AccepterUser(user.id)">Accepter</button>
        <button class="rounded-lg bg-red-500 hover:bg-red-600 px-6 py-4 text-lg font-medium text-white transition-colors" type="button" @click="RejeterUser(user.id)">Rejeter</button>
      </div>
</div>

                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          
        </li>
      </ul>
      
    </div>
    </div>
</template>
<script>
import RejeterService from "../../service/User"
import AccepterService from "../../service/User"
import getUserByStatusService from "../../service/User"
export default {
  data() {
    return {
      add: false,
      Prestatataire :[],
        nom: "",
        prenom: "",
        email: "",
        password: "",
        photo: "",
        tel: "",
        adresse: "",
        date: "",
        photo_certif:"",
        description:"",
        title:"",
      

    };
  },
  mounted() {
    this.getUserByStatus(); // Call the method when the component is mounted
  },
  methods: {
    
    close() {
      this.add = false;
    },
    async getUserByStatus() {
      try {
        const response = await getUserByStatusService.getUserByStatus();
        this.Prestatataire = response.data;
        console.log(this.Prestatataire);
      } catch (error) {
        console.error("Error fetching user data:", error);
      }
    },
    RejeterUser(){
      RejeterService.RejeterUser(user.id)
    },
    AccepterUser(){
      AccepterService.AccepterUser(user.id)
    },
    // getUserByStatus(){
    //   getUserByStatusService.getUserByStatus()
    // }
  },
};
// function accept() {
//     const acceptBtn = document.querySelector('.accept-btn');
//     acceptBtn.classList.add('animate-celebrate');
//   }
</script>

<!-- <style>
  .animate-celebrate {
    animation: celebrate 1s infinite;
  }

  @keyframes celebrate {
    0% {
      transform: scale(1);
    }
    50% {
      transform: scale(1.2);
    }
    100% {
      transform: scale(1);
    }
  }
</style> -->