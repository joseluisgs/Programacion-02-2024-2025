package simulacion

fun main() {
    val TIEMPO_SIMULACION = 10000 // Tiempo de simulación
    val incrementoTiempo = 1000 // Incremento de tiempo
    var tiempo = 0 // Tiempo actual
    val PROBABILIDAD_ACCION = 0.20 // Probabilidad de realizar una acción
    var salidaPorProbabilidad = false // Indica si se realizó una acción

    do {
        // Esperar un segundo para la próxima iteración
        Thread.sleep(incrementoTiempo.toLong())
        tiempo += incrementoTiempo
        println("Tiempo: $tiempo")
        // Simular acciones durante el tiempo
        // ...

        // Verificar si hay una probabilidad de salida antes
        salidaPorProbabilidad = probabilidad(PROBABILIDAD_ACCION)
    } while (tiempo < TIEMPO_SIMULACION && !salidaPorProbabilidad)

    if (salidaPorProbabilidad) {
        println("Se ha salido por probabilidad")
    } else {
        println("Se ha llegado al tiempo de simulación")
    }

    println("Fin de la simulación")
}

fun probabilidad(probabilidad: Double): Boolean {
    val random = Math.random()
    return random < probabilidad
}