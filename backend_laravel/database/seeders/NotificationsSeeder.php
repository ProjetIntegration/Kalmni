<?php

namespace Database\Seeders;

use App\Models\Notifications;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class NotificationsSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
         Notifications::factory()->count(50)->create();
    }
}
