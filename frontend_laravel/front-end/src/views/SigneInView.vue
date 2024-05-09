<template>
    <Navbar></Navbar>
    <SigneIn></SigneIn>
  </template>
  <script>
  import Navbar from "../components/NavbarComponent.vue";
  import SigneIn from "../components/SigneIn/SigneInComponent.vue";
  
  
  export default {
    name: "SigneInView",
  
    components: {
      Navbar,
      SigneIn,
    },
  };
  </script>
  