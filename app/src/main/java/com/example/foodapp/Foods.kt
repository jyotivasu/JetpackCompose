package com.example.foodapp

import androidx.annotation.DrawableRes

data class Food(
    @DrawableRes val imgResource: Int,
    val title: String,
    val desc: String
)

val foodList = listOf(
    Food(R.drawable.burger, "Veg Burger", "Burger starting from Rs 80."),
    Food(R.drawable.pizza, "Mushroom Pizza", "Get pizza at Rs 100."),
    Food(R.drawable.icecream, "Chocolate Ice-cream", "Get all variety of ice-creams at Rs 70."),
    Food(R.drawable.momos, "Veg Momos", "Get 10% off."),
    Food(R.drawable.donut, "Donut", "Get 5 donuts at Rs 300."),
    Food(R.drawable.noodles, "Egg Noodles", "Get 10% off all noodles."),
    Food(R.drawable.pancake, "Pancake", "Pancakes starting from Rs 120."),
    Food(R.drawable.sandwich, "Paneer Sandwich", "Buy 2 Get 1 Free.")
)