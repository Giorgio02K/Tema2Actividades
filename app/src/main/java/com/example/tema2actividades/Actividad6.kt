package com.example.tema2actividades

import java.util.Scanner

var src = Scanner(System.`in`)
fun main() {
    numeroMenor()
    numeroMenor()
}

fun numeroMenor(){
    var src = Scanner(System.`in`)
    println("Introduce un numero.")
    var num1 = src.nextInt()

    println("Introduce otro numero.")
    var num2 = src.nextInt()

    println("Introduce otro numero.")
    var num3 = src.nextInt()

    if (num1 > num2 && num1 > num3){
        println("El numero " + num1 + " es el numero mayor")
    }else if (num2 > num1 && num2 > num3){
        println("El numero " + num2 + " es el numero mayor")
    }else if (num3 > num1 && num3 > num2){
        println("El numero " + num3 + " es el numero mayor")
    }else{
        println("No hay un numero mayor que otro")
    }

}