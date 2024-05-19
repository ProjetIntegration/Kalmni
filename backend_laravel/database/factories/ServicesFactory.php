<?php

namespace Database\Factories;

use App\Models\Category;
use App\Models\User;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Services>
 */
class ServicesFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        $owner = User::inRandomOrder()->first();
        $category = Category::inRandomOrder()->first();

        // Handle case where no users or categories exist
        $ownerId = $owner ? $owner->id : User::factory()->create()->id;
        $categoryId = $category ? $category->id : Category::factory()->create()->id;

        return [
            'nom' => $this->faker->word,
            'img_service' => $this->faker->imageUrl(400, 300), // Example of generating a random image URL
            'img_certificat' => $this->faker->imageUrl(400, 300), // Example of generating a random image URL
            'description' => $this->faker->sentence,
            'addresse' => $this->faker->address,
            'category_id' => $categoryId,
            'user_id' =>$ownerId,
        ];
    }
}
