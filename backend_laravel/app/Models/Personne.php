<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Personne extends Model
{
    use HasFactory;
    protected $guarded=[];

    public function Notification(){
        return $this->hasMany(Notifications::class);
      }


      public function Myservices()
      {
        return $this->hasMany(Services::class); 
      }

      public function ServicesUsed()
      {
         return  $this->hasMany(Services_users::class); 
      }

    


     /* public function Project(){
        return $this->hasMany(Projects::class);
      }

      public function Message(){
        return $this->hasMany(Message::class);
      }

      public function Post(){
        return $this->hasMany(Post::class);
      }

      public function comments(){
        return $this->hasMany(Comments::class);
      }*/

}