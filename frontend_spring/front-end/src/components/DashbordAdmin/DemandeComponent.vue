<template>
    <div>
     <header class="bg-gray-50 shadow">
      <div class="mx-auto max-w-7xl py-8 sm:px-6">
        <div class="flex items-center gap-4">
          <h1 class="text-3xl font-bold tracking-tight text-gray-900">
            demande
          </h1>
        </div>
      </div>
    </header>
    <div class="divide-y-4 divide-slate-400/25 ...">
      <ul role="list" class="mx-auto max-w-7xl">
        <li class="flex justify-between gap-x-6 py-5">
          <div class="flex min-w-0 gap-x-4">
            <img
              class="h-12 w-12 flex-none rounded-full bg-gray-50"
              src="../../assets/iheb.png"
            />
            <div class="min-w-0 flex-auto">
              <button>
                <p class="text-sm font-semibold leading-6 text-gray-900">
                  iheb sessi
                </p>
              </button>
              <p class="mt-1 truncate text-xs leading-5 text-gray-500">
                MoujahedLyna@gamil.com
              </p>
            </div>
          </div>
          <div
            class="inline-flex rounded-lg border border-gray-100 bg-gray-100 p-1"
          >
            <button
            type="button"
                @click="add = true"
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

              Consulter
            </button>
            <div
                class="relative z-10 rounded-lg"
                role="dialog"
                v-if="add == true"
              >
                <div
                  class="fixed inset-0 hidden bg-gray-500 bg-opacity-75 transition-opacity md:block"
                ></div>

                <div class="fixed inset-0 z-10 w-screen overflow-y-auto">
                  <div
                    class="flex min-h-full items-stretch justify-center text-center md:items-center md:px-2 lg:px-4"
                  >
                    <div
                      class="flex w-full transform text-left text-base transition md:my-8 md:max-w-2xl md:px-4 lg:max-w-4xl"
                    >
                      <div
                        class="relative flex items-center overflow-hidden bg-white px-4 pb-8 pt-14 shadow-2xl sm:px-6 sm:pt-8 md:p-6 lg:p-8"
                      >
                        <button
                          type="button"
                          @click="close()"
                          class="absolute right-4 top-4 text-gray-400 hover:text-gray-500 sm:right-6 sm:top-8 md:right-6 md:top-6 lg:right-8 lg:top-8"
                        >
                          <span class="sr-only">Close</span>
                          <svg
                            class="h-6 w-6"
                            fill="none"
                            viewBox="0 0 24 24"
                            stroke-width="1.5"
                            stroke="currentColor"
                            aria-hidden="true"
                          >
                            <path
                              stroke-linecap="round"
                              stroke-linejoin="round"
                              d="M6 18L18 6M6 6l12 12"
                            />
                          </svg>
                        </button>
                        <form
                          enctype="multipart/form-data"
                          class="w-200 mb-0 mt-6 space-y-4 rounded-lg p-4 shadow-lg sm:p-6 lg:p-8"
                        >
                          <p class="text-center text-lg font-medium">
                            cree une poste
                          </p>
                          <div>
                            <label
                              for="Username"
                              class="relative block rounded-md border border-gray-200 shadow-sm"
                            >
                              <input
                                type="text"
                                class="w-[500px] peer border-none bg-transparent placeholder-transparent focus:border-transparent focus:outline-none focus:ring-0 p-4 pe-12"
                                placeholder="Username"
                              />

                              <span
                                class="pointer-events-none absolute start-2.5 top-0 -translate-y-1/2 bg-white p-0.5 text-xs text-gray-700 transition-all peer-placeholder-shown:top-1/2 peer-placeholder-shown:text-sm peer-focus:top-0 peer-focus:text-xs"
                              >
                                titre du publication
                              </span>
                            </label>
                          </div>
                          <div>
                            <label
                              for="description"
                              class="relative block rounded-md border border-gray-200 shadow-sm"
                            >
                              <textarea
                                type="text"
                                class="w-[500px] peer border-none bg-transparent placeholder-transparent focus:border-transparent focus:outline-none focus:ring-0 p-4 pe-12"
                                placeholder="description"
                              ></textarea>

                              <span
                                class="pointer-events-none absolute start-2.5 top-0 -translate-y-1/2 bg-white p-0.5 text-xs text-gray-700 transition-all peer-placeholder-shown:top-1/2 peer-placeholder-shown:text-sm peer-focus:top-0 peer-focus:text-xs"
                              >
                                description du publication
                              </span>
                            </label>
                          </div>
                          <!-- TW Elements is free under AGPL, with commercial license required for specific uses. See more details: https://tw-elements.com/license/ and contact us for queries at tailwind@mdbootstrap.com -->
                          <div class="mb-3">
                            <label
                              for="formFile"
                              class="mb-2 inline-block text-neutral-700 dark:text-neutral-200"
                              >image</label
                            >
                            <input
                              class="relative m-0 block w-full min-w-0 flex-auto rounded border border-solid border-neutral-300 bg-clip-padding px-3 py-[0.32rem] text-base font-normal text-neutral-700 transition duration-300 ease-in-out file:-mx-3 file:-my-[0.32rem] file:overflow-hidden file:rounded-none file:border-0 file:border-solid file:border-inherit file:bg-neutral-100 file:px-3 file:py-[0.32rem] file:text-neutral-700 file:transition file:duration-150 file:ease-in-out file:[border-inline-end-width:1px] file:[margin-inline-end:0.75rem] hover:file:bg-neutral-200 focus:border-primary focus:text-neutral-700 focus:shadow-te-primary focus:outline-none dark:border-neutral-600 dark:text-neutral-200 dark:file:bg-neutral-700 dark:file:text-neutral-100 dark:focus:border-primary"
                              ref="photo"
                              type="file"
                              id="formFile"
                            />
                          </div>
                          <button
                            class="block w-full rounded-lg bg-amber-400 px-5 py-3 text-sm font-medium text-white"
                            type="button"
                            @click="add()"
                          >
                            Accepter
                          </button>
                          <button
                            class="block w-full rounded-lg bg-amber-400 px-5 py-3 text-sm font-medium text-white"
                            type="button"
                            @click="add()"
                          >
                            Supprimer
                          </button>
                        </form>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          
        </li>
      </ul>
      <ul role="list" class="mx-auto max-w-7xl divide-y divide-dashed">
        <li class="flex justify-between gap-x-6 py-5">
          <div class="flex min-w-0 gap-x-4">
            <img
              class="h-12 w-12 flex-none rounded-full bg-gray-50"
              src="../../assets/lyna.jpg"
            />
            <div class="min-w-0 flex-auto">
              <button>
                <p class="text-sm font-semibold leading-6 text-gray-900">
                  Moujahed Lyna
                </p>
              </button>
              <p class="mt-1 truncate text-xs leading-5 text-gray-500">
                MoujahedLyna@gamil.com
              </p>            </div>
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

              Consulter
            </button>

          </div>
        </li>
      </ul>
      <ul role="list" class="mx-auto max-w-7xl divide-y divide-dashed">
        <li class="flex justify-between gap-x-6 py-5">
          <div class="flex min-w-0 gap-x-4">
            <img
              class="h-12 w-12 flex-none rounded-full bg-gray-50"
              src="../../assets/wessim.jpg"
            />
            <div class="min-w-0 flex-auto">
              <button>
                <p class="text-sm font-semibold leading-6 text-gray-900">
                  Mohamed Wessim Saidai
                </p>
              </button>
              <p class="mt-1 truncate text-xs leading-5 text-gray-500">
                WessimSaidani@gamil.com
              </p>
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

              Consulter
            </button>
          </div>
        </li>
      </ul>
    </div>
    </div>
</template>
<script>
export default {
  components: {
  },
  data() {
    return {
      add: false,
    };
  },
  methods: {
    
    close() {
      this.add = false;
    },
  },
};
</script>