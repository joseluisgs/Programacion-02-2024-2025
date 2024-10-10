fun main() {
    var number = 0
    var numberInput = false
    do {
        println("Introduce un número:")
        number = readln().toIntOrNull() ?: -1
        if (number < 0) {
            println("El número introducido no es válido.")
        } else {
            numberInput = true
        }
    } while (!numberInput)

    var multiplicador = 0
    while (multiplicador <= 10) {
        println("$number x $multiplicador = ${number * multiplicador}")
        multiplicador++
    }

}