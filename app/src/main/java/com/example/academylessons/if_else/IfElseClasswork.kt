package com.example.academylessons.if_else

import android.util.Log

class IfElseClasswork {
    // example 1
    init {
        val isSubscribe: Boolean = true
        var message: String = ""
        if (isSubscribe) {
            message = "У вас есть подписка"
        } else {
            message = "У вас нету подписки"
        }

        Log.i("Altynai", message)


        // example 2
        val age: Int = 15

        var userMessage: String = ""
        if (age >= 0 && age <= 10) {
            userMessage = "Дитя"
        } else if (age >= 10 && age <= 20) {
            userMessage = "Подросток"
        } else if (age >= 20 && age <= 30) {
            userMessage = "Молодость"
        } else if (age >= 30 && age <= 55) {
            userMessage = "Средний возраст"
        } else {
            userMessage = "Старость"
        }
        Log.i("Altynai", userMessage)


        //  example 3
        val temperature: Double = 19.2
        var temperatureMessage: String = ""

        if (temperature >= 0 && temperature <= 20) {
            temperatureMessage = "Холодная"
        } else if (temperature >= -20 && temperature <= 0) {
            temperatureMessage = "Мороз"
        } else if (temperature >= 20 && temperature <= 40) {
            temperatureMessage = "Жарко"
        } else if (temperature <= -20) {
            temperatureMessage = "Аномальный холод"
        } else {
            temperatureMessage = "Аномальная жара"
        }
        Log.i("Altynai", temperatureMessage)
    }
}

