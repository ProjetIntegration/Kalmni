<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Services_users extends Model
{
    use HasFactory;
    protected $guarded=[];

    public function Services()
    {
        return $this->hasMany(Services::class); 
    }
    public function RegistratedUsers()
    {
        return $this->hasMany(Personne::class); 
    }

    public function Reports()
     {
        return $this->hasMany(Reports::class); 

     }

     public function Reviews()
     {
        return $this->hasMany(Reviews::class); 
     }

}
