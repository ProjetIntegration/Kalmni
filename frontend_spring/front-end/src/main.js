import { createApp } from "vue";
import { createPinia } from 'pinia'
import App from "./App.vue";
const pinia = createPinia()
const app = createApp(App)


import router from "./router";
import "./assets/style.css";

createApp(App).use(router).use(pinia).mount("#app");
