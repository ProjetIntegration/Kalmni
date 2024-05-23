import Axios from "axios";
import "../plugins/axios.js";


  export default {
    signUp(user) {
      console.log(user);
      return Axios.post("/signUp", user);
  },
    
  };