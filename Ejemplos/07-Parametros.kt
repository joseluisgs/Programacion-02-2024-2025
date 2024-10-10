fun main() {
    imprimeNVeces(5, "Hola, mundo!")

    val num1 = 5
    val num2 = 10

    var res = miSuma(num1, num2)
    println("La suma de $num1 y $num2 es: $res")
    res = miResta(num1, num2)
    println("La resta de $num1 y $num2 es: $res")
    res = miMultiplicacion(num1, num2)
    println("La multiplicación de $num1 y $num2 es: $res")
    res = miDivision(num1, num2)
    println("La división de $num1 y $num2 es: $res")

}

fun imprimeNVeces(n: Int, texto: String) {
    for (i in 1..n) {
        println(texto)
    }
}

fun miSuma(a: Int, b: Int): Int {
    return a + b
}

fun miResta(a: Int, b: Int): Int {
    return a - b
}

fun miMultiplicacion(a: Int, b: Int): Int {
    return a * b
}

fun miDivision(a: Int, b: Int): Int {
    return a / b
}