<template>
    <div class="bg-gray-100">
      <div class="container mx-auto py-8">
        <div class="grid grid-cols-4 sm:grid-cols-12 gap-6 px-4">
          <div class="col-span-4 sm:col-span-3">
            <div class="bg-white shadow rounded-lg p-6">
              <div class="flex flex-col items-center">
                <img :src="'http://localhost:8000' + user.photo"
                  class="w-32 h-32 bg-gray-300 rounded-full mb-4 shrink-0" />
  
                <h1 class="text-xl font-bold">{{ user.nom + " " + user.prenom }}</h1>
                <p class="text-gray-700">{{ user.adresse }}</p>
              </div>
              <hr class="my-6 border-t border-gray-300" />
              <div class="flex flex-col">
                <h2 class="text-xl font-bold mb-4">About Me</h2>
                <ul>
                  <li class="mb-2">
                    <button type="button" data-twe-ripple-init data-twe-ripple-color="dark"
                      class="inline-block rounded bg-transparent px-6 pb-2 pt-2.5 text-xs font-medium uppercase leading-normal text-primary transition duration-150 ease-in-out hover:bg-neutral-100 hover:text-primary-accent-300 focus:text-primary-accent-300 focus:outline-none focus:ring-0 active:text-primary-700 motion-reduce:transition-none dark:text-secondary dark:hover:bg-secondary-900">
                      <router-link to="/profile">
                        <div class="flex items-center">
                          <img src="../../assets/list_alt_20dp_FILL0_wght400_GRAD0_opsz20.png" alt=""
                            class="w-5 h-5 mr-2" />
                          <span class="text-sm">Portfolio</span>
                        </div>
                      </router-link>
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
            <div class="bg-white shadow rounded-lg p-6">
              <h3 class="font-semibold text-center mt-3 -mb-2">Find me on</h3>
              <div class="flex justify-center items-center gap-6 my-6">
                <a class="text-gray-700 hover:text-orange-600" aria-label="Visit TrendyMinds LinkedIn" href=""
                  target="_blank">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="h-6">
                    <path fill="currentColor"
                      d="M100.28 448H7.4V148.9h92.88zM53.79 108.1C24.09 108.1 0 83.5 0 53.8a53.79 53.79 0 0 1 107.58 0c0 29.7-24.1 54.3-53.79 54.3zM447.9 448h-92.68V302.4c0-34.7-.7-79.2-48.29-79.2-48.29 0-55.69 37.7-55.69 76.7V448h-92.78V148.9h89.08v40.8h1.3c12.4-23.5 42.69-48.3 87.88-48.3 94 0 111.28 61.9 111.28 142.3V448z">
                    </path>
                  </svg>
                </a>
                <a class="text-gray-700 hover:text-orange-600" aria-label="Visit TrendyMinds YouTube" href=""
                  target="_blank">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512" class="h-6">
                    <path fill="currentColor"
                      d="M549.655 124.083c-6.281-23.65-24.787-42.276-48.284-48.597C458.781 64 288 64 288 64S117.22 64 74.629 75.486c-23.497 6.322-42.003 24.947-48.284 48.597-11.412 42.867-11.412 132.305-11.412 132.305s0 89.438 11.412 132.305c6.281 23.65 24.787 41.5 48.284 47.821C117.22 448 288 448 288 448s170.78 0 213.371-11.486c23.497-6.321 42.003-24.171 48.284-47.821 11.412-42.867 11.412-132.305 11.412-132.305s0-89.438-11.412-132.305zm-317.51 213.508V175.185l142.739 81.205-142.739 81.201z">
                    </path>
                  </svg>
                </a>
                <a class="text-gray-700 hover:text-orange-600" aria-label="Visit TrendyMinds Facebook" href=""
                  target="_blank">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" class="h-6">
                    <path fill="currentColor"
                      d="m279.14 288 14.22-92.66h-88.91v-60.13c0-25.35 12.42-50.06 52.24-50.06h40.42V6.26S260.43 0 225.36 0c-73.22 0-121.08 44.38-121.08 124.72v70.62H22.89V288h81.39v224h100.17V288z">
                    </path>
                  </svg>
                </a>
                <a class="text-gray-700 hover:text-orange-600" aria-label="Visit TrendyMinds Instagram" href=""
                  target="_blank">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="h-6">
                    <path fill="currentColor"
                      d="M224.1 141c-63.6 0-114.9 51.3-114.9 114.9s51.3 114.9 114.9 114.9S339 319.5 339 255.9 287.7 141 224.1 141zm0 189.6c-41.1 0-74.7-33.5-74.7-74.7s33.5-74.7 74.7-74.7 74.7 33.5 74.7 74.7-33.6 74.7-74.7 74.7zm146.4-194.3c0 14.9-12 26.8-26.8 26.8-14.9 0-26.8-12-26.8-26.8s12-26.8 26.8-26.8 26.8 12 26.8 26.8zm76.1 27.2c-1.7-35.9-9.9-67.7-36.2-93.9-26.2-26.2-58-34.4-93.9-36.2-37-2.1-147.9-2.1-184.9 0-35.8 1.7-67.6 9.9-93.9 36.1s-34.4 58-36.2 93.9c-2.1 37-2.1 147.9 0 184.9 1.7 35.9 9.9 67.7 36.2 93.9s58 34.4 93.9 36.2c37 2.1 147.9 2.1 184.9 0 35.9-1.7 67.7-9.9 93.9-36.2 26.2-26.2 34.4-58 36.2-93.9 2.1-37 2.1-147.8 0-184.8zM398.8 388c-7.8 19.6-22.9 34.7-42.6 42.6-29.5 11.7-99.5 9-132.1 9s-102.7 2.6-132.1-9c-19.6-7.8-34.7-22.9-42.6-42.6-11.7-29.5-9-99.5-9-132.1s-2.6-102.7 9-132.1c7.8-19.6 22.9-34.7 42.6-42.6 29.5-11.7 99.5-9 132.1-9s102.7-2.6 132.1 9c19.6 7.8 34.7 22.9 42.6 42.6 11.7 29.5 9 99.5 9 132.1s2.7 102.7-9 132.1z">
                    </path>
                  </svg>
                </a>
                <a class="text-gray-700 hover:text-orange-600" aria-label="Visit TrendyMinds Twitter" href=""
                  target="_blank">
                  <svg class="h-6" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                    <path fill="currentColor"
                      d="M459.37 151.716c.325 4.548.325 9.097.325 13.645 0 138.72-105.583 298.558-298.558 298.558-59.452 0-114.68-17.219-161.137-47.106 8.447.974 16.568 1.299 25.34 1.299 49.055 0 94.213-16.568 130.274-44.832-46.132-.975-84.792-31.188-98.112-72.772 6.498.974 12.995 1.624 19.818 1.624 9.421 0 18.843-1.3 27.614-3.573-48.081-9.747-84.143-51.98-84.143-102.985v-1.299c13.969 7.797 30.214 12.67 47.431 13.319-28.264-18.843-46.781-51.005-46.781-87.391 0-19.492 5.197-37.36 14.294-52.954 51.655 63.675 129.3 105.258 216.365 109.807-1.624-7.797-2.599-15.918-2.599-24.04 0-57.828 46.782-104.934 104.934-104.934 30.213 0 57.502 12.67 76.67 33.137 23.715-4.548 46.456-13.32 66.599-25.34-7.798 24.366-24.366 44.833-46.132 57.827 21.117-2.273 41.584-8.122 60.426-16.243-14.292 20.791-32.161 39.308-52.628 54.253z">
                    </path>
                  </svg>
                </a>
              </div>
  
              <h2 class="text-xl font-bold mt-6 mb-4">Experience</h2>
              <div v-for="projects in project" :key="projects.id">
                <p class="">
                    certificat
                  </p>
                <div class="lg:w-1/4 md:w-1/2 w-full">
                  <a class="block relative h-48 rounded overflow-hidden">
                    <img alt="ecommerce" class="object-cover object-center w-full h-full block"
                      :src="'http://localhost:8000' + projects.photo" />
                  </a>
                  <div class="mt-4">
  
                    
  
                  </div>
                </div>
  
                <div class="mb-6">
                  <div class="flex justify-between flex-wrap gap-2 w-full">
                    <span class="text-gray-700 font-bold">Description</span>
                    
                    <p>
                      <span class="text-gray-700 mr-2">Adresse : </span>
                      <span class="text-gray-700">{{ user.adresse }}</span>
                    </p>
                  </div>
                  <p class="mt-2">
                    <h2 class="text-gray-900 title-font text-lg font-medium mb-5">service :
                      {{ projects.name }}
                    </h2>
                    {{ projects.description }}
                  </p>
                </div>
              </div>
            </div>
            <!-- <div class="my-10 lg:w-[70%] md:h-[14rem] xs:w-full xs:h-[10rem]">
              <h1 class="text-xl font-bold mt-6 mb-4">My Location</h1> -->
  
              <!-- Location -->
              <!-- <iframe
                src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d252230.02028974562!2d38.613328040215286!3d8.963479542403238!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x164b85cef5ab402d%3A0x8467b6b037a24d49!2sAddis%20Ababa!5e0!3m2!1sen!2set!4v1710567234587!5m2!1sen!2set"
                class="rounded-lg w-full h-full" style="border: 0" loading="lazy"
                referrerpolicy="no-referrer-when-downgrade"></iframe> -->
            <!-- </div> -->
          </div>
        </div>
      </div>
    </div>
  </template>
  <script>
  import ProjectService from "../../service/Project"
  
  export default {
    computed: {
      user() {
  
        let x = localStorage.getItem("user")
          ? JSON.parse(localStorage.getItem("user"))
          : "";
        return x;
      },
    },
    created() {
      this.getProjectById(this.user.id)
    },
  
    data() {
      return {
        id: "",
        project: [],
  
      }
    },
    methods: {
      getProjectById(id) {
        console.log();
        ProjectService.getProjectById(id).then((res) => {
          this.project = res.data.data;
          console.log(this.project.nom);
        })
      },
    }
  }
  </script>
  