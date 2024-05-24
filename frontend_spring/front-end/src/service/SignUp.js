import Axios from "axios";
import "../plugins/axios.js";


  export default {
    signUp(user,project) {
      console.log(project);
      const requestData = { "user" :user, "Project": project };
      return Axios.post("/signUp", requestData);
  },
    
  };