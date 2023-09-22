package com.example.tema2actividades

import java.util.Scanner

fun main() {
    println("El promedio de numeros enteros es --> " + promedio())
}

fun promedio():Int{
    var src = Scanner(System.`in`)

    println("Introduce el numero 1")
    var numero1 = src.nextInt()

    println("Introduce el numero 2")
    var numero2 = src.nextInt()

    println("Introduce el numero 3")
    var numero3 = src.nextInt()

    var promedioEnteros = (numero1 + numero2 + numero3) / 3
    return promedioEnteros

}