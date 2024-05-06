<?php

namespace App\Http\Controllers;

use App\Models\Services;
use Illuminate\Http\Request;

class ServicesController extends Controller
{

    public function deleteServices($id){
        $services=Services::find($id);
        $message ="";
        if($services==null){
            $message="Services with $id not found";
            return response()->json(["message"=>$message],404);
        }
        else{
            $services->delete();
            return response()->json(["message"=>"services deleted"],200);
        }
    }

    public function getServicesById($id){
        $services=Services::find($id);
        return response()->json(["data"=>$services],200);
    }
    

    public function addServices(Request $request){

        $file_name = time() . '_' . $request->photo->getClientOriginalName();
        $image = $request->file('photo')->storeAs('images', $file_name, 'public');

        Services::create([
            "nom"=>$request->nom,
            "description"=>$request->description,
            "addresse"=>$request->addresse,
            "heure_debut"=>$request->heure_debut,
            "heure_fin"=>$request->heure_fin,
            "date"=>$request->date,
            'photo'=>'/storage/' . $image,
            
        ]);
        return response()->json(["message"=>"Services Added"],201);
    }

    public function UpdateServices(Request $request, $id){
        
        $services=Services::find($id);
        $services->update([
            "nom"=>$request->nom,
            "description"=>$request->description,
            "addresse"=>$request->addresse,
            "heure_debut"=>$request->heure_debut,
            "heure_fin"=>$request->heure_fin,
            "date"=>$request->date,
            'photo'=>$request->image,
        ]);
        return response()->json(["message"=>"Update Services terminé"],200);
    }
   
    //
}
