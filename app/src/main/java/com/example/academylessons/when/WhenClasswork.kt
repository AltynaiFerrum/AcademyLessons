package com.example.academylessons.`when`

import android.util.Log
import android.widget.TextView

class WhenClasswork {

    init {
        val temperature: Int = 20
        var temperatureMessage: String = ""

        when (temperature) {
            in 0..20 -> {
                temperatureMessage = "Холодная"
            }

            in 0..-20 -> {
                temperatureMessage = "Мороз"
            }

            in 20..40 -> {
                temperatureMessage = "Жарко"
            }

            in -20 downTo -100 -> {
                temperatureMessage = "Аномальный холод"
            }

            in 40..100 -> {
                temperatureMessage = "Аномальная жара"
            }
        }
        Log.i("AndroidAcademy", temperatureMessage)
    }
    }


