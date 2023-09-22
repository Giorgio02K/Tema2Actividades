package com.example.tema2actividades

import java.util.Scanner

fun main() {
    introducirEnteros()

    producto()
}

fun introducirEnteros(){
    var src = Scanner(System.`in`)
    println("Introduce un numero entero")
    var num1 = src.nextInt()

    var cuadrado = num1*2
    println("El numero al cuadrado es " + cuadrado)
}

fun producto(){
    var src = Scanner(System.`in`)
    println("Introduce un numero entero")
    var num1 = src.nextInt()

    println("Introduce otro numero entero")
    var num2 = src.nextInt()

    var productoEntero = num1 * num2

    println("El producto de los numeros es " + productoEntero)

}