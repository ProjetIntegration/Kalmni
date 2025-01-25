<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\Post;
use Illuminate\Http\Request;

class PostController extends Controller
{
    //
    

    public function addPost(Request $request){

        $file_name = time() . '_' . $request->photo->getClientOriginalName();
        $image = $request->file('photo')->storeAs('images', $file_name, 'public');

        Post::create([
            "nom"=>$request->nom,
            "description"=>$request->description,
            "montant"=>$request->montant,
            "Date"=>date("Y-m-d"),
            "user_id"=>$request->user_id,

            'photo'=>'/storage/' . $image,

        ]);
        return response()->json(["message"=>"Post Added"],201);
    }


    public function getPostById($id){
        $postes= Post::find($id);
        return response()->json(["data"=>$postes],200);
    }

    public function deletePost($id){
        $postes= Post::find($id);
        $message ="";
        if($postes==null){
            $message="produit with $id not found";
            return response()->json(["message"=>$message],404);
        }
        else{
            $postes->delete();
            return response()->json(["message"=>"Poste deleted"],200);
        }
    }
}
