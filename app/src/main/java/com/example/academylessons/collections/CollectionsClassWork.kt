package com.example.academylessons.collections

import android.util.Log

class CollectionsClassWork {

    init {

        //exampleFirst()
        //exampleSecond()
        //exampleThird()
        //exampleFour()


    }

    private fun exampleFirst() {
        val list = listOf<Short>()
        val mutableList = mutableListOf<String>()

        // Объект лист мы в дальшейшем не можем изменять
        // list.add - отсутствует
        // list.remove - отсутствует

        // Обычное добавление
        mutableList.add("Bob")

        //Выборочное добавление
        mutableList.add(0, "Tom")

        //Обычное удаление объекта
        mutableList.remove("Bob")

        //Обычное удаление с помощью индекса
        mutableList.removeAt(index = 0)

        val secondMutableList = mutableListOf<String>()
        secondMutableList.add("Taxi")
        mutableList.addAll(secondMutableList)
        mutableList.add("passenger")

        Log.i("AndroidAcademy", mutableList.toString())


        //Способ перебирать объекты с помощью forEach
        mutableList.forEach { element ->

        }

        // Способ перебирания объектов с помощью for
        for (element in mutableList)
        {
            {

            }
            mutableList.clear()
        }


    }

    private fun exampleSecond() {
    val set = setOf<String>()
    val mutableSet = mutableListOf<String>()

    mutableSet.add("Bob")
    mutableSet.add("Bob")

    Log.i("AndroidAcademy", mutableSet.toString())

    mutableSet.remove("Bob")

    mutableSet.forEach { element -> }

    mutableSet.forEachIndexed { index, element -> }

}

    private fun exampleThird() {
    val map = mapOf<String, Int>()
    val mutableMap = mutableMapOf<String, Int>()

    mutableMap.put(key = "1234", value = 9)
    mutableMap.put(key = " ", value = 10)

    val nine = mutableMap[""]
    Log.i("AndroidAcademy", nine.toString())

}

    private fun exampleFour() {
    val hashSet = hashSetOf<String>()
    hashSet.add("dd")
    hashSet.add("dd")
    Log.i("AndroidAcademy", hashSet.toString())
}




}





















