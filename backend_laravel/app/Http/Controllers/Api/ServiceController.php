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

        $image_service="";
        $image_certif="";  
        $service =new Services(); 
        $service->nom=$request->nom; 
        $service->descritpion=$request->description; 
        $service->addresse= $request->addresse; 
        $service->date=  now(); 
       
        if ($request->hasFile('photo')) {
            $file_name = time() . '_' .$request->photo->getClientOriginalName();
            $image=$request->file('photo')->storeAs('users',$file_name,'public');
            $image_name='/storage/'.$image;
        }else{
            $image_name=$request->nom[0].''.$request->prenom[0];
        }

        $file_name_certif = time() . '_' .$request->photo_certif->getClientOriginalName();
        $image_certif=$request->file('photo_certif')->storeAs('users',$file_name_certif,'public');
        $image_name_certif='/storage/'.$image_certif;
        $service->img_certif=$image_name_certif;
        $service->img_service=$image_name; 
        $service->save(); 
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
