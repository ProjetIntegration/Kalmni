<template>
  <Navbar></Navbar>
  <SigneUP></SigneUP>
</template>
<script>
import Navbar from "../components/NavbarComponent.vue";
import SigneUP from "../components/SigneUp/SigneUP.vue";


export default {
  name: "SigneUpView",

  components: {
    Navbar,
    SigneUP,
  },
};
</script>
