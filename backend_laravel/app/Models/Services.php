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
    public function Owner()
    {
        return $this->belongsTo(Personne::class); 
    }

    public function   Users()
    {
        return $this->hasMany(Services_users::class); 
    }

}
