<template>
  <div>
    <Sidbar></Sidbar>
    <!-- <client></client> -->
    <demande></demande>
  </div>
</template>

<script>
// @ is an alias to /src
// import prestataire from "../components/DashbordAdmin/PrestataireAdmin.vue";
import client from "../../components/DashbordAdmin/ClientComponent.vue";
import Sidbar from "../../components/DashbordAdmin/sidBar.vue";
import demande from "../../components/DashbordAdmin/DemandeComponent.vue"

export default {
  name: "DashbordView",

  components: {
    Sidbar,
    // prestataire,
    client,
    demande ,
  },
};
</script>
