package com.example.tema2actividades

import java.util.Scanner

fun main() {
    var src = Scanner(System.`in`)
    println("Introduce 10 numeros por teclado.")
    var array = IntArray(10)

    for (i in 0 until array.size){
        println("Introduce el numero n" + (i +1))
        var num = src.nextInt()
        array[i] = num
    }
    var contCero = 0
    var contDifCero = 0

    for (i in 0 until array.size){

        when(array[i]){
            0 -> println("Hay " + (++contCero) + " numeros que son 0")

            in 1 .. 100000 -> println("Hay " + (++contDifCero) + " diferentes a 0")
        }
    }
}