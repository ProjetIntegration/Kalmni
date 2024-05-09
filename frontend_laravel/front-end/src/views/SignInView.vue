<template>
    <Navbar></Navbar>
    <SigneIn></SigneIn>
  </template>
  <script>
  import Navbar from "../components/NavbarComponent.vue";
  import SigneIn from "../components/SignIn/SignInComponent.vue";
  
  
  export default {
    name: "SigneInView",
  
    components: {
      Navbar,
      SigneIn,
    },
  };
  </script>
  