<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class service_schedule extends Model
{
    use HasFactory;

    protected $guarded=[];
    public function Service()
    {
        return $this->belongsTo(Services::class); 
    }

}
