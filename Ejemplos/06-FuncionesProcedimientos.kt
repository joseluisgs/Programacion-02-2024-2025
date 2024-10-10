fun main() {
    println("Procedimientos y Funciones!")
    procedimientoImprime10Numeros()
    println()
    procedimientoImprime10Numeros()
    println()
    var numero: Int = dimeNumeroAleatorio()
    println("El número aleatorio es: $numero")
    println()
    numero = dimeNumeroAleatorio()
    println("El número aleatorio es: $numero")
    var suma = suma(5, 7)
    println("La suma de 5 + 7 es: $suma")
}

fun dimeNumeroAleatorio(): Int {
    val aleatorio = (1..100).random()
    return aleatorio
}


fun procedimientoImprime10Numeros() {
    for (i in 1..10) {
        println(i)
    }
}

fun suma(a: Int, b: Int): Int {
    return a + b
}

