<template>
  <div class="max-w-screen-xl mb-20">
    
    <nav
      class="bg-white shadow-2xl light:bg-gray-900 fixed w-full z-20 top-0 start-0 border-b border-gray-200 light:border-gray-600"
    >
    
      <div
        class="flex items-center justify-between w-full p-4"
      >
      <img
      src="../assets/logo2.png"
      class="h-14 z-30"
      alt="kalmni Logo"
    />
        <div class="flex md:order-2 space-x-3 md:space-x-0 rtl:space-x-reverse">
          <img src="../assets/phone.png" class="pl-10" alt="" />
          <div class="pl-3">
            <p class="text-amber-400 font-bold">Appelez-nous</p>
            <p>(+255) 24 145 421</p>
          </div>
        </div>
        <div v-if="user" class="flex md:order-2 space-x-3 md:space-x-0 rtl:space-x-reverse" ><h1 class="mt-3  mr-3 font-bold text-xl">{{ user.nom+ " " +user.prenom }}</h1><img class="w-24" :src="'http://localhost:8000'+user.photo"></div>
        <div class="flex md:order-2 space-x-3 md:space-x-0 rtl:space-x-reverse" v-else>
          <button
            type="button"
            class="transition ease-in-out delay-150 text-black font-bold mr-3 hover:-translate-y-1 hover:scale-110 duration-300 ..."
          >
          <router-link to="/SigneIn">sign in</router-link>
          </button>

          <button
            type="button"
            class="text-white font-bold transition ease-in-out delay-150 bg-amber-500 hover:bg-amber-600 focus:ring-4 focus:outline-none focus:ring-amber-400 rounded-lg text-sm px-4 py-2 text-center light:bg-amber-500 light:focus:ring-amber-500 hover:-translate-y-1 hover:scale-110 light:hover:bg-amber-500 duration-300 ..."
          >
            <router-link to="/SigneUp">sign up</router-link>
          </button>
          <button
            data-collapse-toggle="navbar-sticky"
            type="button"
            class="inline-flex items-center p-2 w-10 h-10 justify-center text-sm text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 light:text-gray-400 light:hover:bg-gray-700 light:focus:ring-gray-600"
            aria-controls="navbar-sticky"
            aria-expanded="false"
          >
            <span class="sr-only">Open main menu</span>
            <svg
              class="w-5 h-5"
              aria-hidden="true"
              xmlns="http://www.w3.org/2000/svg"
              fill="none"
              viewBox="0 0 17 14"
            >
              <path
                stroke="currentColor"
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M1 1h15M1 7h15M1 13h15"
              />
            </svg>
          </button>
        </div>
        <div
          class="items-center justify-between hidden w-full md:flex md:w-auto md:order-1 -mr-10"
          id="navbar-sticky"
        >
          <ul
            class="flex flex-col p-4 md:p-0 mt-4 font-medium border border-gray-100 rounded-lg bg-gray-50 md:space-x-6 rtl:space-x-reverse md:flex-row md:mt-0 md:border-0 md:bg-white light:bg-gray-800 md:light:bg-gray-900 light:border-gray-700"
          >
            <li>
              <a href=""
                ><router-link
                  to="/"
                  class="transition ease-in-out delay-150 block py-2 px-3 text-2xl text-gray-900 rounded hover:bg-gray-100 md:hover:bg-transparent md:hover:text-amber-500 md:p-0 md:light:hover:text-amber-500 light:text-white light:hover:bg-amber-500 light:hover:text-white md:light:hover:bg-transparent light:border-gray-700 hover:-translate-y-1 hover:scale-110 duration-300 ..."
                  >Acceuil</router-link
                ></a
              >
            </li>
            <li class="text-gray-300">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                stroke="currentColor"
                class="w-6 h-10"
                viewBox="0 0 24 24"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M12 5v0m0 7v0m0 7v0m0-13a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2z"
                />
              </svg>
            </li>
            
            <li>
              <a href=""
                ><router-link
                  to="/ReserverService"
                  class="transition ease-in-out delay-150 block py-2 px-3 text-2xl text-gray-900 rounded hover:bg-gray-100 md:hover:bg-transparent md:hover:text-amber-500 md:p-0 md:light:hover:text-amber-500 light:text-white light:hover:bg-amber-500 light:hover:text-white md:light:hover:bg-transparent light:border-gray-700 hover:-translate-y-1 hover:scale-110 duration-300 ..."
                  >Reserver un service</router-link
                ></a
              >
            </li>
            <li class="text-gray-300">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                stroke="currentColor"
                class="w-6 h-10"
                viewBox="0 0 24 24"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M12 5v0m0 7v0m0 7v0m0-13a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2z"
                />
              </svg>
            </li>
            <li>
              <a href=""
                ><router-link
                  to="/Acceuill"
                  class="transition ease-in-out delay-150 block py-2 px-3 text-2xl text-gray-900 rounded hover:bg-gray-100 md:hover:bg-transparent md:hover:text-amber-500 md:p-0 md:light:hover:text-amber-500 light:text-white light:hover:bg-amber-500 light:hover:text-white md:light:hover:bg-transparent light:border-gray-700 hover:-translate-y-1 hover:scale-110 duration-300 ..."
                  >Trouver un prestatair</router-link
                ></a
              >
            </li>
            
          </ul>
        </div>
      </div>
    </nav>
  </div>
</template>
<script>

export default {
  computed: {
    user() {

      let x = localStorage.getItem("user")
        ? JSON.parse(localStorage.getItem("user"))
        : "";
        console.log(x);
      return x;
    },
  },
  methods :{
  
  
  
  },

}  

</script>