<?php

namespace Database\Factories;

use App\Models\Services;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\service_schedule>
 */
class service_scheduleFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        $serviceId = Services::inRandomOrder()->first()->id;

        return [
            'heure_debut' => $this->faker->time(),
            'heure_fin' => $this->faker->time(),
            'jour' => $this->faker->dayOfWeek,
            'services_id' => $serviceId,
        ];
    }
}
