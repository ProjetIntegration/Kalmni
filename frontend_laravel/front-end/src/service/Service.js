 import axios from "axios";



 const ApiClient = axios.create({
   baseURL: "http://localhost:8000/api",
   withCredentials: false,
 });
 export default {
    
<<<<<<< HEAD
  Service_recherche(Service) {
    return ApiClient.get("/Recherche", { params: Service });
  },
=======
        Service_recherche(Service)
         {
            let data = new FormData();
<<<<<<< HEAD
            data.append("nom_service", user.nom_service);
            data.append("location", user.location);
         },
         
         AddService(data){
          let payload = new FormData();
          payload.append("nom", data.nom);
          payload.append("description", data.description);
          payload.append("addresse", data.addresse);
          payload.append("photo", data.photo);
          payload.append("photo_certif", data.photo_certif);
          payload.append("user_id", data.user_id);
          payload.append("category_id", data.category_id);
          payload.append("tab_schedules", JSON.stringify(data.tab_schedules));
          const config = {
              Headers: {
                  "content-type": "multipart/form-data",
              },
          };
          console.log(data);
          return ApiClient.post("/service/AddService", payload, config);
=======
            data.append("nom_service", Service.nom_service);
            data.append("location", Service.location);


            return ApiClient.get("/Recherche",data); 

>>>>>>> 168db442bcb96f68c53d02e0b22160250b2b726c
         }


>>>>>>> iheb
 };
