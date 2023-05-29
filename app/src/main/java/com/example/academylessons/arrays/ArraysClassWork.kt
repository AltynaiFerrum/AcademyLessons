package com.example.academylessons.arrays

import android.util.Log

class ArraysClassWork {

    init {
        // exampleFirst()
        //exampleSecond()
        //exampleThird()
        //  exampleFour()
        //exampleFive()

    }


    fun exampleFirst() {
        val array: Array<Int> = arrayOf(1, 2, 3, 4)
        for (element in array) {
            Log.i("AndroidAcademy", element.toString())
        }
    }

    fun exampleSecond() {
        val names: Array<String> = arrayOf(
            "Bob",
            "Keane",
            "Michel",
            "Jack"

        )
        val bob: String = names[1]
        Log.i("AndroidAcademy", bob)
    }

    fun exampleThird() {
        var i = 10
        val numbers: Array<Int> = Array(20, { i++ * 2 })
        Log.i("AndroidAcademy", numbers.size.toString())
        for (number in numbers) {
            Log.i("AndroidAcademy", number.toString())
        }
    }


    fun exampleFour() {
        val array = mutableListOf<String>()
        Log.i(
            "AndroidAcademy",
            "Количество элементов в массиве = ${array.size}"
        )
        array.add("Bob")
        array.add("Michel")
        array.add(0, "Tom")
        array.add(2, "Jerry")

        Log.i(
            "AndroidAcademy",
            "Количество элементов в массиве = ${array.size}"
        )

        for (name in array) {
            Log.i(
                "AndroidAcademy",
                "Элемент = $name"
            )
        }

    }

    fun exampleFive() {
        val array = mutableListOf<Double>()
        array.add(0.0)
        array.add(0.10)
        if (array.isNotEmpty()) {
            Log.i("AndroidAcademy", array.first().toString())
        } else {
            Log.i("AndroidAcademy", "Массив пустой")
        }
        array.removeAt(1)
        for (element in array) {
            Log.i("AndroidAcademy", "Массив пустой")

        }
    }


}








