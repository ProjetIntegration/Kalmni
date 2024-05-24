import Axios from "axios";
import "../plugins/axios.js";
import {useAuthStore} from "../store/index";


export default{
    async signIn(email,password){
        const store=useAuthStore();
        const res= await Axios.post('/login',{email,password});
        if(res.status==200){
          console.log(res.data.user);
          store.login(res.data.token,res.data.user,res.data.user.role_number);
        }else{
          store.logout();
        }
     },  
}