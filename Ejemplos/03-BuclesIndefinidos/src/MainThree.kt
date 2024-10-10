fun main() {
    val APROBADO = 5.0
    val NOTABLE = 7.0
    val SOBRESALIENTE = 9.0

    var calificacion: Double = -1.0
    var inputCalificacion = false

    do {
        println("Introduce tu calificación:")
        calificacion = readln().toDoubleOrNull() ?: -1.0
        if (calificacion in 0.0..10.0) {
            inputCalificacion = true
        } else {
            println("La calificación debe estar entre 0 y 10")
        }
    } while (!inputCalificacion)

    when {
        calificacion < 0 || calificacion > 10 -> println("Calificación incorrecta")
        calificacion < APROBADO -> println("Has suspendido")
        calificacion >= APROBADO && calificacion < NOTABLE -> println("Has aprobado")
        calificacion >= NOTABLE && calificacion < SOBRESALIENTE -> println("Has sacado un notable")
        calificacion >= SOBRESALIENTE -> println("Has sacado un sobresaliente")
        else -> println("Calificación incorrecta")
    }
}