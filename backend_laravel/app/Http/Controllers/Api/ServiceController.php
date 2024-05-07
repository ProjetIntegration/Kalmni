<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\Services;
use Illuminate\Http\Request;

class ServiceController extends Controller
{
    /**
     * Display a listing of the resource.
     */
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


        $service =new Services(); 
        $service->nom=$request->nom; 
        $service->descritpion=$request->description; 
        $service->addresse= $request->addresse; 
        $service->date=  now(); 
       


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
        ]);
        return response()->json(["message"=>"Update Services terminé"],200);
    }

    public function Used_services_byUser($id)
    {
        $services = Services::with('Services_users')->wherehas('Services_users',function($query) use  ($id) 
        {
            $query->where('user_id',$id); 
        })->get();
        return response()->json(['data'=>$services],200); 

    }   

    public function recherche_service(Request $request)
    {
        $nom_service =$request->nom_service   ;
        $location = $request->location ; 
        $Services = Services::where('nom', 'like', "%$nom_service%")
        ->orWhere('addresse', 'like', "%$location%")
        ->get(); 
        
        return response()->json(['data'=>$Services],200);
    }


    //
}
