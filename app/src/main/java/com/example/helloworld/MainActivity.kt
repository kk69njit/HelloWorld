package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.github.matteobattilana.weather.PrecipType
import com.github.matteobattilana.weather.WeatherView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This forces app into light mode.
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        // This is the rain particles
        val weatherView = findViewById<WeatherView>(R.id.weather_view)
        weatherView.apply {
            setWeatherData(PrecipType.RAIN)
            speed = 1000
            emissionRate = 90f
        }

        // This controls the button.
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Toast.makeText(this, "Hello to you too, friend. Stay dry!", Toast.LENGTH_SHORT).show()
        }
    }
}