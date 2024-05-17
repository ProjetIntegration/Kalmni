<template>
  <div class="bg-gray-100">
    <div class="container mx-auto py-8">
      <div class="grid grid-cols-4 sm:grid-cols-12 gap-6 px-4">
        <div class="col-span-4 sm:col-span-3">
          <div class="bg-white shadow rounded-lg p-6">
            <div class="flex flex-col items-center">
              <img src="https://randomuser.me/api/portraits/men/94.jpg"
                class="w-32 h-32 bg-gray-300 rounded-full mb-4 shrink-0" />

              <h1 class="text-xl font-bold">John Doe</h1>
              <p class="text-gray-700">electricien</p>
            </div>
            <hr class="my-6 border-t border-gray-300" />
            <div class="flex flex-col">
              <h2 class="text-xl font-bold mb-4">About Me</h2>
              <ul>
                <li class="mb-2">
                  <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                    class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                    <div class="flex items-center">
                      <img src="../../assets/list_alt_20dp_FILL0_wght400_GRAD0_opsz20.png" alt=""
                        class="w-5 h-5 mr-2" />
                      <span class="text-sm">Portfolio</span>
                    </div>
                  </button>
                </li>
                <li class="mb-2">
                  <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                    class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                    <router-link to="/Settings">
                      <div class="flex items-center">
                        <img src="../../assets/tune_20dp_FILL0_wght400_GRAD0_opsz20.png" alt="" class="w-5 h-5 mr-2" />
                        <span class="text-sm">Settings</span>
                      </div>
                    </router-link>
                  </button>
                </li>
                <li class="mb-2">
                  <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                    class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                    <router-link to="/Acceuill">
                      <div class="flex items-center">
                        <img src="../../assets/home_20dp_FILL0_wght400_GRAD0_opsz20.png" alt="" class="w-5 h-5 mr-2" />
                        <span class="text-sm">Home</span>
                      </div>
                    </router-link>
                  </button>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div class="col-span-4 sm:col-span-9">

          <div class="max-w-md container bg-white border border-gray-200 rounded-lg mb-5 grid grid-cols-3 shadow-lg">
            <h1 class="text-2xl mt-2 ml-4 font-bold text-center text-gray-300 cursor-pointer col-span-2">
              Ajouter votre Service
            </h1>

            <button type="button" @click="add = true"
              class="text-white font-bold m-3 bg-amber-500 hover:bg-amber-600 focus:ring-4 focus:outline-none focus:ring-amber-400 rounded-lg text-sm px-4 py-2 text-center dark:bg-amber-500 dark:focus:ring-amber-500">
              Create
            </button>
            <!-- create section  -->
            <div class="relative z-10 rounded-lg" role="dialog" v-if="add == true">
              <div class="fixed inset-0 hidden bg-gray-500 bg-opacity-75 transition-opacity md:block"></div>

              <div class="fixed inset-0 z-10 w-screen overflow-y-auto  mt-20">
                <div class="flex min-h-full items-stretch justify-center text-center md:items-center md:px-2 lg:px-4">
                  <div
                    class="flex w-full transform text-left text-base transition md:my-8 md:max-w-2xl md:px-4 lg:max-w-4xl">
                    <div
                      class="relative flex items-center overflow-hidden bg-white px-4 pb-8 pt-14 shadow-2xl sm:px-6 sm:pt-8 md:p-6 lg:p-8">
                      <button type="button" @click="close()"
                        class="absolute right-4 top-4 text-gray-400 hover:text-gray-500 sm:right-6 sm:top-8 md:right-6 md:top-6 lg:right-8 lg:top-8">
                        <span class="sr-only">Close</span>
                        <svg class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor"
                          aria-hidden="true">
                          <path stroke-linecap="round" stroke-linejoin="round" d="M6 18L18 6M6 6l12 12" />
                        </svg>
                      </button>
                      <form   @submit.prevent="SaveService()" enctype="multipart/form-data"
                        class="w-200 mb-0 mt-6 space-y-4 rounded-lg p-4 shadow-lg sm:p-6 lg:p-8">
                        <p class="text-center text-lg font-medium">
                          ajouter un service
                        </p>
                        <div>
                          <label for="titre" class="relative block rounded-md border border-gray-200 shadow-sm">
                            <input type="text" v-model="title" 
                              class="w-[500px] peer border-none bg-transparent placeholder-transparent focus:border-transparent focus:outline-none focus:ring-0 p-4 pe-12"
                              placeholder="titre" />

                            <span
                              class="pointer-events-none absolute start-2.5 top-0 -translate-y-1/2 bg-white p-0.5 text-xs text-gray-700 transition-all peer-placeholder-shown:top-1/2 peer-placeholder-shown:text-sm peer-focus:top-0 peer-focus:text-xs">
                              titre du service
                            </span>
                          </label>
                        </div>
                        <div>
                          <label for="adresse" class="relative block rounded-md border border-gray-200 shadow-sm">
                            <input type="text" v-model="adress" 
                              class="w-[500px] peer border-none bg-transparent placeholder-transparent focus:border-transparent focus:outline-none focus:ring-0 p-4 pe-12"
                              placeholder="adresse" />

                            <span
                              class="pointer-events-none absolute start-2.5 top-0 -translate-y-1/2 bg-white p-0.5 text-xs text-gray-700 transition-all peer-placeholder-shown:top-1/2 peer-placeholder-shown:text-sm peer-focus:top-0 peer-focus:text-xs">
                              adresse
                            </span>
                          </label>
                        </div>
                        <div>
                          <label for="description" class="relative block rounded-md border border-gray-200 shadow-sm">
                            <textarea type="text" v-model="description" required
                              class="w-[500px] peer border-none bg-transparent placeholder-transparent focus:border-transparent focus:outline-none focus:ring-0 p-4 pe-12"
                              placeholder="description"></textarea>

                            <span
                              class="pointer-events-none absolute start-2.5 top-0 -translate-y-1/2 bg-white p-0.5 text-xs text-gray-700 transition-all peer-placeholder-shown:top-1/2 peer-placeholder-shown:text-sm peer-focus:top-0 peer-focus:text-xs">
                              description du service
                            </span>
                          </label>
                        </div>
                        <div>
                          <label for="Username" class="relative block rounded-md border border-gray-200 shadow-sm">
                            <select id="categorieses"
                              class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
                              <option selected>Choisir Categorie</option>
                              <option>1</option>
                            </select>
                          </label>
                        </div>
                        <div class="mb-3">
                          <label for="formFile" class="mb-2 inline-block text-neutral-700 dark:text-neutral-200">image
                            certificate</label>
                          <input
                            class="relative m-0 block w-full min-w-0 flex-auto rounded border border-solid border-neutral-300 bg-clip-padding px-3 py-[0.32rem] text-base font-normal text-neutral-700 transition duration-300 ease-in-out file:-mx-3 file:-my-[0.32rem] file:overflow-hidden file:rounded-none file:border-0 file:border-solid file:border-inherit file:bg-neutral-100 file:px-3 file:py-[0.32rem] file:text-neutral-700 file:transition file:duration-150 file:ease-in-out file:[border-inline-end-width:1px] file:[margin-inline-end:0.75rem] hover:file:bg-neutral-200 focus:border-primary focus:text-neutral-700 focus:shadow-te-primary focus:outline-none dark:border-neutral-600 dark:text-neutral-200 dark:file:bg-neutral-700 dark:file:text-neutral-100 dark:focus:border-primary"
                            ref="photo_certif" @change="SavePhotoCertif" type="file" id="formFile" />
                        </div>
                        <div class="mb-2">
                          <label for="formFile" class="mb-2 inline-block text-neutral-700 dark:text-neutral-200">image
                            srvice</label>
                          <input
                            class="relative m-0 block w-full min-w-0 flex-auto rounded border border-solid border-neutral-300 bg-clip-padding px-3 py-[0.32rem] text-base font-normal text-neutral-700 transition duration-300 ease-in-out file:-mx-3 file:-my-[0.32rem] file:overflow-hidden file:rounded-none file:border-0 file:border-solid file:border-inherit file:bg-neutral-100 file:px-3 file:py-[0.32rem] file:text-neutral-700 file:transition file:duration-150 file:ease-in-out file:[border-inline-end-width:1px] file:[margin-inline-end:0.75rem] hover:file:bg-neutral-200 focus:border-primary focus:text-neutral-700 focus:shadow-te-primary focus:outline-none dark:border-neutral-600 dark:text-neutral-200 dark:file:bg-neutral-700 dark:file:text-neutral-100 dark:focus:border-primary"
                           @change="SavePhoto" ref="photo_name" type="file" id="formFile"  />
                        </div>
                        <!-- date section -->
                        <div class="max-h-[200px] overflow-auto">
                          <label class="mb-2 inline-block text-neutral-900 dark:text-neutral-200 text-blond">scedule
                            service</label>
                          <section class=" grid grid-cols-3 gap-2 ">
                            <label class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">lundi</label>
                            <div date-rangepicker class="flex items-center col-span-2">
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="start" type="time" v-model="start_lundi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date start">
                              </div>
                              <span class="mx-4 text-gray-500">to</span>
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="end" type="time" v-model="end_lundi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date end">
                              </div>
                            </div>

                            <label for=""
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">mardi</label>
                            <div date-rangepicker class="flex items-center col-span-2">
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="start" type="time" v-model="start_mardi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date start">
                              </div>
                              <span class="mx-4 text-gray-500">to</span>
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="end" type="time" v-model="end_mardi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date end">
                              </div>
                            </div>

                            <label for=""
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">maredredi</label>
                            <div date-rangepicker class="flex items-center col-span-2">
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="start" type="time" v-model="start_maredredi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date start">
                              </div>
                              <span class="mx-4 text-gray-500">to</span>
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="end" type="time" v-model="end_maredredi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date end">
                              </div>
                            </div>

                            <label for=""
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">jeudi</label>
                            <div date-rangepicker class="flex items-center col-span-2">
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="start" type="time" v-model="start_jeudi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date start">
                              </div>
                              <span class="mx-4 text-gray-500">to</span>
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="end" type="time" v-model="end_jeudi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date end">
                              </div>
                            </div>

                            <label for=""
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">vendredi</label>
                            <div date-rangepicker class="flex items-center col-span-2">
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="start" type="time" v-model="start_vendredi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date start">
                              </div>
                              <span class="mx-4 text-gray-500">to</span>
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="end" type="time" v-model="end_vendredi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date end">
                              </div>
                            </div>

                            <label for=""
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">samedi</label>
                            <div date-rangepicker class="flex items-center col-span-2">
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="start" type="time" v-model="start_samedi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date start">
                              </div>
                              <span class="mx-4 text-gray-500">to</span>
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="end" type="time" v-model="end_samedi"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date end">
                              </div>
                            </div>

                            <label for=""
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">dimanche</label>
                            <div date-rangepicker class="flex items-center col-span-2">
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="start" type="time" v-model="start_dimanche"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date start">
                              </div>
                              <span class="mx-4 text-gray-500">to</span>
                              <div class="relative">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                  <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                                    xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                                    <path
                                      d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                  </svg>
                                </div>
                                <input name="end" type="time" v-model="end_dimanche"
                                  class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                  placeholder="Select date end">
                              </div>
                            </div>
                          </section>
                        </div>
                        <button type="submit"   
                          class="block w-full  rounded-lg bg-amber-400 px-5 py-3 text-sm font-medium text-white">
                          ajouter
                        </button>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="bg-white shadow rounded-lg p-6">


            <form>

              <div class="space-y-12">
                <div class="border-b border-gray-900/10 pb-12">
                  <h2 class="text-base font-semibold leading-7 text-gray-900">Profile</h2>
                  <p class="mt-1 text-sm leading-6 text-gray-600">This information will be displayed publicly so be
                    careful what you share.</p>

                  <div class="mt-10 grid grid-cols-1 gap-x-6 gap-y-8 sm:grid-cols-6">
                    <div class="sm:col-span-4">
                      <label for="username" class="block text-sm font-medium leading-6 text-gray-900">Username</label>
                      <div class="mt-2">
                        <div
                          class="flex rounded-md shadow-sm ring-1 ring-inset ring-gray-300 focus-within:ring-2 focus-within:ring-inset focus-within:ring-indigo-600 sm:max-w-md">
                          <span class="flex select-none items-center pl-3 text-gray-500 sm:text-sm">kallamni.com/</span>
                          <input type="text" name="username" id="username" autocomplete="username"
                            class="block flex-1 border-0 bg-transparent py-1.5 pl-1 text-gray-900 placeholder:text-gray-400 focus:ring-0 sm:text-sm sm:leading-6"
                            placeholder="John Doe">
                        </div>
                      </div>
                    </div>


                    <div class="col-span-full">
                      <label for="photo" class="block text-sm font-medium leading-6 text-gray-900">Photo</label>
                      <div class="mt-2 flex items-center gap-x-3">
                        <img src="https://randomuser.me/api/portraits/men/94.jpg"
                          class="w-25 h-25 bg-gray-300 rounded-full mb-4 shrink-0" />
                        <input type="file" ref="photo" id="formFile"
                          class="rounded-md bg-white px-3.5 py-2.5 text-sm font-semibold text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300   ">
                      </div>
                    </div>


                  </div>
                </div>

                <div class="border-b border-gray-900/10 pb-12">
                  <h2 class="text-base font-semibold leading-7 text-gray-900">Personal Information</h2>
                  <p class="mt-1 text-sm leading-6 text-gray-600">Use a permanent address where you can receive mail.
                  </p>

                  <div class="mt-10 grid grid-cols-1 gap-x-6 gap-y-8 sm:grid-cols-6">
                    <div class="sm:col-span-3">
                      <label for="first-name" class="block text-sm font-medium leading-6 text-gray-900">First
                        name</label>
                      <div class="mt-2">
                        <input type="text" v-model="nom" name="first-name" id="first-name" autocomplete="given-name"
                          class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                          required>
                      </div>
                    </div>

                    <div class="sm:col-span-3">
                      <label for="last-name" class="block text-sm font-medium leading-6 text-gray-900">Last name</label>
                      <div class="mt-2">
                        <input type="text" v-model="prenom" name="last-name" id="last-name" autocomplete="family-name"
                          class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                          required>
                      </div>
                    </div>

                    <div class="sm:col-span-4">
                      <label for="email" class="block text-sm font-medium leading-6 text-gray-900">Email address</label>
                      <div class="mt-2">
                        <input id="email" v-model="mail" name="email" type="email" autocomplete="email"
                          class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                          required>
                      </div>
                    </div>
                    <div class="sm:col-span-4">
                      <label for="email" class="block text-sm font-medium leading-6 text-gray-900">Password</label>
                      <div class="mt-2">
                        <input id="Password" v-model="password" name="Password" type="Password" autocomplete="Password"
                          class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                          required>
                      </div>
                    </div>
                    <div class="sm:col-span-4">
                      <label for="email" class="block text-sm font-medium leading-6 text-gray-900">Telephone Number
                      </label>
                      <div class="mt-2">

                        <input type="text" v-model="tel" name="phone" id="phone-input"
                          aria-describedby="helper-text-explanation"
                          class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500 ps-10 p-2.5"
                          placeholder="12 213 214" required />
                      </div>
                    </div>

                    <div>
                      <label class="text-sm mb-2 block" for="dob">Date de naissance</label>
                      <div class="mt-2">
                        <input class="bg-gray-100 text-sm px-4 py-3.5 rounded-md" type="date" id="dob" required>
                      </div>
                    </div>

                    <div class="sm:col-span-3">
                      <label for="country" class="block text-sm font-medium leading-6 text-gray-900">City</label>
                      <div class="mt-2">
                        <select id="country" name="country" autocomplete="country-name"
                          class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                          <option value="Tunis">Tunis</option>
                          <option value="Sfax">Sfax</option>
                          <option value="Sousse">Sousse</option>
                          <option value="Kairouan">Kairouan</option>
                          <option value="Bizerte">Bizerte</option>
                          <option value="Gabès">Gabès</option>
                          <option value="Ariana">Ariana</option>
                          <option value="Gafsa">Gafsa</option>
                          <option value="Monastir">Monastir</option>
                          <option value="Ben Arous">Ben Arous</option>
                          <option value="Kébili">Kébili</option>
                          <option value="Médenine">Médenine</option>
                          <option value="Nabeul">Nabeul</option>
                          <option value="Tataouine">Tataouine</option>
                          <option value="Beja">Beja</option>
                          <option value="Jendouba">Jendouba</option>
                          <option value="La Manouba">La Manouba</option>
                          <option value="Mahdia">Mahdia</option>
                          <option value="Sidi Bouzid">Sidi Bouzid</option>
                          <option value="Siliana">Siliana</option>
                          <option value="Zaghouan">Zaghouan</option>
                          <option value="Tozeur">Tozeur</option>
                          <option value="Kasserine">Kasserine</option>
                          <option value="Kef">Kef</option>
                        </select>
                      </div>
                    </div>

                    <div class="col-span-full">
                      <label for="street-address" class="block text-sm font-medium leading-6 text-gray-900">Street
                        address</label>
                      <div class="mt-2">
                        <input type="text" v-model="addresse" name="street-address" id="street-address"
                          autocomplete="street-address"
                          class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                          required>
                      </div>
                    </div>








                  </div>
                </div>



              </div>

              <div class="mt-6 flex items-center justify-end gap-x-6">
                <button type="button" class="text-sm font-semibold leading-6 text-gray-900">CANCEL</button>
                <button type="submit" @click="afficher()"
                  class="rounded-md bg-indigo-600 px-3 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600">UPDATE</button>
              </div>
            </form>




          </div>

        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Service from '@/service/Service';
export default {

  data() {
    return {
      nom: "",
      prenom: "",
      mail: "",
      password: "",
      addresse: "",
      tel: "",
      add: false,
      title: "",
      adress: "",
      description: "",
      photo_certif: null,
      photo: null,
      start_lundi: "",
      end_lundi: "",
      start_mardi: "",
      end_mardi: "",
      start_maredredi: "",
      end_maredredi: "",
      start_jeudi: "",
      end_jeudi: "",
      start_vendredi: "",
      end_vendredi: "",
      start_samedi: "",
      end_samedi: "",
      start_dimanche: "",
      end_dimanche: "",
      tab_schedules: []
    };
  },
  methods: {
    afficher() {
      console.log(this.nom + this.prenom + this.mail + this.password + this.adresse + this.tel)
    },
    SavePhotoCertif() {
      //console.log(this.$refs.photo_certif.files[0]);
      this.photo_certif = this.$refs.photo_certif.files[0];
    },
    SavePhoto() {
      this.photo = this.$refs.photo_name.files[0];
      console.log(this.photo);
    },
    FillTabSchedules() {
      this.tab_schedules.push(
        { jour: "lundi", heure_debut: this.start_lundi, heure_fin: this.end_lundi },
        { jour: "mardi", heure_debut: this.start_mardi, heure_fin: this.end_mardi },
        { jour: "mercredi", heure_debut: this.start_maredredi, heure_fin: this.end_maredredi },
        { jour: "jeudi", heure_debut: this.start_jeudi, heure_fin: this.end_jeudi },
        { jour: "vendredi", heure_debut: this.start_vendredi, heure_fin: this.end_vendredi },
        { jour: "samedi", heure_debut: this.start_samedi, heure_fin: this.end_samedi },
        { jour: "dimanche", heure_debut: this.start_dimanche, heure_fin: this.end_dimanche }
      );
    },
    SaveService() {
      this.FillTabSchedules();
      Service.AddService({
        nom: this.title,
        description: this.description,
        addresse: this.adress,
        photo: this.photo,
        photo_certif: this.photo_certif,
        user_id: 1,
        category_id: 1,
        tab_schedules: this.tab_schedules
      }).then((res) => {
        console.log(res);
      })
    },
    close() {
      this.add = false;
    },
  },
};
</script>