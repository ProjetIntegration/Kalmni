<template>
  <div>
    <header class="bg-gray-50 shadow">
      <div class="mx-auto max-w-7xl py-8 sm:px-6">
        <div class="flex items-center gap-4">
          <h1 class="text-3xl font-bold tracking-tight text-gray-900">
            prestataire
          </h1>

          <form class="justify-end">
            <label
              for="default-search"
              class="mb-2 text-sm bg-amber-500 font-medium text-gray-900 sr-only dark:text-white"
              >Search</label
            >
            <div class="relative">
              <div
                class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none"
              >
                <svg
                  class="w-4 h-4 text-gray-500 dark:text-gray-400"
                  aria-hidden="true"
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 20 20"
                >
                  <path
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z"
                  />
                </svg>
              </div>
              <input
                type="search"
                class="block w-full p-4 ps-10 pe-32 text-sm border rounded-lg dark:text-white"
                placeholder="Search website..."
              />
              <button
                type="button"
                class="text-white absolute end-2.5 bottom-2.5 bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
              >
                Search
              </button>
            </div>
          </form>
        </div>
      </div>
    </header>
    <div class="divide-y-4 divide-slate-400/25 ...">
     

      <ul role="list" class="mx-auto max-w-7xl divide-y divide-dashed" v-if ="prestataires" v-for="(user,index) in prestataires " :key="index">
        <li class="flex justify-between gap-x-6 py-5">
          <div class="flex min-w-0 gap-x-4">
            <img
              class="h-12 w-12 flex-none rounded-full bg-gray-50"
              :src="'http://localhost:8000'+user.photo"
            />
            <div class="min-w-0 flex-auto">
              <button>
                <p class="text-sm font-semibold leading-6 text-gray-900">{{ user.prenom +" "+user.nom }}</p>
              </button>
              <p class="mt-1 truncate text-xs leading-5 text-gray-500">{{ user.addresse }}</p>
            </div>
          </div>
          <div
            class="inline-flex rounded-lg border border-gray-100 bg-gray-100 p-1"
          >
            <button
              class="inline-flex items-center gap-2 rounded-md px-4 py-2 text-sm text-gray-500 hover:text-gray-700 focus:relative"
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke-width="1.5"
                stroke="currentColor"
                class="h-4 w-4"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  d="M2.036 12.322a1.012 1.012 0 010-.639C3.423 7.51 7.36 4.5 12 4.5c4.638 0 8.573 3.007 9.963 7.178.07.207.07.431 0 .639C20.577 16.49 16.64 19.5 12 19.5c-4.638 0-8.573-3.007-9.963-7.178z"
                />
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  d="M15 12a3 3 0 11-6 0 3 3 0 016 0z"
                />
              </svg>

              voir
            </button>

            <button
              class="inline-flex items-center gap-2 rounded-md bg-white px-4 py-2 text-sm text-blue-500 shadow-sm focus:relative"
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke-width="1.5"
                stroke="currentColor"
                class="h-4 w-4"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  d="M14.74 9l-.346 9m-4.788 0L9.26 9m9.968-3.21c.342.052.682.107 1.022.166m-1.022-.165L18.16 19.673a2.25 2.25 0 01-2.244 2.077H8.084a2.25 2.25 0 01-2.244-2.077L4.772 5.79m14.456 0a48.108 48.108 0 00-3.478-.397m-12 .562c.34-.059.68-.114 1.022-.165m0 0a48.11 48.11 0 013.478-.397m7.5 0v-.916c0-1.18-.91-2.164-2.09-2.201a51.964 51.964 0 00-3.32 0c-1.18.037-2.09 1.022-2.09 2.201v.916m7.5 0a48.667 48.667 0 00-7.5 0"
                />
              </svg>

              Supprimer
            </button>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>




<<script>
import Users from  "../../service/User";

export default {
  data() {
    return {
      prestataires: [],
    };
  },
  created() {
    this.GetPrestataires();
  },
  methods: {
    GetPrestataires() {
      Users.GetallPrestataires().then((res) => {
        this.prestataires = res.data.data;

        console.log(this.prestataires);
      }).catch(error => {
        console.error("There was an error retrieving the prestataires:", error);
      });
    },
  },
};
</script>