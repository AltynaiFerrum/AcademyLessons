package com.example.academylessons.arrays

import android.util.Log
import kotlin.random.Random

class ArraysHomeWork {

    init {
        //homeworkFirst()
        //homeworkSecond()
        // homeworkThird()
        // homeworkFour()
        // homeworkFive()
        //homeworkSix()
       // homeworkSeven()
        homeworkEight()
    }

    private fun homeworkFirst() {
        val arr = arrayOf(3, 4, 5, 6)
        var sum = 0
        for (i in arr) {
            sum += i
        }
        Log.i("AndroidAcademy", "Сумма элементов массива: $sum")

    }


    fun homeworkSecond() {
        var arr = arrayOf(7, 8, 9, 10, 11)
        var sum = 0
        for (i in arr) {
            sum += i
        }
        val average = sum.toInt() / arr.size
        Log.i("AndroidAcademy", "Среднее арифметическое элементов массива: $average")

    }


    fun homeworkThird() {
        val arr = arrayOf(5, 9, 2, 8, 7)
        var max = arr[0]
        var min = arr[0]
        for (i in arr) {
            if (i > max) {
                max = i
            }
            if (i < min) {
                min = i
            }
        }
        Log.i("AndroidAcademy", "Максимальный элемент: $max")
        Log.i("AndroidAcademy", "Минимальный элемент: $min")

    }


    fun homeworkFour() {
        val array = intArrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
        var sum = 0

        for (num in array) {
            if (num % 2 == 0) {
                sum += num
            }
        }
        Log.i("AndroidAcademy", "Сумма четных чисел в массиве: $sum")

    }


    fun homeworkFive() {
        val arr = Array(10) { 0 }
        for (i in arr.indices) {
            arr[i] =
                Random.nextInt(1, 100)
        }
        for (i in arr) {
            Log.i("AndroidAcademy", i.toString())
        }
    }


    fun homeworkSix() {
        val array = intArrayOf(5, 3, 4, 8, 10)
        var sum = 0
        var count = 0

        for (num in array) {
            sum += num
            count++
        }
        val average = sum / count
        Log.i("AndroidAcademy", "Среднее арифметическое: $average")

        val result = mutableListOf<Int>()
        for (num in array) {
            if (num > average) {
                result.add(num)
            }
        }
        Log.i("AndroidAcademy", "Элементы больше среднего арифметического: $result")

        }

     fun homeworkSeven() {
         val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 110,)
         Log.i("AndroidAcademy", "Введите число: 4")
         val number = readLine()?.toInt()?: return

         val result = mutableListOf<Int>()
         for (num in array) {
             if (num < number) {
                 result.add(num)
             }
         }
         Log.i("AndroidAcademy", "Элементы меньше числа $number: $result")

     }
        fun homeworkEight(){
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 2, 5 ,6)
            val frequencyMap = mutableMapOf<Int, Int>()
            var maxFrequency = 0

            for (num in array) {
                val frequency =
                    frequencyMap.getOrDefault(num, 0) + 1
                frequencyMap[num] = frequency
                if (frequency > maxFrequency) {
                    maxFrequency = frequency
                }
            }
            val mostFrequentElements = mutableListOf<Int>()
            for ((num, frequency) in frequencyMap) {
                if (frequency == maxFrequency) {
                    mostFrequentElements.add(num)
                }
            }
            Log.i("AndroidAcademy",
                "Наиболее часто встречающиеся элементы: $mostFrequentElements")

        }
        }











































