import axios from "axios";
import {useAuthStore} from "../store/index";

const ApiClient = axios.create({
    baseURL: "http://localhost:8000/api",
    withCredentials: false,
    headers: {
      accept: "application/json",
      "content-type": "application/json",
    },
  });

export default{
    async signIn(email,password){
        const store=useAuthStore();
        const res=await ApiClient.post('/auth/signin',{email,password});
        if(res.status==200){
          store.login(res.data.data.token,res.data.data.user,res.data.data.role);
        }else{
          store.logout();
        }
     },  
}