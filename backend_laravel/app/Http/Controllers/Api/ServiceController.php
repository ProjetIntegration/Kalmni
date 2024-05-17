<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\service_schedule;
use App\Models\Services;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

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
        $service->description=$request->description; 
        $service->addresse= $request->addresse; 
        //$service->date=  now(); 
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
        $service->img_certificat=$image_name_certif;
        $service->img_service=$image_name; 
        $service->owner_service=$request->user_id;
        $service->category_id=$request->category_id;
        $service->save();
        $tab=json_decode($request->tab_schedules, true );
        for ($i=0; $i<count($tab);$i++){
           $schedules=new service_schedule();
           $schedules->heure_debut=$tab[$i]["heure_debut"];
           $schedules-> heure_fin=$tab[$i]["heure_fin"];
           $schedules->jour=$tab[$i]["jour"];
           $schedules->service_id=$service->id;
           $schedules->save();
        }


        $service->save(); 
        $days = 7; 
        for(  $i =0 ; $i <$days ;$i++){
            $service_schedules = new service_schedule();
            $service_schedules->nom=$tab[$i]["nom"];
            }

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
     
        $nom_service2 =$request->nom_service;

        $location2 =$request->location;
    
        if($location2 == null && $nom_service2!= null )
        {
        
            $Services =Services::where('nom', 'like', '%'.$nom_service2.'%')->get();
          
            return response()->json(['data'=> $Services],200);
        }
        else{
            if($location2 != null && ($nom_service2)== null )
            {
                $Services =Services::where('nom', 'like', '%'.$location2.'%')->get();
             
              
                return response()->json(['data'=>$Services],200);
            }
            else{
                $Services = Services::where('nom', 'like', "%$nom_service2%")
              ->where('addresse', 'like', "%$location2%")
              ->get(); 
              return response()->json(['data'=>$Services],200);
            }
        }
     
        
        
       
    }


    //
}
