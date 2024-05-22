<template>
    <div>
      <Navbar></Navbar>
      <profile></profile>
    </div>
  </template>
  
  <script>
  // @ is an alias to /src
  
  import profile from "../components/Prestataire/trouverPrestatire.vue";
  import Navbar from "../components/NavbarComponent.vue";
  
  export default {
    name: "TrouverPrestataire",
  
    components: {
      Navbar,
      profile,
    },
  };
  </script>
  