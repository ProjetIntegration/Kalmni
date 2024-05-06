<?php

namespace App\Http\Controllers;

use App\Models\Personne;
use Illuminate\Http\Request;
use Illuminate\Notifications\Notification;

class PersonneController extends Controller
{

    
    public function getPersones(){
        $personnes=Personne::where("role_number",0)->get();
        return response()->json(["data"=>$personnes],200);
    }

    public function deletePersonne($id){
        $personnes=Personne::find($id);
        $message ="";
        if($personnes==null){
            $message="Personne with $id not found";
            return response()->json(["message"=>$message],404);
        }
        else{
            $personnes->delete();
            return response()->json(["message"=>"Personne deleted"],200);
        }
    }

    public function getPersonneById($id){
        $personnes=Personne::find($id);
        return response()->json(["data"=>$personnes],200);
    }

    public function GetNotif($id){
        $notifs=Notification::where("user_id",$id)->get();
        return response()->json(["data"=>$notifs],200);
    }

    public function addPersonne(Request $request){

        $file_name = time() . '_' . $request->photo->getClientOriginalName();
        $image = $request->file('photo')->storeAs('images', $file_name, 'public');

        Personne::create([
            "nom"=>$request->nom,
            "prenom"=>$request->prenom,
            "email"=>$request->email,
            "password"=>$request->password,
            "role_number"=>$request->role_number,
            'photo'=>'/storage/' . $image,
            "tel"=>$request->tel,
            "adresse"=>$request->adresse,
            "date"=>$request->date,
            
        ]);
        return response()->json(["message"=>"Personne Added"],201);
    }

    public function UpdatePersonne(Request $request, $id){
        
        $personnes=Personne::find($id);
        $personnes->update([
            "nom"=>$request->nom,
            "prenom"=>$request->prenom,
            "email"=>$request->email,
            "password"=>$request->password,
            "role_number"=>$request->role_number,
            'photo'=>$request->image,
            "tel"=>$request->tel,
            "adresse"=>$request->adresse,
            "date"=>$request->date,
        ]);
        return response()->json(["message"=>"Update Personne terminé"],200);
    }
    //
}
