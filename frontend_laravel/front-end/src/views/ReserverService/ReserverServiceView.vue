<template>
    <div>
      <div v-if="user">
        <Navbar></Navbar>
      <ReserverService></ReserverService> 
    </div>
    <router-view v-else></router-view>
      
    </div>
  </template>
  
  <script>
  // @ is an alias to /src
  
  import Navbar from "../../components/NavbarComponent.vue";
  import ReserverService from "../../components/ReserverService/ReserverService.vue";
  
  
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
    name: "ReserverServiceView",
  
    components: {
      Navbar,
      ReserverService,
    },
    created() {
    if (!this.user) {
      this.$router.push({ name: "SigneInView" });
    }
  },
  };
  </script>
  