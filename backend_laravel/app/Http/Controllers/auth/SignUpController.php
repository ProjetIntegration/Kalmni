<?php

namespace App\Http\Controllers\auth;

use App\Http\Controllers\Controller;


use App\Models\Projects;
use Illuminate\Http\Request;


use App\Models\Personne;
use App\Models\User;

class SignUpController extends Controller
{
    public function Signup(Request $request)
    {

       if ($request->hasFile('photo')) {
            $file_name = time() . '_' .$request->photo->getClientOriginalName();
            $image=$request->file('photo')->storeAs('users',$file_name,'public');
            $image_name='/storage/'.$image;
        }else{
            $image_name=$request->nom[0].''.$request->prenom[0];
        }

        $User=User::create([
            "nom"=>$request->nom,
            "prenom"=>$request->prenom,
            "email"=>$request->email,
            "password"=>bcrypt($request->password),
            "photo" => $image_name,
            "role"=>$request->role,
            "statut"=>0,
            "tel"=>$request->tel,
            "adresse"=>$request->adresse,
            "date_naissance"=>$request->date,

        ]);
        if($request->role=="Prestataire"){
            $file_name = time() . '_' .$request->photo_certif->getClientOriginalName();
            $image=$request->file('photo_certif')->storeAs('users',$file_name,'public');
            $image_certif='/storage/'.$image;
        
                $Project=Projects::create([
                    "name"=>$request->title,
                    "description"=>$request->description,
                    "photo"=>$image_certif,
                    "user_id"=>$User->id
    
            ]);
        
        }
        
        
        
        return response()->json(['data'=>"user created"],200);
    }
}
