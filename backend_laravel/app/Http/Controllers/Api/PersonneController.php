<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\Notifications;
use App\Models\User;
use Illuminate\Http\Request;

class personneController extends Controller
{
    public function getUsers(){
        $users=User::where("role_number",0)->get();
        return response()->json(["data"=>$users],200);
    }

    public function deleteUSer($id){
        $users=User::find($id);
        $message ="";
        if($users==null){
            $message="user with $id not found";
            return response()->json(["message"=>$message],404);
        }
        else{
            $users->delete();
            return response()->json(["message"=>"user deleted"],200);
        }
    }

    public function getUserById(string $id)
    {
        $user = User::find($id);

        return response()->json(["data" => $user], 200);
    }

    public function GetNotif($id){
        $notifs=Notifications::where("user_id",$id)->get();
        return response()->json(["data"=>$notifs],200);
    }


    public function UpdateUser(Request $request, $id){

        $users=User::find($id);
        $users->update([
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
        return response()->json(["message"=>"Update user terminé"],200);
    }
    //
    public function acceptUser($id) {
        $user = User::findOrFail($id);
        $user->statut = 1; // ou tout autre valeur qui représente "accepté"
        $user->save();
        return response()->json(["message" => "Utilisateur accepté"], 200);
    }

    public function rejectUser($id) {
        $user = User::findOrFail($id);
        $user->statut = 2;
        $user->save(); // ou marquer comme rejeté, selon votre logique métier
        return response()->json(["message" => "Utilisateur refusé"], 200);
    }

    public function getUserByStatus(){
        $user = User::where("role","Prestataire")->Where("statut",0)->get();
         return response()->json($user,200);



    }
    public function recherche_prestataire (Request $request)
    {
        
            //$users = User::whereNotIn('id', $excludedUserIds)->where('name', 'like', '%' . $request->search . '%')->get();
            $searchTerm = $request->name;

            $personnes = User::
                where(function ($query) use ($searchTerm) {
                    $query->where('nom', 'like', '%' . $searchTerm . '%')
                        ->orWhere('prenom', 'like', '%' . $searchTerm . '%');
                })
                
                ->orWhere(function ($query) use ($searchTerm) {
                    $query->whereRaw("CONCAT(nom, ' ', prenom) LIKE ?", ['%' . $searchTerm . '%']);
                })
                ->orWhere(function ($query) use ($searchTerm) {
                    $query->whereRaw("CONCAT(prenom, ' ', nom) LIKE ?", ['%' . $searchTerm . '%']);
                })
                
                ->get();
                        
        return  response()->json(["data"=>$personnes],200);
                
        // $name = $request->name;
        // $personnes = User::where(function($query) use ($name) {
        //                     $query->where('nom', 'like', '%' . $name . '%')
        //                           ->orWhere('prenom', 'like', '%' . $name . '%');
        //                 })
        //                 ->where('role', 1)
        //                 ->get(); 
        // return  response()->json(["data"=>$personnes],200);

    }
    public function getAllPrestataires()
    {
        $personnes  =  User::where('role','Prestataire')->get(); 
        return  response()->json(["data"=>$personnes],200);
 
    }
}
