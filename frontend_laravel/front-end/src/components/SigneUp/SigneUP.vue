<template>
  <div class="">
    <div class="max-w-7xl mx-auto border-2 font-[sans-serif] text-[#333] pl-10 pr-10 pb-10 mt-32">
      <div class="text-center mb-10">
        <a href="javascript:void(0)"><img src="../../assets/signeUp.png" alt="logo" class="w-52 inline-block" />
        </a>
        <h4 class="text-base font-bold px-30 mt-3">

          Inscrivez-vous à votre compte
        </h4>
      </div>
      <form @submit.prevent="signUp()" enctype="multipart/form-data">
        <div class="grid sm:grid-cols-2 gap-y-7 gap-x-12">
          <div>
            <label class="text-sm mb-2 block" for="name">Nom</label>
            <input v-model="form.nom" name="name" type="text" id="name"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter name"
              required />
          </div>
          <div>
            <label class="text-sm mb-2 block" for="lname">Prenom</label>
            <input v-model="form.prenom" name="lname" type="text" id="lname"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter last name"
              required />
          </div>
          <div>
            <label class="text-sm mb-2 block" for="email">Email</label>
            <input v-model="form.email" name="email" type="email" id="email"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter email"
              required />
          </div>
          <div class="relative">
            <label for="phone-input" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Numero du
              telephone :</label>
            <div class="absolute inset-y-0 start-0 top-0 flex items-center ps-3.5 pointer-events-none">
              <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 19 18">
                <path
                  d="M18 13.446a3.02 3.02 0 0 0-.946-1.985l-1.4-1.4a3.054 3.054 0 0 0-4.218 0l-.7.7a.983.983 0 0 1-1.39 0l-2.1-2.1a.983.983 0 0 1 0-1.389l.7-.7a2.98 2.98 0 0 0 0-4.217l-1.4-1.4a2.824 2.824 0 0 0-4.218 0c-3.619 3.619-3 8.229 1.752 12.979C6.785 16.639 9.45 18 11.912 18a7.175 7.175 0 0 0 5.139-2.325A2.9 2.9 0 0 0 18 13.446Z" />
              </svg>
            </div>
            <input type="text"  name="phone" id="phone-input" aria-describedby="helper-text-explanation"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500 ps-10 p-2.5"
              placeholder="12 213 214" required />
            <p id="helper-text-explanation" class="mt-2 text-sm text-gray-500 dark:text-gray-400">Sélectionnez un numéro
              de téléphone qui correspond au format.</p>
          </div>
          <div>
            <label class="text-sm mb-2 block" for="password">Mot de passe</label>
            <input v-model="form.password" name="password" type="password" id="password"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter password"
              required />
          </div>
          <div class='w-full mb-6'>
            <label class="text-sm mb-2 block" for="confirm-password">Confirmer Mot de passe</label>
            <label class='block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2'
              :class="{ 'text-green-700 dark:text-green-500': passwordsMatch == true, 'text-red-700 dark:text-red-500': passwordsMatch == false }"
              for='confirm-password'></label>
            <input v-model="confirmPassword" class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              :class="{ 'border-green-500 text-green-900 dark:text-green-400 placeholder-green-700 dark:placeholder-green-500 text-sm rounded-lg focus:ring-green-500 focus:border-green-500 block w-full p-2.5 dark:bg-gray-700 dark:border-green-500': passwordsMatch == true, 'border-red-500 text-red-900 placeholder-red-700 text-sm rounded-lg focus:ring-red-500 dark:bg-gray-700 focus:border-red-500 block w-full p-2.5 dark:text-red-500 dark:placeholder-red-500 dark:border-red-500': passwordsMatch == false }"
              id='confirm-password' type='password' placeholder='Enter confirmer mot de passe' required>
            <p v-if="passwordsMatch == false" class="mt-2 text-sm text-red-600 dark:text-red-500"> Mot de
              passe incorrect.</p>
          </div>
          <div>
            <label class="text-sm mb-2 block" for="dob">Date de naissance</label>
            <input  class="bg-gray-100 text-sm px-4 py-3.5 rounded-md" type="date" id="dob" required>
          </div>
          <div class="w-80">
            <label class="text-sm mb-2 block">Selecter Role</label>
            <div class="flex items-center ps-4 border border-gray-200 rounded dark:border-gray-700">
              <input id="bordered-radio-1" type="radio" value="Client" name="bordered-radio" @change="CheckRole()"
                v-model="SelectedRole"
                class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
              <label for="bordered-radio-1"
                class="w-full py-4 ms-2 text-sm font-medium text-gray-900 dark:text-gray-300">Client</label>
              <input id="bordered-radio-1" type="radio" value="Prestetaire" v-model="SelectedRole" @change="CheckRole()"
                name="bordered-radio"
                class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
              <label for="bordered-radio-1"
                class="w-full py-4 ms-2 text-sm font-medium text-gray-900 dark:text-gray-300">Prestetaire</label>
            </div>
            <!-- <div class="flex items-center ps-4 border border-gray-200 rounded dark:border-gray-700">
                <input checked id="bordered-radio-2" type="radio" value="" name="bordered-radio"
                  class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
                <label for="bordered-radio-2"
                  class="w-full py-4 ms-2 text-sm font-medium text-gray-900 dark:text-gray-300">Checked state</label>
              </div> -->


          </div>
          <div>
            <div class="mt-2 flex items-center gap-x-3">
              <svg class="h-12 w-12 text-gray-300" viewBox="0 0 24 24" fill="currentColor" aria-hidden="true">
                <path fill-rule="evenodd"
                  d="M18.685 19.097A9.723 9.723 0 0021.75 12c0-5.385-4.365-9.75-9.75-9.75S2.25 6.615 2.25 12a9.723 9.723 0 003.065 7.097A9.716 9.716 0 0012 21.75a9.716 9.716 0 006.685-2.653zm-12.54-1.285A7.486 7.486 0 0112 15a7.486 7.486 0 015.855 2.812A8.224 8.224 0 0112 20.25a8.224 8.224 0 01-5.855-2.438zM15.75 9a3.75 3.75 0 11-7.5 0 3.75 3.75 0 017.5 0z"
                  clip-rule="evenodd" />
              </svg>
              <label for="file-upload"
                class="relative cursor-pointer rounded-md bg-white font-semibold text-amber-600 focus-within:outline-none focus-within:ring-2 focus-within:ring-amber-600 focus-within:ring-offset-2 hover:text-amber-500">
                <span>ajouter une photo</span>
                <input @change="saveImage()" id="file-upload" name="file-upload" type="file" class="sr-only"
                  ref="photo" />
              </label>
            </div>
          </div>
        </div>
        <div class="!mt-10 grid grid-cols-3 gap-4 ">
          <div></div>
          <button type="subbmit"
            class="place-self-auto min-w-[150px] py-3 px-4 text-sm font-semibold rounded text-white bg-amber-500 hover:bg-amber-600 focus:outline-none">
            Sign up
          </button>
          <div></div>
        </div>
      </form>
      <!-- create section  -->
      <div class="relative z-10 rounded-lg" role="dialog" v-if="add == true">
        <div class="fixed inset-0 hidden bg-gray-500 bg-opacity-75 transition-opacity md:block"></div>

        <div class="fixed inset-0 z-10 w-screen overflow-y-auto  mt-20">
          <div class="flex min-h-full items-stretch justify-center text-center md:items-center md:px-2 lg:px-4">
            <div class="flex w-full transform text-left text-base transition md:my-8 md:max-w-2xl md:px-4 lg:max-w-4xl">
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
                <form enctype="multipart/form-data"
                  class="w-200 mb-0 mt-6 space-y-4 rounded-lg p-4 shadow-lg sm:p-6 lg:p-8">
                  <p class="text-center text-lg font-medium">
                    ajouter un service
                  </p>
                  <div>
                    <label for="titre" class="relative block rounded-md border border-gray-200 shadow-sm">
                      <input type="text" v-model="title" required
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
                      <input type="text" v-model="title" required
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
                  <div class="mb-3">
                    <label for="formFile" class="mb-2 inline-block text-neutral-700 dark:text-neutral-200">image
                      certificate</label>
                    <input
                      class="relative m-0 block w-full min-w-0 flex-auto rounded border border-solid border-neutral-300 bg-clip-padding px-3 py-[0.32rem] text-base font-normal text-neutral-700 transition duration-300 ease-in-out file:-mx-3 file:-my-[0.32rem] file:overflow-hidden file:rounded-none file:border-0 file:border-solid file:border-inherit file:bg-neutral-100 file:px-3 file:py-[0.32rem] file:text-neutral-700 file:transition file:duration-150 file:ease-in-out file:[border-inline-end-width:1px] file:[margin-inline-end:0.75rem] hover:file:bg-neutral-200 focus:border-primary focus:text-neutral-700 focus:shadow-te-primary focus:outline-none dark:border-neutral-600 dark:text-neutral-200 dark:file:bg-neutral-700 dark:file:text-neutral-100 dark:focus:border-primary"
                      ref="photo" type="file" id="formFile" required />
                  </div>

                  <div class="mb-2">
                    <label for="formFile" class="mb-2 inline-block text-neutral-700 dark:text-neutral-200">image
                      srvice</label>
                    <input
                      class="relative m-0 block w-full min-w-0 flex-auto rounded border border-solid border-neutral-300 bg-clip-padding px-3 py-[0.32rem] text-base font-normal text-neutral-700 transition duration-300 ease-in-out file:-mx-3 file:-my-[0.32rem] file:overflow-hidden file:rounded-none file:border-0 file:border-solid file:border-inherit file:bg-neutral-100 file:px-3 file:py-[0.32rem] file:text-neutral-700 file:transition file:duration-150 file:ease-in-out file:[border-inline-end-width:1px] file:[margin-inline-end:0.75rem] hover:file:bg-neutral-200 focus:border-primary focus:text-neutral-700 focus:shadow-te-primary focus:outline-none dark:border-neutral-600 dark:text-neutral-200 dark:file:bg-neutral-700 dark:file:text-neutral-100 dark:focus:border-primary"
                      ref="photo" type="file" id="formFile" />
                  </div>
                  <!-- date section -->
                  <div class="max-h-[200px] overflow-auto">
                    <label 
                      class="mb-2 inline-block text-neutral-900 dark:text-neutral-200 text-blond">scedule
                      service</label>
                    <section class=" grid grid-cols-3 gap-2 ">
                      <label
                        class="mb-2 inline-block text-neutral-700 dark:text-neutral-200 mr-3">lundi</label>
                      <div date-rangepicker class="flex items-center col-span-2">

                        <div class="relative">
                          <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                            <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                              xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 20 20">
                              <path
                                d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                            </svg>
                          </div>
                          <input name="start" type="time"
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
                          <input name="end" type="time"
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
                          <input name="start" type="time"
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
                          <input name="end" type="time"
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
                          <input name="start" type="time"
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
                          <input name="end" type="time"
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
                          <input name="start" type="time"
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
                          <input name="end" type="time"
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
                          <input name="start" type="time"
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
                          <input name="end" type="time"
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
                          <input name="start" type="time"
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
                          <input name="end" type="time"
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
                          <input name="start" type="time"
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
                          <input name="end" type="time"
                            class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                            placeholder="Select date end">
                        </div>
                      </div>
                    </section>
                  </div>
                  <!-- end of date section -->

                  <button type="submit"
                    class="block w-full rounded-lg bg-amber-400 px-5 py-3 text-sm font-medium text-white">
                    ajouter
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- end of creat section  -->

    </div>

  </div>
</template>
<script>
import signUpService from "../../router/SignUp"

import { required, minLength, maxLength, numeric, email } from "vuelidate/lib/validators"

export default {

  validations: {
    form: {
      nom: {
        required,
        minlength: minLength(3),
        maxLength: maxLength(10)
      },
      prenom: {
        required,
        minlength: minLength(3),
        maxLength: maxLength(10)
      },
      tel: {
        required,
        numeric,
        minlength: minLength(8),
        maxLength: maxLength(8)
      },
      password: {
        required,
        minLength: minLength(6),
        maxLength: maxLength(10),
        containsUppercase: function (value) {
          return /[A-Z]/.test(value);
        },
        containsLowercase: function (value) {
          return /[a-z]/.test(value);
        },
        containsNumber: function (value) {
          return /[0-9]/.test(value);
        },
        containsSpecial: function (value) {
          return /[#?!@$%^&*-]/.test(value);
        }
      },
      photo: {
        typeFile(val) {
          if (val === "") {
            return true;
          };
          const regex = new RegExp('\.(gif|jpe?g|svg|png)$');
          return regex.test(val.type);
        }
      },
      email: {
        required,
        email,
        async exist(val) {
          if (val == "") {
            return true;
          }
          const response = await service_info.TestExistEmail(val);
          return response.data.success;
        }
      },
      adresse: {
        required,
        minLength: minLength(5),
        maxLength: maxLength(50),
      },
      date: {

        required: true,
        customValidation(value) {
          // Check if the value is a valid date format (YYYY-MM-DD)
          const regex = /^\d{4}-\d{2}-\d{2}$/;
          if (!regex.test(value)) {
            return "Date must be in the format YYYY-MM-DD";
          }

          // Check if the date is a valid date
          const parts = value.split("-");
          const year = parseInt(parts[0], 10);
          const month = parseInt(parts[1], 10) - 1; // Month is zero-based
          const day = parseInt(parts[2], 10);
          const date = new Date(year, month, day);

          if (
            isNaN(date.getTime()) ||
            date.getFullYear() !== year ||
            date.getMonth() !== month ||
            date.getDate() !== day
          ) {
            return "Invalid date";
          }

          return true; // Validation passed
        }
      }

    },
    classe_id: {
      required
    },
    specialite_id: {
      required
    }
  },
  data() {
    return {
      add: false,
      SelectedRole: "",
      form: {
        nom: "",
        prenom: "",
        email: "",
        password: "",
        photo: "",
        tel: "",
        adresse: "",
        date: ""
      },
      ServicePres: {

      }
    }
  },
  mounted() {
    this.formatPhoneNumber();
  },

  methods: {
    formatPhoneNumber() {
      document.getElementById('phone-input').addEventListener('input', function (e) {
        let x = e.target.value.replace(/\D/g, '').match(/(\d{0,2})(\d{0,3})(\d{0,3})/);
        e.target.value = !x[2] ? x[1] : x[1] + ' ' + x[2] + (x[3] ? ' ' + x[3] : '');
      });
    },
    close() {
      this.add = false;
    },

    CheckRole() {
      if (this.SelectedRole == "Prestetaire") {
        console.log(this.SelectedRole);
        this.add = true
      }
    },
    saveImage() {
      this.form.photo = this.$refs.photo.files[0];
      this.$v.form.photo.$touch();
    },
    signUp() {
      // this.$v.form.$touch();
      // if (this.$v.form.$invalid) {
      //   this.loading = false;
      //   return;
      // }
      this.loading = true;
      signUpService.signUp({
        "nom": this.form.nom,
        "prenom": this.form.prenom,
        "email": this.form.email,
        "tel": this.form.tel,
        "password": this.form.password,
        "adresse": "dsfqsqsgsfsf",
        // "adresse": this.form.adresse,
        // "date": this.form.date,
        "photo": this.form.photo,
      }).then((res) => {
        this.form.nom = "";
        this.form.prenom = "";
        this.form.email = "";
        this.form.tel = "";
        this.form.password = "";
        this.form.adresse = "";
        // this.form.date = "";
        this.form.photo = "";
        this.$router.push({ name: "signin", query: { content: "Register successfully" } });
      }).catch((error) => {
        this.loading = false;
        console.log(error);
      })
    },


  }
}


</script>
