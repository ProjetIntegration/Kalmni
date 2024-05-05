import { createRouter, createWebHashHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import ProfileView from "@/views/ProfileView.vue";
import SigneUpView from "@/views/SigneUpView.vue";
import DashbordView from "@/views/DashbordView.vue";
import ClientAdmin from "@/components/DashbordAdmin/ClientAdmin.vue";

const routes = [
  {
    path: "/",
    name: "home",
    component: HomeView,
  },
  {
    path: "/profile",
    name: "profile",
    component: ProfileView,
  },
  {
    path: "/SigneUp",
    name: "SignUp",
    component: SigneUpView,
  },
  {
    path: "/ClientAdmin",
    name: "ClientAdmin",
    component: ClientAdmin,
  },
  {
    path: "/Dashbord",
    name: "DashbordView",
    component: DashbordView,
  },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
