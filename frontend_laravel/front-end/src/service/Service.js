 import axios from "axios";



 const ApiClient = axios.create({
   baseURL: "http://localhost:8000/api",
   withCredentials: false,
 });
 export default {
    
  Service_recherche(Service) {
    return ApiClient.get("/Recherche", { params: Service });
  },
 };
