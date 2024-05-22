<?php

namespace App\Http\Controllers\chat;

use App\Events\ChatMessageSent;
use App\Http\Controllers\Controller;
use App\Models\Message;
use App\Models\Notifications;
use Illuminate\Http\Request;

class ChatController extends Controller
{
    public function createChat(Request $request){
        $message=Message::create([
          "sender_id"=>$request->input('envoi_id'),
          "receiver_id"=>$request->input('recu_id'),
          "message"=>$request->input('message')
        ]);
        // $notif=Notifications::create([
        //   "envoi_id"=>$request->input('envoi_id'),
        //   "recu_id"=>$request->input('recu_id'),
        //   "message"=>$request->input('message')
        // ]);
  
        broadcast(new ChatMessageSent($request->input('message')));
        
        // return response()->json(["message"=>$message,"notif"=>$notif],200);
         return response()->json(["message"=>$message],200);

      }
  
  
      public function getMessages(Request $request){
          $messages=Message::where("sender_id",$request->envoi_id)
                                ->where("receiver_id",$request->input('recu_id'))
                                ->Orwhere("receiver_id",$request->input('envoi_id'))
                                ->where("sender_id",$request->input('recu_id'))->get();
          
          return response()->json(["data"=>$messages],200);
      }
}
