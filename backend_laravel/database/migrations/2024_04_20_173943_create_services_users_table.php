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
        Schema::create('services_users', function (Blueprint $table) {
            $table->id();
            $table->timestamps();

            $table->foreignId("service_id")->refrences("id")->on("services")->cascadeOnDelete();
            $table->foreignId("personne_id")->refrences("id")->on("personnes")->cascadeOnDelete();

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('services_users');
    }
};
