<template>
  <div>
    <Navbar></Navbar>
    <Acceuil></Acceuil>
  </div>
</template>

<script>
// @ is an alias to /src

import Acceuil from "../components/Prestataire/homePrestataire.vue";
import Navbar from "../components/NavbarComponent.vue";

export default {
  name: "ProfileView",

  components: {
    Navbar,
    Acceuil,
  },
};
</script>
