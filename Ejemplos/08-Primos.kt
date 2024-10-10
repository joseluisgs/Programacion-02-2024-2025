fun main() {
    println("Hola, calculadora de números primos")
    val numero = leerNumeroEntero("Ingrese un número")
    if (esPrimo(numero)) {
        println("El número $numero es primo")
    } else {
        println("El número $numero no es primo")
    }
    println("Los números primos entre 1 y $numero son:")
    primosEntre(1, numero)
}


fun esPrimo(n: Int): Boolean {
    // 1, 2, 3 son primos
    if (n <= 3) {
        return true
    }
    // Si es divisible por 2, no es primo
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun primosEntre(inicio: Int, fin: Int) {
    for (i in inicio..fin) {
        if (esPrimo(i)) {
            println(i)
        }
    }
}