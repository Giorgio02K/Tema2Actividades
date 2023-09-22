package com.example.tema2actividades
import java.util.Scanner
fun main() {
    var src = Scanner(System.`in`)
    println("Introduce los datos de 4 numeros")

    println("Numero 1")
    val variable1 = src.nextInt()

    println("Numero 2")
    val variable2 = src.nextInt()

    println("Numero 3")
    val variable3 = src.nextInt()

    println("Numero 4")
    val variable4 = src.nextInt()

    println("La suma del Numero1 y el Numero2 --> " + (variable1+variable2)+" . Y el producto del Numero3 y Numero4 --> " + (variable3%variable4)+".")
}