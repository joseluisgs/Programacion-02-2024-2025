fun main() {
    var number = 0
    var multiplicador = 0

    while (number <= 10) {
        while (multiplicador <= 10) {
            println("$number x $multiplicador = ${number * multiplicador}")
            multiplicador++
        }
        multiplicador = 0
        number++
        println("---")
    }

}