package com.example.academylessons.for_while

import android.util.Log

class ForWhileHomework {

    // 1 задача
    init {

        for (I in 1..10) {
            Log.i("AndroidAcademy", I.toString())
        }

        //2 задача
        var sum = 0
        for (i in 1..10) {
            sum += i
            Log.i("AndroidAcademy", i.toString())
        }

        // 3 задача
        for (i in 1..1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                Log.i("AndroidAcademy", "$i")
            }

        }

        // 4 задача
        for (I in 0..20 step 2) {
            Log.i("AndroidAcademy", I.toString())
        }

        // 5 задача
        var x = 0
        for (I in 0..50 step 5) {
            Log.i("AndroidAcademy", "5 * $x = $I")
            x++
        }

        // 5.1 задача
        var x1 = 0
        for (I in 0..100) {
            fun sqr(x1: Int): Int = x1 * x1
        }

        // 5.2 задача
        // var int1  = 1
        // var int2 = 1
        //var int3 =
        //   System.out.print(int1 + " " + int2 + " ")

        // for (int x = 3, x <= 20 x++) {
        // int3 = int1 + int2
        //   System.out.print(int3 + " ")
        // int1 = int2
        //  int2 = int3
    }

}

   // }

