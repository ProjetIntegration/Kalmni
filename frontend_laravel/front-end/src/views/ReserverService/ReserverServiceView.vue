<template>
    <div>
      <Navbar></Navbar>
      <ReserverService></ReserverService>
    </div>
  </template>
  
  <script>
  // @ is an alias to /src
  
  import Navbar from "../../components/NavbarComponent.vue";
  import ReserverService from "../../components/ReserverService/ReserverService.vue";
  
  export default {
    name: "ReserverServiceView",
  
    components: {
      Navbar,
      ReserverService,
    },
  };
  </script>
  