<template>
    <div class="bg-gray-100">
        <div class="container mx-auto py-8">
            <div class="flex flex-row gap-6">
                <div class="flex justify-end basis-1/3 ">
                    <div :style="{ width: '360px' }" class="bg-white rounded-lg p-6 shadow-lg justify-end">
                        <div class="flex  flex-col items-center">
                            <div class="relative mr-2">
                                <div class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
                                    <img src="../../assets/search.png" alt=""
                                        class="w-10 h-10 text-gray-500 dark:text-amber-400 mb-12" />
                                </div>
                                <form methode="GET">
                                    <input name="search" type="search" id="search" v-model="nom"  @keyup="fetchServiceData()"
                                        class="bg-gray-100 w-full shadow-lg p-4 mt-6 ps-16 text-m px-4 py-3.5 rounded-md outline-amber-500"
                                        placeholder="Quel service recherchez . . ." />
                                    <button type="submit"
                                        class="text-white justify-end mt-5 font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Chercher
                                    </button>
                                </form>
                            </div>

                        </div>

                    </div>
                </div>
                <div>
                    <div class="flex flex-col gap-4" v-for="service in services" :key="service.id">


                        <div
                            class="transition ease-in-out delay-150 hover:-translate-y-1 hover:scale duration-300  rounded-3xl border-2 border-gray-200 p-4 bg-white lg:p-8 w-[80%] grid grid-cols-12 max-lg:max-w-lg max-lg:mx-auto gap-y-4 ">
                            <div class="col-span-12 lg:col-span-2 img box">

                                <!-- <img :src="'http://localhost:8000' + ser.img_service" alt="speaker image" -->
                                <!-- class="max-lg:w-full lg:w-[180px] "> -->
                            </div>
                            <div class="col-span-12 lg:col-span-10 detail w-full lg:pl-3">
                                <div class="flex items-center justify-between w-full mb-4">
                                    <h5 class="font-manrope font-bold text-2xl leading-9 text-gray-900">
                                        {{ service.nom }}</h5>
                                    <h5 class="font-manrope font-bold text-2xl text-gray-900"> {{ service.adresse }}
                                    </h5>

                                </div>
                                <p class="font-normal text-base leading-7 text-gray-500 mb-6">
                                    {{ service.description }}
                                </p>
                                <div class="flex justify-between items-center">
                                    <div class="flex items-center gap-4">
                                        <a href="#"
                                            class="text-white justify-end font-bold block w-300 p-4 text-center border border-gray-300 rounded-lg bg-amber-400 hover:bg-amber-500 focus:ring-4 focus:outline-none focus:ring-blue-300 text-sm dark:bg-amber-500 dark:hover:bg-amber-400 dark:focus:ring-amber-500">Réserver</a>
                                    </div>
                                    <h6 class="text-indigo-600 font-manrope font-bold text-2xl leading-9 text-right">220
                                        DT
                                    </h6>
                                </div>
                            </div>
                        </div>






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
            services: []
        };
    },
    created() {
        this.getAllServices();
    },

    methods: {
        fetchServiceData() {
            if (this.name != "") {
                let data = {
                    nom: this.nom,
                };

                Service.Nom_Service(data).then((res) => {

                    this.services = res.data;
                });
            }else{
                this.getAllServices() 
            }
            

            
            
        },
        getAllServices() {
            Service.getAllService().then((res) => {
                if (Array.isArray(res.data)) {
                    this.services = res.data;
                    console.log(this.services.length); 
                } 
            }).catch((error) => {
                console.error("Error fetching services:", error);
            });
        }

    }
};
</script>
