package com.example.tema2actividades

import java.util.Scanner

fun contarMayoresDeEdad(vararg edades: Int): Int {
    return edades.count { it >= 18 }
}

fun main() {
    val cantidadMayoresDeEdad = contarMayoresDeEdad(25, 17, 30, 16, 20, 18, 22)
    println("Cantidad de personas mayores o iguales a 18 años: $cantidadMayoresDeEdad")
}
