package vuelo

import kotlin.random.Random

fun main() {
    println("Simulador de Vuelo")
    var velocidadCrucero = 0
    var altitudCrucero = 0
    var velocidadActual = 0
    var altitudActual = 0
    val TIEMPO_MAX = 300
    var temporizador = 0
    var hayFalloSistema = false
    val TIEMPO_ESPERA = 200
    val probabilidadFalloSistema = 20

    velocidadCrucero = leerEntero("Introduzca la Velocidad de Crucero: ")
    altitudCrucero = leerEntero("Introduzca la Altitud de Crucero: ")

    velocidadActual = velocidadCrucero
    altitudActual = altitudCrucero

    println("Comenzando el vuelo")
    println("Velocidad Actual: $velocidadActual")
    println("Altitud Actual: $altitudActual")
    println("Velocidad Crucero: $velocidadCrucero")
    println("Altitud Crucero: $altitudCrucero")

    do {
        println("Obteniendo datos")
        velocidadActual = getDatosActualesVelocidad(velocidadActual)
        altitudActual = getDatosActualesAltitud(altitudActual)
        println("Velocidad Actual: $velocidadActual")
        println("Altitud Actual: $altitudActual")

        println("Aplicando correcciones")
        velocidadActual = correccionVelocidad(velocidadCrucero, velocidadActual)
        altitudActual = correccionAltitud(altitudCrucero, altitudActual)

        println("Velocidad Actual: $velocidadActual")
        println("Altitud Actual: $altitudActual")

        hayFalloSistema = probabilidad(probabilidadFalloSistema)
        temporizador += 10
        esperar(TIEMPO_ESPERA)
        println("Tiempo de Vuelo: $temporizador")
    } while (temporizador <= TIEMPO_MAX && !hayFalloSistema)

    if (hayFalloSistema) {
        println("Volviendo a control manual porque ha habido un fallo en el sistema")
    } else {
        println("Volviendo a control manual porque ha terminado el tiempo")
    }
}

fun getDatosActualesVelocidad(velocidadActual: Int): Int {
    val nuevaVelocidad = velocidadActual + getVelocidadActual()
    return if (nuevaVelocidad < 0) 0 else nuevaVelocidad
}

fun getDatosActualesAltitud(altitudActual: Int): Int {
    val nuevaAltitud = altitudActual + getAltitudActual()
    return if (nuevaAltitud < 0) 0 else nuevaAltitud
}

fun correccionVelocidad(velocidadCrucero: Int, velocidadActual: Int): Int {
    return if (velocidadActual < velocidadCrucero) velocidadActual + 1 else velocidadActual - 1
}

fun correccionAltitud(altitudCrucero: Int, altitudActual: Int): Int {
    return if (altitudActual < altitudCrucero) altitudActual + 1 else altitudActual - 1
}

fun probabilidad(limite: Int): Boolean {
    return (1..100).random() <= limite
}

fun esperar(tiempo: Int) {
    Thread.sleep(tiempo.toLong())
}

fun getVelocidadActual(): Int {
    return (Random.nextDouble() * 20).toInt() - 10
}

fun getAltitudActual(): Int {
    return (Random.nextDouble() * 20).toInt() - 10
}

fun leerEntero(mensaje: String): Int {
    println(mensaje)
    var inputOk = false
    var numero = 0
    while (!inputOk) {
        numero = readln().toIntOrNull() ?: -1
        if (numero >= 0) {
            inputOk = true
        } else {
            println("Número incorrecto. Inténtelo de nuevo.")
        }
    }
    return numero
}