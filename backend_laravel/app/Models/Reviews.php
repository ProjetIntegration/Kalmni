<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Reviews extends Model
{
    use HasFactory;protected $guarded=[];

    public function Services_users()
    {
        return $this->belongsTo(Services_users::class); 
    }

}
