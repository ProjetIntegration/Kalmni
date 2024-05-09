<template>
  <div class="max-w-2xl mx-auto border-2 text-[#333] grid grid-cols place-content-center mt-32">
    <div class="text-center mb-10">
      <a href="javascript:void(0)"><img src="../../assets/signeUp.png" alt="logo" class="w-52 inline-block " />
      </a>
      <h4 class="text-base font-bold mt-3">

        Inscrivez-vous à votre compte
      </h4>
    </div>
    <form enctype="multipart/form-data" @submit.prevent="signIn()">
      <div class="flex flex-col gap-4">

        <div>
          <label class="text-sm mb-2 block" for="email">Email</label>
          <input name="email" type="email" id="email" v-model="email"
            class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter email"
            required />
        </div>
        <div>
          <label class="text-sm mb-2 block" for="password">Mot de passe</label>
          <input name="password" type="password" id="password" v-model="password"
            class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter password"
            required />
        </div>


        <a class="text-sm text-end font-medium text-primary-600 hover:underline dark:text-primary-500">Forgot
          password?</a>

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
    }

  },
  methods: {
    signIn() {
      authService.signIn(this.email, this.password).then((res) => {

        this.$router.push({ name: "home" });



      }).catch((error) => {
        console.log(error);
        this.incorrect = true;
      })
    }
  }
}

</script>
