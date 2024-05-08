<template>
    <div>
      <Sidbar></Sidbar>
      <prestataire></prestataire>
    </div>
  </template>
  
  <script>
  import Sidbar from "../../components/DashbordAdmin/sidBar.vue";
  import prestataire from "../../components/DashbordAdmin/PrestataireComponent.vue"
  
  export default {
    name: "PrestataireView",
  
    components: {
      Sidbar,
      prestataire,
     
    },
  };
  </script>
  