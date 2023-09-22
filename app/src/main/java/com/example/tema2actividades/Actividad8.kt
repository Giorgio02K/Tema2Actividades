package com.example.tema2actividades

import java.util.Scanner

fun main() {
    numerosOrdenados()
}

fun numerosOrdenados(){
    var src = Scanner(System.`in`)

    println("Introduce el numero 1")
    var numero1 = src.nextInt()

    println("Introduce el numero 2")
    var numero2 = src.nextInt()

    println("Introduce el numero 3")
    var numero3 = src.nextInt()

    var array = IntArray(3)

    array[0] = numero1
    array[1] = numero2
    array[2] = numero3

    array.sort()
    print("Los numeros ordenados --> ")

    for (i in 0..2){
        print("" + array[i] + ", ")
    }
}