<template>
  <div>
    <div
      class="max-w-7xl mx-auto border-2 font-[sans-serif] text-[#333] pl-10 pr-10 pb-10 mt-10"
    >
      <div class="text-center mb-5">
        <a href="javascript:void(0)"
          ><img
            src="../../assets/signeUp.png"
            alt="logo"
            class="w-52 inline-block"
          />
        </a>
        <h4 class="text-base font-bold px-30 mt-3">
          Sign up into your account
        </h4>
      </div>
      <form>
        <div class="grid sm:grid-cols-2 gap-y-7 gap-x-12">
          <div>
            <label class="text-sm mb-2 block">First Name</label>
            <input
              name="name"
              type="text"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter name"
            />
          </div>
          <div>
            <label class="text-sm mb-2 block">Last Name</label>
            <input
              name="lname"
              type="text"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter last name"
            />
          </div>
          <div>
            <label class="text-sm mb-2 block">Email Id</label>
            <input
              name="email"
              type="text"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter email"
            />
          </div>
          <div>
            <label class="text-sm mb-2 block">Mobile No.</label>
            <input
              name="number"
              type="number"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter mobile number"
            />
          </div>
          <div>
            <label class="text-sm mb-2 block">Password</label>
            <input
              name="password"
              type="password"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter password"
            />
          </div>
          <div>
            <label class="text-sm mb-2 block">Confirm Password</label>
            <input
              name="cpassword"
              type="password"
              class="bg-gray-100 w-full text-sm px-4 py-3.5 rounded-md outline-amber-500"
              placeholder="Enter confirm password"
            />
          </div>
        </div>
        <div class="grid grid-cols-1 gap-4 sm:grid-cols-2 mt-5">
          <div class="mt-2 flex items-center gap-x-3">
            <svg
              class="h-12 w-12 text-gray-300"
              viewBox="0 0 24 24"
              fill="currentColor"
              aria-hidden="true"
            >
              <path
                fill-rule="evenodd"
                d="M18.685 19.097A9.723 9.723 0 0021.75 12c0-5.385-4.365-9.75-9.75-9.75S2.25 6.615 2.25 12a9.723 9.723 0 003.065 7.097A9.716 9.716 0 0012 21.75a9.716 9.716 0 006.685-2.653zm-12.54-1.285A7.486 7.486 0 0112 15a7.486 7.486 0 015.855 2.812A8.224 8.224 0 0112 20.25a8.224 8.224 0 01-5.855-2.438zM15.75 9a3.75 3.75 0 11-7.5 0 3.75 3.75 0 017.5 0z"
                clip-rule="evenodd"
              />
            </svg>
            <label
              for="file-upload"
              class="relative cursor-pointer rounded-md bg-white font-semibold text-amber-600 focus-within:outline-none focus-within:ring-2 focus-within:ring-amber-600 focus-within:ring-offset-2 hover:text-amber-500"
            >
              <span>ajouter une photo</span>
              <input
                id="file-upload"
                name="file-upload"
                type="file"
                class="sr-only"
                ref="photo"
              />
            </label>
          </div>
        </div>

        <div class="!mt-10">
          <button
            type="button"
            class="min-w-[150px] py-3 px-4 text-sm font-semibold rounded text-white bg-amber-500 hover:bg-amber-600 focus:outline-none"
          >
            Sign up
          </button>
        </div>
      </form>
    </div>
  </div>
</template>
