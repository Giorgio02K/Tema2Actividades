package com.example.tema2actividades

import java.util.Scanner

infix fun Int.esMayorQue(num2:Int): Boolean {
    if (this > num2){
        println("El numero " + this + " es el numero mayor.")
        return true
    }
    println("El numero " + num2 + " es el numero mayor.")
    return false
}
fun main() {
    var src = Scanner(System.`in`)
    println("Escribe un numero")
    var num1 = src.nextInt()

    println("Escribe otro numero")
    var num2 = src.nextInt()

    num1.esMayorQue(num2)
}