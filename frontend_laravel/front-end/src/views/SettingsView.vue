<template>
  <div>
    <Navbar></Navbar>
    <update></update>
  </div>
</template>

<script>
// @ is an alias to /src


import Navbar from "../components/NavbarComponent.vue";
import update from "@/components/Prestataire/updateComponent.vue";

export default {
  name: "ProfileView",

  components: {
    Navbar,
    update,
  },
};
</script>
