package dev.joseluisgs

import java.lang.Math.random

fun main() {
    // Número aleatorio entre 0 y 1
    val numeroAleatorio = random()
    println("Número aleatorio entre 0 y 1: $numeroAleatorio")

    // Número aleatorio entero entre 0 y 100
    val numeroAleatorio100 = (random() * 100).toInt()
    println("Número aleatorio entero entre 0 y 100: $numeroAleatorio100")

    // Número aleatorio entero entre 10 y 20
    val numeroAleatorio1020 = (random() * 10 + 10).toInt()

    println("Número aleatorio entero entre 10 y 20: $numeroAleatorio1020")

    // forma kotlin de hacerlo
    val numeroAleatorio10202 = (10..20).random()
    println("Número aleatorio entero entre 10 y 20 (Kotlin): $numeroAleatorio10202")

    // Juego de los dados
    val dado1 = (1..6).random()
    val dado2 = (1..6).random()
    println("Resultado de tirar dos dados: $dado1 + $dado2")

    // Cara o cruz
    println("elige cara o cruz:")
    val eleccion = readln()
    val resultado = if (random() < 0.5) "cara" else "cruz"
    if (eleccion == resultado) {
        println("Has acertado")
    } else {
        println("Has fallado")
    }

    // La posibilidad de que me toque el 1 de oros que es el 22
    var carta = (1..40).random()
    println("Carta aleatoria: $carta")
    if (carta == 22) {
        println("Has ganado")
    } else {
        println("Has perdido")
    }

    // Tanda de 5 penaltis la probabilidad es de 75%
    var goles = 0
    for (i in 1..5) {
        println("Tiro $i:")
        if (random() < 0.75) { // if ((1..100).random() <= 75)
            println("Gol")
            goles++
        } else {
            println("Fallo")
        }
    }
    println("Has marcado $goles goles")

}