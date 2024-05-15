<?php

use App\Http\Controllers\Api\ServiceController;
use App\Http\Controllers\auth\SignUpController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "api" middleware group. Make something great!
|
*/

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});

Route::group(["prefix"=>"/auth"],function(){
    Route::post('/signup',[SignUpController::class,'Signup']);
    
});


Route::group(["prefix"=>"/service"],function(){
    Route::post('/AddService',[ServiceController::class,'addServices']);
});