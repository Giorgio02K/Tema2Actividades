package com.example.tema2actividades

fun main() {
    enteros(1,2,3,4,5,6)
}

fun enteros(vararg numeros: Int) {
    var suma = 0
    for (numero in numeros) {
        println(numero)
        suma += numero
    }

    println("La suma total es "+suma)
}