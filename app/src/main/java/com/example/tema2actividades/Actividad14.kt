package com.example.tema2actividades

fun main() {
    var array1 = arrayOf(1,2,3,4)

    var array2 = arrayOf(5,6,7,8)

    var arraySuma = IntArray(4)

    for (i in 0 until array2.size){
        arraySuma[i] = array1[i] + array2[i]
        println("" + array1[i] + " + " + array2[i])
        println("La suma de los numeros es: " + arraySuma[i])
    }

}