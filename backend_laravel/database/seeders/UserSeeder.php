<?php

namespace Database\Seeders;

use App\Models\Notifications;
use App\Models\Post;
use App\Models\Projects;
use App\Models\Services;
use App\Models\User;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class UserSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        // For role 1 users
        User::factory()->count(5)->create(['role' => 'Client'])->each(function ($user) {
            $user->posts()->createMany(Post::factory()->count(5)->make()->toArray());
           
        });

        // For role 2 users
        User::factory()->count(5)->create(['role' => 'Prestataire'])->each(function ($user) {
            $user->services()->createMany(Services::factory()->count(3)->make()->toArray());
            $user->projects()->createMany(Projects::factory()->count(2)->make()->toArray());
        });
    }
}
