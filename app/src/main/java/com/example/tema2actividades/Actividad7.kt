package com.example.tema2actividades

import java.util.Scanner


fun main() {
    var src = Scanner(System.`in`)

    println("Ingresa una palabra dos veces\nPrimera palabra: ")
    var palabra1 = src.nextLine()

    println("Introduce la segunda palabra")
    var palabra2 = src.nextLine()

    palabrasIguales(palabra1, palabra2)
}

fun palabrasIguales(p1:String, p2:String){
    if (p1.equals(p2)){
        println("Las dos palabras son iguales.")
    }else{
        println("Las dos palabras son diferentes.")
    }
}