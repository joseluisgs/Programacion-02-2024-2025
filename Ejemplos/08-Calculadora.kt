fun main() {
    println("Hola, calculadora")
    val numero1 = leerNumeroEntero("Ingrese el primer número")
    val numero2 = leerNumeroEntero("Ingrese el segundo número")
    val operacion = leerOperacion()
    val resultado = calcularResultado(numero1, numero2, operacion)
    println("El resultado de $numero1 $operacion $numero2 es $resultado")
}


fun leerNumeroEntero(mensaje: String): Int {
    var input = false
    var numero = 0
    do {
        println(mensaje)
        numero = readln().toIntOrNull() ?: Int.MAX_VALUE
        if (numero == Int.MAX_VALUE) {
            println("Por favor, ingrese un número entero")
        } else {
            input = true
        }
    } while (!input)
    return numero
}

fun leerOperacion(): Char {
    var input = false
    var operacion = '0'
    do {
        println("Ingrese una operación (+, -, *, /): ")
        operacion = readln().singleOrNull() ?: '0'
        if (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/') {
            println("Por favor, ingrese una operación válida")
        } else {
            input = true
        }
    } while (!input)
    return operacion
}

fun calcularResultado(numero1: Int, numero2: Int, operacion: Char): Int {
    var res = 0
    when (operacion) {
        '+' -> res = sumaCalculadora(numero1, numero2)
        '-' -> res = restaCalculadora(numero1, numero2)
        '*' -> res = multiplicacionCalculadora(numero1, numero2)
        '/' -> res = divisionCalculadora(numero1, numero2)
    }
    return res
}

fun sumaCalculadora(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}

fun restaCalculadora(numero1: Int, numero2: Int): Int {
    return numero1 - numero2
}

fun multiplicacionCalculadora(numero1: Int, numero2: Int): Int {
    return numero1 * numero2
}

fun divisionCalculadora(numero1: Int, numero2: Int): Int {
    var res = 0
    if (numero2 == 0) {
        println("No se puede dividir por cero")
    } else {
        res = numero1 / numero2
    }
    return res
}