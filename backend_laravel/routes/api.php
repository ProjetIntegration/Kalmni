<?php

use App\Http\Controllers\PersonneController;
use App\Http\Controllers\ServicesController;
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
Route::group(["prefix"=>"/personnes"] ,function() {
    Route::get('/get-all-personnes',[PersonneController::class,'getPersones']);
    Route::post('/addPersonne',[PersonneController::class,'addPersonne']);
    route::delete('/deletePersonne/{id}',[PersonneController::class,'deletePersonne']);
    Route::post('/UpdatePersonne/{id}', [PersonneController::class,'UpdatePersonne']);
    Route::get('/getPersonneById/{id}',[PersonneController::class,'getPersonneById']);
});




Route::post('/addServices',[ServicesController::class,'addServices']);
route::delete('/deleteServices/{id}',[ServicesController::class,'deleteServices']);
Route::post('/UpdateServices/{id}', [ServicesController::class,'UpdateServices']);
Route::get('/getServices/{id}',[ServicesController::class,'getServicesById']);




