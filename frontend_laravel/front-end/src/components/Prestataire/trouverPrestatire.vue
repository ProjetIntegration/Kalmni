<template>
  <div class="bg-gray-100 min-h-screen">
    <div class="container mx-auto py-8">
      <div class="flex flex-row gap-6 ">
        <home v-if="this.rechercher === false"></home>
        <service v-if="this.rechercher ===  true" :recu_id="this.recu_id" :envoi_id="this.envoi_id"></service>
        <div class="flex basis-2/5">
          <div :style="{ width: '360px' }" class="bg-white rounded-lg  p-6 shadow-lg ">
            <div class="flex  flex-col items-center">
              <div class="relative mr-2">
                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                  <img src="../../assets/search.png" alt="" class="w-10 h-10 text-gray-500 dark:text-amber-400 mt-5" />
                </div>
                <input name="search" type="search" id="search" v-model="name"  @keyup="recher_presta()"
                  class="bg-gray-100 w-full shadow-lg p-4 mt-6 ps-16 text-m px-4 py-3.5 rounded-md outline-amber-500"
                  placeholder="Quel prestataire rechercher . . ." />
                <!-- <button @click="recher_presta"
                  class="text-white justify-end mt-5 font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Chercher
                </button> -->
              </div>



            </div>
            <ul role="list" class="mx-auto max-w-7xl divide-y divide-gray-100 ">
              <li v-for="user in prestataires" :key="user.id" class="m-4">
                <div id="toast-message-cta"
                  class="w-full max-w-xs text-gray-500 bg-white rounded-lg shadow dark:bg-gray-800 dark:text-gray-400"
                  role="alert">
                  <div class="flex">
                    <img v-if="user.photo != Null" class="w-8 h-8 m-3 rounded-full"
                      :src="'http://localhost:8000' + user.photo" alt="prestataire image" />
                    <div class="ms-3 text-sm font-normal">
                      <button @click="page_service(user)">
                        <span class="mb-1 text-sm font-semibold text-gray-900 dark:text-white">{{ user.nom + " " +
          user.prenom }}</span></button>
                      <div class="mb-2 text-sm font-normal"> {{ user.adresse }}
                        </div>
                    </div>

                  </div>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<script>
import home from "../Prestataire/homePrestataire.vue"
import service from "../Prestataire/ServicePrestataire.vue"
import UserService from "../../service/User"
import { useAuthStore } from "../../store/index"




export default {

  components: {
    home,
    service,
  },

  data() {
    return {
      store: useAuthStore(),
      name: "",
      prestataires: "",
      id:"",
      rechercher: false,
      recu_id : "",
      


    };
  },
  methods: {
    recher_presta() {
      if(this.name!=""){
        let data = {};
      data.name = this.name;
      
      UserService.getPrestataires(data).then((res) => {
        
        this.prestataires = res.data.data;
      });
      }
      else{
        this.prestataires="";
      }
      
    },
    page_service(user){
      
      this.rechercher=true;
      this.recu_id=user.id;
      this.envoi_id = this.store.getUser['id'];

    }


  },
};
</script>