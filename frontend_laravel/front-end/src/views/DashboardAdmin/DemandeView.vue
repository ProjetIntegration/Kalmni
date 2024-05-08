<template>
    <div>
      <Sidbar></Sidbar>
      <demande></demande>
    </div>
  </template>
  
  <script>
  // @ is an alias to /src
  import Sidbar from "../../components/DashbordAdmin/sidBar.vue";
  import demande from "../../components/DashbordAdmin/DemandeComponent.vue"
  
  export default {
    name: "DemandeView",
  
    components: {
      Sidbar,
      demande ,
    },
  };
  </script>
  