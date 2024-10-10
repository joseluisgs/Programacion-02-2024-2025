fun main() {
    var edad = 0
    var edadCorrecta = false

    do {
        println("Introduce tu edad:")
        edad = readln().toIntOrNull() ?: -1
        if (edad in 0..150) {
            edadCorrecta = true
        } else {
            println("La edad debe estar entre 0 y 150 años")
        }
    } while (!edadCorrecta)


    if (edad >= 18) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }
}