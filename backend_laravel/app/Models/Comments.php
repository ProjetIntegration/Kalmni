<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Comments extends Model
{
    use HasFactory;

    protected $guarded = [] ; 

    public function  User()
    {
        return  $this->belongsTo(User::class); 
    }
    public function Posts()
    {
        return  $this->belongsTo(Post::class); 

    }
}
