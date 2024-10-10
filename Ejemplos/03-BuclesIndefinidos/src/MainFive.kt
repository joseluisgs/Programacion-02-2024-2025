fun main() {
    println("Dime la temperatura en grados Celsius:")
    var temperaturaInput = false
    var temperatura = 0.0

    do {
        temperatura = readln().toDoubleOrNull() ?: Double.NaN
        if (temperatura.isNaN()) {
            println("Por favor, introduce un número válido.")
        } else {
            temperaturaInput = true
        }
    } while (!temperaturaInput)

    val temperaturaFahrenheit = (temperatura * 9 / 5) + 32
    println("La temperatura en grados Fahrenheit es: $temperaturaFahrenheit")
}