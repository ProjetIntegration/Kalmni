<template>
  <div>
    <div v-if="isAdmin">
            <Sidbar></Sidbar>

      <demande></demande>
    </div>
    <div v-else>
      <Navbar></Navbar>
      <search></search>
      <service></service>
      <reserver></reserver>
      <Promo></Promo>
      <recommande></recommande>
      <footer2></footer2>
    </div>
    

  </div>
</template>

<script>
// @ is an alias to /src
import Navbar from "../components/NavbarComponent.vue";
import search from "../components/Home/SearchComponent.vue";
import service from "../components/Home/ServiceComponent.vue";
import footer2 from "../components/Home/FooterComponent.vue";
import reserver from "../components/Home/ReserveComponent.vue";
import Promo from "../components/Home/PromoComponent.vue";
import recommande from "../components/Home/reccomandeComponent.vue";
import Sidbar from "../components/DashbordAdmin/sidBar.vue";
import demande from "../components/DashbordAdmin/DemandeComponent.vue"
import { useAuthStore } from "@/store/index.js"


export default {

  name: "HomeView",

  components: {
    search,
    Navbar,
    service,
    reserver,
    footer2,
    Promo,
    recommande,
    Sidbar,

    demande,
  },
  data() {
    return {
      store: useAuthStore(),
    }
  },
  
  setup() {
    const authStore = useAuthStore();

    return {
      isAdmin: authStore.getIsAdmin,
    };
  },
};
</script>
