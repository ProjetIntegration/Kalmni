import axios from "axios";

const ApiClient = axios.create({
    baseURL: "http://localhost:8000/api",
    withCredentials: false,
    headers: {
        accept: "application/json",
        "content-type": "application/json",
      },
    
  });

  export default {
    getMessages(chat){
        console.log(chat);
        
        return ApiClient.get("/getMessage",{ params: chat });
    },
    sentMessage(chat){
      console.log(chat);
      return ApiClient.post("/sendChat", chat);
  }
  }