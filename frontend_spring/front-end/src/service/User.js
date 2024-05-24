import Axios from "axios";
import "../plugins/axios.js";

export default {
  getUserById(id){
    // console.log(id);
    return Axios.get("/usersDetails/"+id);
  },



    DeletUser(id){
        return Axios.delete(`/deleteUser/${id}`);
    },
       getUsers(){
        return Axios.get("/Users");
    },
       getNotif(id){
        return Axios.get("/getNotif/"+id);
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
  return Axios.post(`/UpdateUser/${id}`,data,config);
  },
AccepterUser(id){
    return Axios.put(`/PersonneAccept/${id}`);
},
RejeterUser(id){
  return Axios.put(`/PersonneReject/${id}`);
},
getUserByStatus(){
  return Axios.get("/GetDemandes");
},

getPrestataires(name)
{
  // return ApiClient.get(`/recherche_prestataire/${id}?${name!=''?'name='+name:''}`);
  return Axios.get("/recherche_prestataire", { params: name });
},
GetallPrestataires()
{

  return  Axios.get("/GetallPrestataires"); 

}
,
GetallClients()
{
  return  Axios.get("/GetallClients"); 
},
recherche_clients(name)
{
  return Axios.get("/recherche_clients", { params: name }); 
},


}