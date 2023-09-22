package com.example.tema2actividades

import java.util.Scanner

fun main() {
    var src = Scanner(System.`in`)

    println("Introduce el precio de un producto 'X'.")
    var precio = src.nextFloat();

    println("Introduce el dinero que tienes disponible.")
    var dinero = src.nextFloat()

    if(dinero < precio){
        println("No llevas suficiente dinero para comprar el producto.\nEl precio es de " + precio + " y solo llevas " + dinero + ". Te faltarian " + (precio - dinero) + " para poder comprar el prodcuto.")
    }else{
        println("El cliente debe abonar " + precio + " para poder comprar el producto.")
    }

}