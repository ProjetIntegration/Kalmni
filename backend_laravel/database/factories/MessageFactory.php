<?php

namespace Database\Factories;

use App\Models\User;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Message>
 */
class MessageFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        $senderId = User::inRandomOrder()->first()->id;
        $receiverId = User::inRandomOrder()->first()->id;
        
        return [
            'message' => $this->faker->sentence,
            'date' => $this->faker->date,
            'sender_id' => $senderId,
            'receiver_id' => $receiverId,
        ];
    }
}
