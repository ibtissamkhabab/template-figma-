package com.example.card

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvFlights = findViewById<RecyclerView>(R.id.rvFlights)
        rvFlights.layoutManager = LinearLayoutManager(this)

        val flightList = listOf(
            Flight("Indigo", "DEL", "06:30", "Free Meal", "04h 15m", "BLR", "10:45", "7,319", "Use Code : flyaway10 and get 60% instant cashback"),
            Flight("Vistara", "DEL", "07:15", "Free Meal", "02h 25m", "BLR", "09:40", "7,319", "Use Code : flyaway10 and get 60% instant cashback"),
            Flight("Spicejet", "DEL", "07:55", "Free Meal", "02h 10m", "BLR", "10:05", "7,319", "User UNIQUE and get ₹250 instant discount"),
            Flight("Indigo", "DEL", "08:45", "Free Meal", "02h 25m", "BLR", "11:10", "7,319", "Use Code : flyaway10 and get 60% instant cashback"),
            Flight("Emirates", "DEL", "10:00", "Free Meal", "02h 15m", "BLR", "12:15", "7,319", "User UNIQUE and get ₹250 instant discount")
        )

        rvFlights.adapter = FlightAdapter(flightList)
    }
}
