package com.example.tema2actividades
import java.util.Scanner
import kotlin.math.roundToInt

fun main() {
    var src = Scanner(System.`in`)

    println("Introduce los datos de 3 variables")

    println("Variable 1")
    val variable1 = src.nextFloat()

    println("Variable 2")
    val variable2 = src.nextFloat()

    println("Variable 3")
    val variable3 = src.nextFloat()

    var suma:Float = variable1 + variable2 + variable3
    var promedio:Float = suma / 3
    var redondeo = (promedio * 1000.00).roundToInt() / 1000.00
    println("El promedio de pesos es de --> $redondeo")







}