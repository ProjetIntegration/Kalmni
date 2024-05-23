import axios from "axios";

const ApiClient = axios.create({
  baseURL: "http://localhost:8082",
 
});
export default {
  Service_recherche(Service) {
    return ApiClient.get("/Recherche", { params: Service });
  },
  Service_recherche(Service) {
    let data = new FormData();
    data.append("nom_service", user.nom_service);
    data.append("location", user.location);
  },
  AddService(data) {
    return ApiClient.post("/AddService", data);
  },
  Service_recherche(Service) {
    return ApiClient.get("/Recherche", { params: Service });
  },
  Nom_Service(Service) {
    return ApiClient.get("/Recherche_par_nom", { params: Service });
  },
  getServiceById(id) {
    return ApiClient.get("/prestataireSevices/" + id);
  },
};
