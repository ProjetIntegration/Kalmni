import Axios from "axios";
import "../plugins/axios.js";

export default {
  
 
  AddService(data) {
    return Axios.post("/AddService", data);
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
