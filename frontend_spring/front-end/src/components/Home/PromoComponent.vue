<template>
  <div>
    <h2
      class="text-center m-20 text-2xl font-bold text-black sm:text-3xl md:text-5xl mt-20"
    >
      Dernieres promo !
    </h2>
    <div
      x-data="{}"
      x-init="$nextTick(() => {
        let ul = $refs.logos;
        ul.insertAdjacentHTML('afterend', ul.outerHTML);
        ul.nextSibling.setAttribute('aria-hidden', 'true');
        setInterval(() => {
          ul.style.transitionDuration = '0s'; // Set transition duration to 0s
          ul.style.transform = `translateX(-${ul.offsetWidth}px)`;
          setTimeout(() => {
            ul.style.transitionDuration = ''; // Reset transition duration to default
            ul.style.transform = 'translateX(0)';
            // Move the first li element to the end
            let firstLi = ul.querySelector('li:first-child');
            ul.appendChild(firstLi);
          }, 20);
        }, 5000); // Adjust the interval duration as needed
      })"
      class="w-full inline-flex flex-nowrap overflow-hidden [mask-image:_linear-gradient(to_right,transparent_0,_black_128px,_black_calc(100%-128px),transparent_100%)]"
    >
      <ul
        x-ref="logos"
        class="flex items-center justify-center md:justify-start [&_li]:mx-8 animate-infinite-scroll"
      >
        <!-- Your list items here -->
        <li>
          <div
            class="flex max-w-md overflow-hidden bg-white rounded-lg shadow-lg dark:bg-gray-800"
          >
            <div
              class="w-1/3 bg-cover"
              style="
                background-image: url('https://images.unsplash.com/photo-1494726161322-5360d4d0eeae?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80');
              "
            ></div>

            <div class="w-2/3 p-4 md:p-4">
              <h1 class="text-xl font-bold text-gray-800 dark:text-white">
                Backpack
              </h1>

              <p class="mt-2 text-sm text-gray-600 dark:text-gray-400">
                Lorem ipsum dolor sit amet consectetur adipisicing elit In odit
              </p>

              <div class="flex mt-2 item-center">
                <svg
                  class="w-5 h-5 text-yellow-300 fill-current dark:text-gray-300"
                  viewBox="0 0 24 24"
                >
                  <path
                    d="M12 17.27L18.18 21L16.54 13.97L22 9.24L14.81 8.63L12 2L9.19 8.63L2 9.24L7.46 13.97L5.82 21L12 17.27Z"
                  />
                </svg>
                <span
                  class="bg-blue-100 text-blue-800 text-xs font-semibold px-2.5 py-0.5 rounded dark:bg-blue-200 dark:text-blue-800 ms-3"
                  >5.0</span
                >
              </div>

              <div class="flex justify-between mt-3 item-center">
                <h1
                  class="text-lg font-bold text-gray-700 dark:text-gray-200 md:text-xl"
                >
                  $220
                </h1>
                <button
                  class="px-2 py-1 text-xs font-bold text-black uppercase transition-colors duration-300 transform bg-amber-400 rounded hover:bg-amber-600 dark:hover:bg-gray-600 focus:outline-none focus:bg-gray-700 dark:focus:bg-gray-600"
                >
                  Reserver
                </button>
              </div>
            </div>
          </div>
        </li>
        <li>
          <div
            class="flex max-w-md overflow-hidden bg-white rounded-lg shadow-lg dark:bg-gray-800"
          >
            <div
              class="w-1/3 bg-cover"
              style="
                background-image: url('https://images.unsplash.com/photo-1494726161322-5360d4d0eeae?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80');
              "
            ></div>

            <div class="w-2/3 p-4 md:p-4">
              <h1 class="text-xl font-bold text-gray-800 dark:text-white">
                Backpack
              </h1>

              <p class="mt-2 text-sm text-gray-600 dark:text-gray-400">
                Lorem ipsum dolor sit amet consectetur adipisicing elit In odit
              </p>

              <div class="flex mt-2 item-center">
                <svg
                  class="w-5 h-5 text-yellow-300 fill-current dark:text-gray-300"
                  viewBox="0 0 24 24"
                >
                  <path
                    d="M12 17.27L18.18 21L16.54 13.97L22 9.24L14.81 8.63L12 2L9.19 8.63L2 9.24L7.46 13.97L5.82 21L12 17.27Z"
                  />
                </svg>
                <span
                  class="bg-blue-100 text-blue-800 text-xs font-semibold px-2.5 py-0.5 rounded dark:bg-blue-200 dark:text-blue-800 ms-3"
                  >5.0</span
                >
              </div>

              <div class="flex justify-between mt-3 item-center">
                <h1
                  class="text-lg font-bold text-gray-700 dark:text-gray-200 md:text-xl"
                >
                  $220
                </h1>
                <button
                  class="px-2 py-1 text-xs font-bold text-black uppercase transition-colors duration-300 transform bg-amber-400 rounded hover:bg-amber-600 dark:hover:bg-gray-600 focus:outline-none focus:bg-gray-700 dark:focus:bg-gray-600"
                >
                  Reserver
                </button>
              </div>
            </div>
          </div>
        </li>
        <li>
          <div
            class="flex max-w-md overflow-hidden bg-white rounded-lg shadow-lg dark:bg-gray-800"
          >
            <div
              class="w-1/3 bg-cover"
              style="
                background-image: url('https://images.unsplash.com/photo-1494726161322-5360d4d0eeae?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80');
              "
            ></div>

            <div class="w-2/3 p-4 md:p-4">
              <h1 class="text-xl font-bold text-gray-800 dark:text-white">
                Backpack
              </h1>

              <p class="mt-2 text-sm text-gray-600 dark:text-gray-400">
                Lorem ipsum dolor sit amet consectetur adipisicing elit In odit
              </p>

              <div class="flex mt-2 item-center">
                <svg
                  class="w-5 h-5 text-yellow-300 fill-current dark:text-gray-300"
                  viewBox="0 0 24 24"
                >
                  <path
                    d="M12 17.27L18.18 21L16.54 13.97L22 9.24L14.81 8.63L12 2L9.19 8.63L2 9.24L7.46 13.97L5.82 21L12 17.27Z"
                  />
                </svg>
                <span
                  class="bg-blue-100 text-blue-800 text-xs font-semibold px-2.5 py-0.5 rounded dark:bg-blue-200 dark:text-blue-800 ms-3"
                  >5.0</span
                >
              </div>

              <div class="flex justify-between mt-3 item-center">
                <h1
                  class="text-lg font-bold text-gray-700 dark:text-gray-200 md:text-xl"
                >
                  $220
                </h1>
                <button
                  class="px-2 py-1 text-xs font-bold text-black uppercase transition-colors duration-300 transform bg-amber-400 rounded hover:bg-amber-600 dark:hover:bg-gray-600 focus:outline-none focus:bg-gray-700 dark:focus:bg-gray-600"
                >
                  Reserver
                </button>
              </div>
            </div>
          </div>
        </li>
        <li>
          <div
            class="flex max-w-md overflow-hidden bg-white rounded-lg shadow-lg dark:bg-gray-800"
          >
            <div
              class="w-1/3 bg-cover"
              style="
                background-image: url('https://images.unsplash.com/photo-1494726161322-5360d4d0eeae?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80');
              "
            ></div>

            <div class="w-2/3 p-4 md:p-4">
              <h1 class="text-xl font-bold text-gray-800 dark:text-white">
                Backpack
              </h1>

              <p class="mt-2 text-sm text-gray-600 dark:text-gray-400">
                Lorem ipsum dolor sit amet consectetur adipisicing elit In odit
              </p>

              <div class="flex mt-2 item-center">
                <svg
                  class="w-5 h-5 text-yellow-300 fill-current dark:text-gray-300"
                  viewBox="0 0 24 24"
                >
                  <path
                    d="M12 17.27L18.18 21L16.54 13.97L22 9.24L14.81 8.63L12 2L9.19 8.63L2 9.24L7.46 13.97L5.82 21L12 17.27Z"
                  />
                </svg>
                <span
                  class="bg-blue-100 text-blue-800 text-xs font-semibold px-2.5 py-0.5 rounded dark:bg-blue-200 dark:text-blue-800 ms-3"
                  >5.0</span
                >
              </div>

              <div class="flex justify-between mt-3 item-center">
                <h1
                  class="text-lg font-bold text-gray-700 dark:text-gray-200 md:text-xl"
                >
                  $220
                </h1>
                <button
                  class="px-2 py-1 text-xs font-bold text-black uppercase transition-colors duration-300 transform bg-amber-400 rounded hover:bg-amber-600 dark:hover:bg-gray-600 focus:outline-none focus:bg-gray-700 dark:focus:bg-gray-600"
                >
                  Reserver
                </button>
              </div>
            </div>
          </div>
        </li>
        <!-- Repeat this list item structure for each promo -->
      </ul>
    </div>
  </div>
</template>
