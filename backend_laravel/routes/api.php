<?php


use App\Http\Controllers\Api\ServiceController;
use App\Http\Controllers\api\UserController;
use App\Http\Controllers\auth\LoginController;
use App\Http\Controllers\auth\SignUpController;
use App\Http\Controllers\PersonneController;
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
    Route::post('/signin',[LoginController::class,'LoginUser']);

});

Route::get('/Recherche',[ServiceController::class,'recherche_service']);

Route::post('/Accepter/{id}',[UserController::class,'acceptUser']);

Route::post('/Rejeter/{id}',[UserController::class,'rejectUser']);

Route::get('/DemandePrestataire',[UserController::class,'getUserByStatus']);
