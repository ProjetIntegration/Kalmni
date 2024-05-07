import axios from "axios";

const ApiClient = axios.create({
    baseURL: "http://localhost:8000/api",
    withCredentials: false,
    
    
  });

  export default {
    signUp(user){
      let data = new FormData();
        data.append("nom", user.nom);
        data.append("prenom", user.prenom);
        data.append("email", user.email);
        data.append("tel", user.tel);
        data.append("password", user.password);
        data.append("adresse", user.adresse);
        data.append("photo", user.photo);
        data.append("date", user.date);
        const config = {
            Headers: {
                "content-type": "multipart/form-data",
            },
        };
        console.log(user);
        return ApiClient.post("/auth/signup", data, config);
    },

    
  };