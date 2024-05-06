<?php

namespace App\Http\Controllers\auth;

use App\Http\Controllers\Controller;
use App\Models\Personne;


use Illuminate\Http\Request;
use Illuminate\Support\Facades\Mail;

class VerifyEmailController extends Controller
{
    public function VerifyEmail(String $email){
        $Personne=Personne::where('email',$email)->first();
        if(!$Personne->hasVerifiedEmail()){
            $Personne->markEmailAsVerified();
            return response()->json(['data'=>"Email has been verified"],200);
        }else{
            return response()->json(['data'=>"email already verified"],201);
        }
    }

    public function renvoyer(String $email){
        $Personne=Personne::where('email',$email)->first();
        if($Personne->hasVerifiedEmail()){
            return response()->json(['data'=>"email already verified"],200);
        }
        // Mail::to($Personne->email)->send(new VerifyMail($Personne));
        return response()->json(['data'=>"Link verified send with success"],200);
    }
}
