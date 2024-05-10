<template>
    <div>
      <Sidbar></Sidbar>
      <Client></Client>
    </div>
  </template>
  
  <script>
  import Sidbar from "../../components/DashbordAdmin/sidBar.vue";
  import Client from "../../components/DashbordAdmin/ClientComponent.vue"
  
  export default {
    name: "ClientView",
  
    components: {
      Sidbar,
      Client,
     
    },
  };
  </script>
  