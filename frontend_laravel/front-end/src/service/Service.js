 import axios from "axios";



 const ApiClient = axios.create({
   baseURL: "http://localhost:8000/api",
   withCredentials: false,
 });
 export default {
    
        Service_recherche(Service)
         {

            let data = new FormData();
            data.append("nom_service", Service.nom_service);
            data.append("location", Service.location);


            return ApiClient.get("/Recherche",data); 

         }
 };
