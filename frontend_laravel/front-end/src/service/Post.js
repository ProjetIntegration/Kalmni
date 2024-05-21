import axios from "axios";



 const ApiClient = axios.create({
   baseURL: "http://localhost:8000/api",
   withCredentials: false,
 });

 export default {

    getPostById(id){
        return ApiClient.get(`/getPostById/${id}`);
      },



      AddPost(Post){

        let data=new FormData();   
        data.append("nom",Post.nom);
        data.append("description",Post.description);
        data.append("photo",Post.photo);
        const config={
            Headers:{
                "content-Type":"multipart/form-data"
            }
        }
        return ApiClient.post("/AddPost",data,config)
    },

    DeletPost(id){
        return ApiClient.delete(`/deletePost/${id}`);
    },

//     UpdateProudct(Post,id){

//         let data=new FormData();
//         data.append("nom",Post.nom);
//         data.append("description",Post.description);
//         data.append("photo",Post.image);
//         data.append("SavePhoto",Post.SavePhoto);
//         const config={
//        Headers:{
//        "content-Type":"multipart/form-data"
//         }
//       }
//     return axios.post(`/UpdatePost/${id}`,data,config)
//    },


 }