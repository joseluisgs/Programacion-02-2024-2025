package dev.joseluisgs

fun main() {
    var salirMenu = false
    do {
        println("Elija una de estas opciones:")
        println("1. Opción 1")
        println("2. Opción 2")
        println("3. Opción 3")
        println("4. Salir")
        var opcion = -1
        do {
            opcion = readln().toIntOrNull() ?: -1
            if (opcion < 1 || opcion > 4) {
                println("Opción incorrecta, elija una opción del 1 al 4")
            }
        } while (opcion < 1 || opcion > 4)

        when (opcion) {
            1 -> println("Ha elegido la opción 1")
            2 -> println("Ha elegido la opción 2")
            3 -> println("Ha elegido la opción 3")
            4 -> salirMenu = true
        }

    } while (!salirMenu)

}