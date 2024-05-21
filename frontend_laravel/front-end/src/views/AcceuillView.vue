<template>
      <div v-if="user">
    <Navbar></Navbar>
    <Acceuil></Acceuil>
  </div>
  <router-view v-else></router-view>

</template>

<script>
// @ is an alias to /src

import Acceuil from "../components/Prestataire/trouverPrestatire.vue";
import Navbar from "../components/NavbarComponent.vue";

export default {
  name: "ProfileView",

  components: {
    Navbar,
    Acceuil,
  },
  computed: {
    user() {

      let x = localStorage.getItem("user")
        ? JSON.parse(localStorage.getItem("user"))
        : "";
      console.log(x);
      return x;
    },
  },
  created() {
    if (!this.user) {
      this.$router.push({ name: "SigneInView" });
    }
  },
};
</script>
