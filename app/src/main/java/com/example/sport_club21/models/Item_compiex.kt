package com.example.sport_club21.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "models_gyms")

data class Item_compiex(
    @PrimaryKey(autoGenerate = true)
    var title: String?,
    var description: String?,
    var image1: Int?,
    var image2: Int?,
): Serializable


