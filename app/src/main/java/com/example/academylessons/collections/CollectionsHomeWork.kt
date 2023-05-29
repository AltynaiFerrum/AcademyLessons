package com.example.academylessons.collections

import android.util.Log
import kotlin.math.log
import kotlin.random.Random

class CollectionsHomeWork {

    init {
        // homeworkFirst()
        // homeworkSecond()
        //homeworkThird()
        // homeworkFour()
       // homeworkFive()
       // homeworkSix()
       // homeworkSeven()
         // homeworkEight()
      // generateWord()
    }

    private fun generateWord () {
        var symbols = "abcdefghijklmnopqrstvwxyz"
        var String = ""
        for (i in 0..5) {
            var random = Random.nextInt(0, symbols.length)
            String += symbols.get(random)
        }
        return
    }


    private fun homeworkFirst() {
        val list = mutableListOf<Int>()
        var randomNumber: Int
        for (i in 0..4) {
            randomNumber = ((Math.random() * 9) + 1).toInt()
            list.add(randomNumber)

        }
        Log.i("AndroidAcademy", list.toString())

    }



    private fun homeworkSecond() {
        val words = readLine()?.split("")
        words?.forEach {
            if (it.length > 5) {
                Log.i("AndroidAcademy", it)
            }
        }
    }

    private fun homeworkThird() {
        val numbers = listOf(3, 5, 7, 12)
        var sum = 0
        numbers.forEach {
            if (it % 3 == 0) {
                sum += it
            }
        }
        Log.i("AndroidAcademy", "Сумма чисел, которые делятся на 3: $sum")
    }

    private fun homeworkFour() {
        val numbers = mutableSetOf<Int>()
        for (i in 1..20) {
            numbers.add(i)
        }

        numbers.removeIf { it % 2 != 0 }
        Log.i("AndroidAcademy", "Оставшиеся числа: $numbers")
    }

    private fun homeworkFive() {
        val squares = mutableMapOf<Int, Int>()
        for (i in 1..5) {
            squares[i] = i * i
        }
        Log.i("AndroidAcademy", "Содержимое словаря: $squares")
    }

    private fun homeworkSix() {
        val strings = mutableListOf("april", "banana", "cake", "august" )
        strings.removeAll{it.startsWith("a")}
        Log.i("AndroidAcademy", "Оставшиеся строки: $strings")
    }

    private fun homeworkSeven() {
        val numbers = intArrayOf(2,7,9,1,5,8,10)
        numbers.sort()
        Log.i("AndroidAcademy", "Отсортированный массив: ${numbers.joinToString()}")
    }

    private fun homeworkEight() {
        val numbers = listOf(5, 9, 2, 8, 7)
        val maxNumber = numbers.maxOrNull()
        val minNumber = numbers.minOrNull()
        Log.i("AndroidAcademy", "Максимальное число: $maxNumber")
        Log.i("AndroidAcademy", "Минимальное число: $minNumber")
    }
}