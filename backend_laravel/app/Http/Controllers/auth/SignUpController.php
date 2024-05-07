<?php

namespace App\Http\Controllers\auth;

use App\Http\Controllers\Controller;


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

        $Personne=User::create([
            "nom"=>$request->nom,
            "prenom"=>$request->prenom,
            "email"=>$request->email,
            "password"=>bcrypt($request->password),
            "photo" => $image_name,
            
            "role"=>1,
            "statut"=>0,
            // "role_number"=>$request->role_number,
            "tel"=>$request->tel,
            "adresse"=>$request->adresse,

            "date_naissance"=>$request->date,

            

            

        ]);
        
        
        return response()->json(['data'=>"user created"],200);
    }
}
