import axios from "axios";

const ApiClient = axios.create({
    baseURL: "http://localhost:8000/api",
    withCredentials: false,
    
    
  });

export default {
  getUserById(id){
    console.log(id);
    return ApiClient.get("/usersDetails/"+id);
  },

    AddUser(user){
        console.log(user);
        let data=new FormData();
        data.append("nom", user.nom);
        data.append("prenom", user.prenom);
        data.append("email", user.email);
        data.append("tel", user.tel);
        data.append("password", user.password);
        data.append("adresse", user.adresse);
        data.append("photo", user.photo);
        data.append("date", user.date);
        const config={
            Headers:{
                "content-Type":"multipart/form-data"
            }
        }
        return ApiClient.post("/addUser",data,config)
    },

    DeletUser(id){
        return ApiClient.delete(`/deleteUser/${id}`);
    },
       getUsers(){
        return ApiClient.get("/Users");
    },
       getNotif(id){
        return ApiClient.get("/getNotif/"+id);
    }, 
    
    UpdateUSer(user,id){
  
      let data=new FormData();
      data.append("nom", user.nom);
      data.append("prenom", user.prenom);
      data.append("email", user.email);
      data.append("tel", user.tel);
      data.append("password", user.password);
      data.append("adresse", user.adresse);
      data.append("photo", user.photo);
      data.append("date", user.date);
      const config={
     Headers:{
     "content-Type":"multipart/form-data"
      }
    }
  return ApiClient.post(`/UpdateUser/${id}`,data,config);
  },
  AccepterUser(id){
    return ApiClient.post(`/Accepter/${id}`);
},
RejeterUser(id){
  return ApiClient.post(`/Rejeter/${id}`);
},
getUserByStatus(){
  return ApiClient.get("/DemandePrestataire");
},

getPrestataires(name)
{
  return ApiClient.get("/recherche_prestataire", { params: name });
},


}