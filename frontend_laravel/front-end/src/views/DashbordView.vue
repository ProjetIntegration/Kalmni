<template>
  <div>
    <Sidbar></Sidbar>
    <client></client>
  </div>
</template>

<script>
// @ is an alias to /src
// import prestataire from "../components/DashbordAdmin/PrestataireAdmin.vue";
import client from "../components/DashbordAdmin/ClientAdmin.vue";
import Sidbar from "../components/DashbordAdmin/sidBar.vue";

export default {
  name: "DashbordView",

  components: {
    Sidbar,
    // prestataire,
    client,
  },
};
</script>
