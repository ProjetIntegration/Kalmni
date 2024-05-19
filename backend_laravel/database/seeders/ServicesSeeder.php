<?php

namespace Database\Seeders;

use App\Models\service_schedule;
use App\Models\Services;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class ServicesSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Services::factory()->count(5)->create()->each(function ($service) {
            $service->service_schedule()->create(service_schedule::factory()->make()->toArray());
        });
    }
}
