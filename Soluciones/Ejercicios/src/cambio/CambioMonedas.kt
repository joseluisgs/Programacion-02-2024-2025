package cambio

fun main() {
    println("Hola Cambio")
    val cantidad = leerCantidad()
    cambioMonedas(cantidad)
}

fun cambioMonedas(cantidad: Double) {
    val cantidadCentimos = (cantidad * 100).toInt()
    val moneda2Euro = 200
    val moneda1Euro = 100
    val moneda50Cent = 50
    val moneda20Cent = 20
    val moneda10Cent = 10
    val moneda5Cent = 5
    val moneda2Cent = 2
    val moneda1Cent = 1
    var resto = cantidadCentimos

    println("Cambio en monedas:")
    if (resto >= moneda2Euro) {
        val monedas2Euro = resto / moneda2Euro
        resto %= moneda2Euro
        println("$monedas2Euro moneda(s) de 2€")
    }
    if (resto >= moneda1Euro) {
        val monedas1Euro = resto / moneda1Euro
        resto %= moneda1Euro
        println("$monedas1Euro moneda(s) de 1€")
    }
    if (resto >= moneda50Cent) {
        val monedas50Cent = resto / moneda50Cent
        resto %= moneda50Cent
        println("$monedas50Cent moneda(s) de 50c")
    }
    if (resto >= moneda20Cent) {
        val monedas20Cent = resto / moneda20Cent
        resto %= moneda20Cent
        println("$monedas20Cent moneda(s) de 20c")
    }
    if (resto >= moneda10Cent) {
        val monedas10Cent = resto / moneda10Cent
        resto %= moneda10Cent
        println("$monedas10Cent moneda(s) de 10c")
    }
    if (resto >= moneda5Cent) {
        val monedas5Cent = resto / moneda5Cent
        resto %= moneda5Cent
        println("$monedas5Cent moneda(s) de 5c")
    }
    if (resto >= moneda2Cent) {
        val monedas2Cent = resto / moneda2Cent
        resto %= moneda2Cent
        println("$monedas2Cent moneda(s) de 2c")
    }
    if (resto >= moneda1Cent) {
        val monedas1Cent = resto
        println("$monedas1Cent moneda(s) de 1c")
    }
}

fun leerCantidad(): Double {
    print("Introduce la cantidad a cambiar: ")
    var inputOk = false
    var cantidad = 0.0
    while (!inputOk) {
        cantidad = readln().toDoubleOrNull() ?: 0.0
        if (cantidad > 0) {
            inputOk = true
        } else {
            println("Cantidad incorrecta. Inténtalo de nuevo.")
        }
    }
    return cantidad
}