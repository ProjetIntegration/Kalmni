<template>
  <div class="bg-gray-100">
    <div class="container mx-auto py-8">
      <div class="flex flex-row gap-6">
        <home></home>
        <!-- <service :recu_id="1" :envoi_id="2"></service> -->
        <div class="flex basis-2/5">
          <div :style="{ width: '360px', height: '600px' }" class="bg-white rounded-lg fixed p-6 shadow-lg ">
            <div class="flex  flex-col items-center">
              <div class="relative mr-2">
                <form action="">
                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                  <img src="../../assets/search.png" alt="" class="w-10 h-10 text-gray-500 dark:text-amber-400" />
                </div>
                <input name="search" type="search" id="search" v-model="name"
                  class="bg-gray-100 w-full shadow-lg p-4 ps-16 text-m px-4 py-3.5 rounded-md outline-amber-500"
                  placeholder="Quel prestataire recherchez . . ." />
                  <button></button>
                </form>
              </div>

            </div>
            <ul role="list" class="mx-auto max-w-7xl divide-y divide-gray-100 m-3">
              <li v-for="user in prestataires" :key="user.id">
                <div id="toast-message-cta"
                  class="w-full max-w-xs text-gray-500 bg-white rounded-lg shadow dark:bg-gray-800 dark:text-gray-400"
                  role="alert">
                  <div class="flex">
                    <img v-if="user.photo != Null" class="w-8 h-8 m-3 rounded-full" :src="'http://localhost:8000' + user.photo" alt="prestataire image" />
                    <div class="ms-3 text-sm font-normal">
                      <button>
                        <span class="mb-1 text-sm font-semibold text-gray-900 dark:text-white">{{ user.name + " " + user.lastName }}</span></button>
                      <div class="mb-2 text-sm font-normal">Hi Neil, thanks for sharing your thoughts regarding
                        Flowbite.</div>
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


export default {

  components: {
    home,
    service,
  },

  data() {
    return {
      name:"",
      prestataires: "",


    };
  },
  methods: {
    recher_presta() {
      let data = {};
      data.name = this.name;
      UserService.getPrestataires(data).then((res) => {
        console.log(res.data);
        this.prestataires = res.data.data;
      });
    },

  },
};
</script>