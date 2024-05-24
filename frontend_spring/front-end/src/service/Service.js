import Axios from "axios";
import "../plugins/axios.js";

export default {
  
 
  AddService(Service) {
    
    //const requestData = { "Service" :Service, "category" :category ,"Personne" :Personne};
    //console.log(requestData);
    return Axios.post("/AddService", Service);
  },
  Service_recherche(Service) {
    return Axios.get("/Recherche", { params: Service });
  },
  Nom_Service(Service) {
    return Axios.get("/getServicesByNom", { params: Service });
  },
  getAllService(id) {
    return Axios.get("/getAllServices");
  },
};
