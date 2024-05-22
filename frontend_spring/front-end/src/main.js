import { createApp } from "vue";
import { createPinia } from 'pinia'
import App from "./App.vue";
const pinia = createPinia()
const app = createApp(App)
import Echo from "laravel-echo"
window.Pusher = require('pusher-js');

window.Echo = new Echo({
   broadcaster: 'pusher',
   key: "local",
   wsHost:"127.0.0.1",
   wsPort: 6001,
   cluster: "mt1",
   forceTLS: false,
   disableStats: true,
});

import router from "./router";
import "./assets/style.css";

createApp(App).use(router).use(pinia).mount("#app");
