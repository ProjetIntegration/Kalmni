<?php

namespace App\Http\Controllers\auth;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class LoginController extends Controller
{
    public function LoginUser(Request $request)
    {
        if (Auth::attempt(['email' => $request->email, 'password' => $request->password])) {
            $user = Auth::user();
           
            $token = $user->createToken('api_token')->plainTextToken;
            $respnose = [
                'token' => $token,
                'user' => $user,
                'role' => $user->role
            ];
            return response()->json(['data' => $respnose], 200);
        } else {
            return response()->json(['data' => "Utilisateur non trouvé", 'status' => "user"], 401);
        }
    }
}
