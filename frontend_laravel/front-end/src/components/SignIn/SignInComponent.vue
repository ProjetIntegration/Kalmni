<template>
  <div class="max-w-2xl mx-auto border-2 text-[#333] grid grid-cols place-content-center mt-32">
    <div class="text-center mb-10">
      <img src="../../assets/signeUp.png" alt="logo" class="w-52 inline-block " />
      <div v-if="$route.query.content"
        class="flex items-center p-4 text-sm text-green-800 rounded-lg bg-green-50 dark:bg-gray-800 dark:text-green-400"
        role="alert">
        <svg class="flex-shrink-0 inline w-4 h-4 me-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
          fill="currentColor" viewBox="0 0 20 20">
          <path
            d="M10 .5a9.5 9.5 0 1 0 9.5 9.5A9.51 9.51 0 0 0 10 .5ZM9.5 4a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3ZM12 15H8a1 1 0 0 1 0-2h1v-3H8a1 1 0 0 1 0-2h2a1 1 0 0 1 1 1v4h1a1 1 0 0 1 0 2Z" />
        </svg>
        <span class="sr-only">Info</span>

        <span class="font-medium">{{ $route.query.content }}</span>

      </div>
      <h4 class="text-base font-bold mt-3">

        Inscrivez-vous à votre compte
      </h4>
    </div>
    <form enctype="multipart/form-data" @submit.prevent="signIn()">
      <div class="flex flex-col gap-4">

        <div>
          <label class="text-sm mb-2 block" for="email">Email</label>
          <input name="email" type="email" id="email" v-model="email"
          :class="incorrect ? 'bg-red-50 border border-red-500 text-red-900 placeholder-red-700 text-sm rounded-lg focus:ring-red-500 dark:bg-gray-700 focus:border-red-500 block w-full p-4 dark:text-red-500 dark:placeholder-red-500 dark:border-red-500' : 'bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500'"

             placeholder="Enter email"
            required />
        </div>
        <div>
          <label class="text-sm mb-2 block" for="password">Mot de passe</label>
          <input name="password" type="password" id="password" v-model="password"
           :class="incorrect ? 'bg-red-50 border border-red-500 text-red-900 placeholder-red-700 text-sm rounded-lg focus:ring-red-500 dark:bg-gray-700 focus:border-red-500 block w-full p-4 dark:text-red-500 dark:placeholder-red-500 dark:border-red-500' : 'bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500'"
            placeholder="Enter password"
            required />
        </div>


        <a class="text-sm text-end font-medium text-primary-600 hover:underline dark:text-primary-500">Forgot
          password?</a>
          <p v-if="incorrect == true" class="mt-2 text-sm text-red-600 text-center dark:text-red-500"> Identifiant ou Mot de passe
            incorrect.</p>

        <div class="!mt-10 grid grid-cols-3 gap-4 mb-5 ">
          <div></div>
          <button type="submit"
            class=" min-w-[150px] py-3 px-4 text-sm font-semibold rounded text-white bg-amber-500 hover:bg-amber-600 focus:outline-none">
            Sign in
          </button>
          <div></div>

        </div>
      </div>
    </form>

  </div>
</template>

<script>
import authService from "../../service/SigneIn"
export default {

  data() {
    return {
      password: "",
      email: "",
      incorrect: false,
    }

  },
  methods: {
    signIn() {
      authService.signIn(this.email, this.password)
        .then((res) => {
          this.$router.push({ name: "home" });

          
        })
        .catch((error) => {
          console.log(error);
          this.incorrect = true;
        });
    }
  }

}

</script>
