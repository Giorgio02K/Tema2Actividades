package com.example.tema2actividades

import java.util.Scanner

fun crearArray(){
    var src = Scanner(System.`in`)
    println("Introduce la cantidad del array.")
    var cantidadArray = src.nextInt()
    var array = IntArray(cantidadArray)
    var num = 0
    for (i in 0 until array.size){
        println("Introduce un numero al array.")
        num = src.nextInt()
        array[i] = num
    }
    suma(array)
}

fun suma(array: IntArray){
    var totalSuma = 0
    for (i in 0 until array.size){
        totalSuma = totalSuma + array[i]
    }
    println("Total de la suma de los numeros del array " + totalSuma)
}
fun main() {
 crearArray()
}