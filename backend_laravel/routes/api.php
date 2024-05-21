<?php


use App\Http\Controllers\Api\personneController;
use App\Http\Controllers\Api\PostController;
use App\Http\Controllers\Api\ServiceController;
use App\Http\Controllers\auth\LoginController;
use App\Http\Controllers\auth\SignUpController;



use App\Http\Controllers\chat\ChatController;


use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use PHPUnit\Framework\Attributes\Group;

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

// user Controller 

// Route::middleware(('auth:api')->group(function(){

route::get('/usersDetails/{id}',[personneController::class,'getUserById']);
Route::post('/Accepter/{id}',[personneController::class,'acceptUser']);
Route::post('/Rejeter/{id}',[personneController::class,'rejectUser']);
Route::get('/DemandePrestataire',[personneController::class,'getUserByStatus']);
route::get('/recherche_prestataire',[personneController::class,'recherche_prestataire']);


// chat controller 
route::post("/sendChat",[ChatController::class,'createChat']);
route::get("/getMessage",[ChatController::class,'getMessages']);


// service controller 
Route::get('/Recherche_par_nom',[ServiceController::class,'nom_service']);
Route::get('/Recherche',[ServiceController::class,'recherche_service']);
Route::get('/prestataireSevices/{id}',[ServiceController::class,'getServiceById']);
Route::group(["prefix"=>"/service"],function(){
Route::post('/AddService',[ServiceController::class,'addServices']);


//Post Controller
Route::post('/AddPost',[PostController::class,'addPost']);
Route::get('/getPostById/{id}',[PostController::class,'getPostById']);
Route::get('/postes',[PostController::class,'getproduit']);
Route::delete('/deletePost/{id}',[PostController::class,'deletePost']);
});
// }));