<?php

namespace Database\Factories;

use App\Models\User;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Notifications>
 */
class NotificationsFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {

        $receiverId = User::inRandomOrder()->first()->id;
        return [
            'message' => $this->faker->sentence,
            'recevied_id' => $receiverId,
            'date' => $this->faker->date,
            'users_id' => User::factory(), 
        ];
    }
}
