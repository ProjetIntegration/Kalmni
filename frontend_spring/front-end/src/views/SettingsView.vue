<template>
  <div>
    <Navbar></Navbar>
    <Settings></Settings>
  </div>
</template>

<script>
// @ is an alias to /src


import Navbar from "../components/NavbarComponent.vue";
import Settings from "../components/Prestataire/SettingsComponent.vue";

export default {
  name: "SettingsView",

  components: {
    Navbar,
    Settings,
  },
};
</script>
