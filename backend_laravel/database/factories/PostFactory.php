<?php

namespace Database\Factories;

use App\Models\User;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Post>
 */
class PostFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    { 
        
        $senderId = User::inRandomOrder()->first()->id;
        $width=200;
        $height=200;
        $path=$this->faker->image('storage/app/',$width,$height,'person',true,true,'person',false);
        return [

            //
            'nom' =>$this->faker->sentence(),
            'photo'=>$path,
            'description' =>$this->faker->sentence(),
            'user_id' =>$senderId,
            'date'=>$this->faker->date(),
            'montant' => $this->faker->randomFloat(2, 0, 1000),
        ];
    }
}
