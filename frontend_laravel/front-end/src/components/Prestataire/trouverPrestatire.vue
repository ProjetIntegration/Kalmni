<template>
    <div class="bg-gray-100">
      <div class="container mx-auto py-8">
        <div class="flex flex-row gap-6">
          <!-- <home></home> -->
          <service :recu_id="1" :envoi_id="2"></service>
          <div class="flex basis-2/5">
            <div :style="{ width: '360px', height: '600px' }" class="bg-white rounded-lg fixed p-6 shadow-lg ">
              <div class="flex  flex-col items-center">
                <div class="relative mr-2">
                  <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                    <img src="../../assets/search.png" alt="" class="w-10 h-10 text-gray-500 dark:text-amber-400" />
                  </div>
                  <input name="search" type="search" id="search"
                    class="bg-gray-100 w-full shadow-lg p-4 ps-16 text-m px-4 py-3.5 rounded-md outline-amber-500"
                    placeholder="Quel prestataire recherchez . . ." />
                </div>
  
              </div>
  
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
        
      };
    },
    methods: {
      
    },
  };
  </script>
  