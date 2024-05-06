<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Services extends Model
{
    use HasFactory;
    protected $guarded=[];

    public function Category()
    {
        return  $this->belongsTo(Category::class); 
    }
    public function User_owner()
    {
        return $this->belongsTo(User::class); 
    }

    public function   Users_registrated()
    {
        return $this->hasMany(Services_users::class); 
    }

    public function   service_schedule()
    {
        return $this->hasMany(service_schedule::class); 
    }

}
