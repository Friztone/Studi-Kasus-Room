/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Entity digunakan untuk menandai sebuah kelas sebagai entitas database.
 * Anotasi ini juga memberitahu Room untuk membuat tabel database berdasarkan nama kelas tersebut.
 */
@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    /**
     * @PrimaryKey digunakan untuk menandai sebuah properti sebagai kunci utama dalam tabel database.
     * Anotasi ini berfungsi untuk mengidentifikasi setiap data dalam tabel secara unik dan berbeda anatara data satu dengan lainnya
     */

    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
