<?php

namespace Database\Factories;

use App\Models\User;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Projects>
 */
class ProjectsFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
       
            $senderId = User::inRandomOrder()->first()->id;
            return [
                'name' => $this->faker->name,
                'description' => $this->faker->sentence(),
                'photo' => $this->faker->imageUrl(400, 300), // Example of generating a random image URL
                'user_id' => $senderId,
            ];
        
    }
}
