import Axios from "axios";
import "../plugins/axios.js";



 

 export default {

    AddPost(data) {
        return Axios.post("/AddPost", data);
      },




 }