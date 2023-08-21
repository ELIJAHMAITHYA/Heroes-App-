package com.example.heroesapp.model

import androidx.annotation.StringRes

data class Hero(
 @StringRes   val nameRes: Int,
   @StringRes val descriptionRes : Int,
   @StringRes val imageRes: Int
)
