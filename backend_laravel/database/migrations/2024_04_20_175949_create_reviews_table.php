<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('reviews', function (Blueprint $table) {
            $table->id();
            $table->timestamps();
            $table->string("message"); 
            $table->foreignId("service_user_id")->refrences("id")->on("services_users")->cascadeOnDelete(); 
            $table->foreignId("personne_id")->refrences("id")->on("personnes")->cascadeOnDelete(); 
            $table->integer("rate") ; 
            
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('reviews');
    }
};
