<template>
  <div>
    <div class="max-w-7xl mx-auto border-2 font-[sans-serif] text-[#333] pl-10 pr-10 pb-10 mt-30">
      <div class="text-center mb-10">
        <a href="javascript:void(0)"><img src="../../assets/signeUp.png" alt="logo" class="w-52 inline-block" />
        </a>
        <h4 class="text-base font-bold px-30 mt-3">
          Sign up into your account
        </h4>
      </div>
      <form @submit.prevent="signUp()" enctype="multipart/form-data">
        <div class="grid sm:grid-cols-2 gap-y-7 gap-x-12">
          <div>
            <label class="text-sm mb-2 block">First Name</label>
            <input v-model="form.nom" name="name" type="text"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter name" />
          </div>
          <div>
            <label class="text-sm mb-2 block">Last Name</label>
            <input v-model="form.prenom" name="lname" type="text"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter last name" />
          </div>
          <div>
            <label class="text-sm mb-2 block">Email Id</label>
            <input v-model="form.email" name="email" type="text"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500" placeholder="Enter email" />
          </div>
          <div class="relative">
            <label for="phone-input" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Phone
              number:</label>
            <div class="absolute inset-y-0 start-0 top-0 flex items-center ps-3.5 pointer-events-none">
              <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 19 18">
                <path
                  d="M18 13.446a3.02 3.02 0 0 0-.946-1.985l-1.4-1.4a3.054 3.054 0 0 0-4.218 0l-.7.7a.983.983 0 0 1-1.39 0l-2.1-2.1a.983.983 0 0 1 0-1.389l.7-.7a2.98 2.98 0 0 0 0-4.217l-1.4-1.4a2.824 2.824 0 0 0-4.218 0c-3.619 3.619-3 8.229 1.752 12.979C6.785 16.639 9.45 18 11.912 18a7.175 7.175 0 0 0 5.139-2.325A2.9 2.9 0 0 0 18 13.446Z" />
              </svg>
            </div>
            <input v-model="form.tel" type="text" id="phone-input" aria-describedby="helper-text-explanation"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500 ps-10 p-2.5 "
              pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" placeholder="123-456-7890" required />
            <p id="helper-text-explanation" class="mt-2 text-sm text-gray-500 dark:text-gray-400">Select a phone number
              that matches the format.</p>
          </div>

          <div>
            <label class="text-sm mb-2 block">Password</label>
            <input v-model="form.password" name="password" type="password"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter password" />
          </div>
          <div>
            <label class="text-sm mb-2 block">Select Role</label>
            <div class="flex items-center ps-4 border border-gray-200 rounded dark:border-gray-700">
              <input id="bordered-radio-1" type="radio" value="Client" name="bordered-radio"  @change="CheckRole()" v-model="SelectedRole"
                class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
              <label for="bordered-radio-1"
                class="w-full py-4 ms-2 text-sm font-medium text-gray-900 dark:text-gray-300">Client</label>
                <input id="bordered-radio-1" type="radio" value="Prestetaire" v-model="SelectedRole" @change="CheckRole()" name="bordered-radio"
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
        </div>
        <div class="grid grid-cols-1 gap-4 sm:grid-cols-2 mt-5">
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
        <div class="!mt-10">
          <button type="subbmit"
            class="min-w-[150px] py-3 px-4 text-sm font-semibold rounded text-white bg-amber-500 hover:bg-amber-600 focus:outline-none">
            Sign up
          </button>
        </div>
      </form>

    </div>


    <!-- Modal toggle -->


    <!-- Main modal -->
    <div id="select-modal"
      class="top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full">
      <div class="relative p-4 w-full max-w-md max-h-full">
        <!-- Modal content -->
        <div class="relative bg-white rounded-lg shadow dark:bg-gray-700">
          <!-- Modal header -->
          <div class="flex items-center justify-between p-4 md:p-5 border-b rounded-t dark:border-gray-600">
            <h3 class="text-lg font-semibold text-gray-900 dark:text-white">
              Open positions
            </h3>
            <button type="button"
              class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm h-8 w-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
              data-modal-toggle="select-modal">
              <svg class="w-3 h-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none"
                viewBox="0 0 14 14">
                <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                  d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6" />
              </svg>
              <span class="sr-only">Close modal</span>
            </button>
          </div>
          <!-- Modal body -->
          <div class="p-4 md:p-5">
            <p class="text-gray-500 dark:text-gray-400 mb-4">Select your desired position:</p>
            <ul class="space-y-4 mb-4">
              <li>
                <input type="radio" id="job-1" name="job" value="job-1" class="hidden peer" required />
                <label for="job-1"
                  class="inline-flex items-center justify-between w-full p-5 text-gray-900 bg-white border border-gray-200 rounded-lg cursor-pointer dark:hover:text-gray-300 dark:border-gray-500 dark:peer-checked:text-blue-500 peer-checked:border-blue-600 peer-checked:text-blue-600 hover:text-gray-900 hover:bg-gray-100 dark:text-white dark:bg-gray-600 dark:hover:bg-gray-500">
                  <div class="block">
                    <div class="w-full text-lg font-semibold">UI/UX Engineer</div>
                    <div class="w-full text-gray-500 dark:text-gray-400">Flowbite</div>
                  </div>
                  <svg class="w-4 h-4 ms-3 rtl:rotate-180 text-gray-500 dark:text-gray-400" aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                      d="M1 5h12m0 0L9 1m4 4L9 9" />
                  </svg>
                </label>
              </li>
              <li>
                <input type="radio" id="job-2" name="job" value="job-2" class="hidden peer">
                <label for="job-2"
                  class="inline-flex items-center justify-between w-full p-5 text-gray-900 bg-white border border-gray-200 rounded-lg cursor-pointer dark:hover:text-gray-300 dark:border-gray-500 dark:peer-checked:text-blue-500 peer-checked:border-blue-600 peer-checked:text-blue-600 hover:text-gray-900 hover:bg-gray-100 dark:text-white dark:bg-gray-600 dark:hover:bg-gray-500">
                  <div class="block">
                    <div class="w-full text-lg font-semibold">React Developer</div>
                    <div class="w-full text-gray-500 dark:text-gray-400">Alphabet</div>
                  </div>
                  <svg class="w-4 h-4 ms-3 rtl:rotate-180 text-gray-500 dark:text-gray-400" aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                      d="M1 5h12m0 0L9 1m4 4L9 9" />
                  </svg>
                </label>
              </li>
              <li>
                <input type="radio" id="job-3" name="job" value="job-3" class="hidden peer">
                <label for="job-3"
                  class="inline-flex items-center justify-between w-full p-5 text-gray-900 bg-white border border-gray-200 rounded-lg cursor-pointer dark:hover:text-gray-300 dark:border-gray-500 dark:peer-checked:text-blue-500 peer-checked:border-blue-600 peer-checked:text-blue-600 hover:text-gray-900 hover:bg-gray-100 dark:text-white dark:bg-gray-600 dark:hover:bg-gray-500">
                  <div class="block">
                    <div class="w-full text-lg font-semibold">Full Stack Engineer</div>
                    <div class="w-full text-gray-500 dark:text-gray-400">Apple</div>
                  </div>
                  <svg class="w-4 h-4 ms-3 rtl:rotate-180 text-gray-500 dark:text-gray-400" aria-hidden="true"
                    xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 10">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                      d="M1 5h12m0 0L9 1m4 4L9 9" />
                  </svg>
                </label>
              </li>
            </ul>
            <button
              class="text-white inline-flex w-full justify-center bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
              Next step
            </button>
          </div>
        </div>
      </div>
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
      SelectedRole:"",
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
      ServicePres:{
        
      }
    }
  },

  methods: {
    CheckRole(){
      if(this.SelectedRole=="Prestetaire"){
        console.log(this.SelectedRole);
      }
    },
    saveImage() {
      this.form.photo = this.$refs.photo.files[0];
      this.$v.form.photo.$touch();
    },
    signUp() {
      this.$v.form.$touch();
      if (this.$v.form.$invalid) {
        this.loading = false;
        return;
      }
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
