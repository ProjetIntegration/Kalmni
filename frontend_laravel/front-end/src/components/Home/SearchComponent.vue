<template>
  <div>
    <section
      class="overflow-hidden bg-cover bg-top bg-no-repeat max-w-screen-2xl mx-auto"
      :style="{
        backgroundImage: `url(${require('@/assets/dashbord.jpg')})`,
        maxWidth: '100%',
      }"
    >
      <div class="bg-black/25 p-8 md:p-12 lg:px-16 lg:py-24">
        <div class="text-center ltr:sm:text-left rtl:sm:text-right">
          <h2
            class="text-2xl font-bold text-white sm:text-3xl md:text-5xl mt-20"
          >
            Le service qu'il vous faut,<br />
            en une minute chrono!
          </h2>
          <h3 class="text-M text-white sm:text-M md:text-2xl">
            Plateforme de service N°1 en Tunisie
          </h3>
          <form
            class="bg-white max-w-2xl mx-auto p-1 border rounded-lg mt-6 flex"
          >
            <div class="relative mr-2">
              <div
                class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none"
              >
                <img
                  src="../../assets/search.png"
                  alt=""
                  class="w-10 h-10 text-gray-500 dark:text-gray-400"
                />
              </div>
              <input
                type="search"
                id="default-search"
                class="block w-full p-4 ps-16 text-m text-gray-900 border border-gray-300 rounded-lg bg-gray-50"
                placeholder="Quel service recherchez . . ."
                required
              />
            </div>
            <div class="relative mr-2">
              <div
                class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none"
              >
                <img
                  src="../../assets/gps.png"
                  alt=""
                  class="w-10 h-10 text-gray-500 dark:text-gray-400"
                />
              </div>
              <input
                type="search"
                id="default-search"
                class="block w-full p-4 ps-16 text-m text-gray-900 border border-gray-300 rounded-lg bg-gray-50"
                placeholder="Adresse ?"
                required
              />
            </div>
            <div class="relative">
              <button
                type="submit"
                class="text-black font-bold block w-full p-4 pl-10 pr-10 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500"
              >
                Search
              </button>
            </div>
          </form>
        </div>
      </div>
    </section>
    <div class="flex flex-row ... -mt-8 ml-80">
      <div
        class="ml-20 shadow-xl flex flex-col rounded-lg bg-white text-surface shadow-secondary-1 dark:bg-surface-dark dark:text-white md:max-w-sm md:flex-row"
      >
        <img
          src="../../assets/briefcase.png"
          alt=""
          class="w-10 h-10 ml-6 mt-12 text-gray-500 dark:text-gray-400"
        />
        <div class="flex flex-col p-6">
          <h5 class="mb-2 text-xl font-medium">Card title</h5>
          <p class="mb-4 text-base">
            Plus de 11677 prestataires de<br />
            service partout en Tunisie.
          </p>
        </div>
      </div>
      <div
        class="ml-20 shadow-xl flex flex-col rounded-lg bg-white text-surface shadow-secondary-1 dark:bg-surface-dark dark:text-white md:max-w-sm md:flex-row"
      >
        <img
          src="../../assets/user.png"
          alt=""
          class="w-10 h-10 ml-6 mt-12 text-gray-500 dark:text-gray-400"
        />
        <div class="flex flex-col p-6">
          <h5 class="mb-2 text-xl font-medium">96.000 Clients</h5>
          <p class="mb-4 text-base">
            Plus de 96.000 clients Satisfaits<br />
            partout en Tunisie.
          </p>
        </div>
      </div>
      <div
        class="ml-20 shadow-xl flex flex-col rounded-lg bg-white text-surface shadow-secondary-1 dark:bg-surface-dark dark:text-white md:max-w-sm md:flex-row"
      >
        <img
          src="../../assets/handshake.png"
          alt=""
          class="w-10 h-10 ml-6 mt-12 text-gray-500 dark:text-gray-400"
        />
        <div class="flex flex-col p-6">
          <h5 class="mb-2 text-xl font-medium">+40.000 services livrés</h5>
          <p class="mb-4 text-base">
            Services livrés a nos clients<br />
            en toute simplicité
          </p>
        </div>
      </div>
    </div>
  </div>
</template>
