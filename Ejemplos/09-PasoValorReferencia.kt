fun main() {
    var num1 = 5
    var num2 = 10
    var res = sumaValor(num1, num2)
    println("El resultado de la suma es: $res")
    println("El valor de num1 es: $num1")
    println("El valor de num2 es: $num2")

    var numArray1 = intArrayOf(num1)
    var numArray2 = intArrayOf(num2)
    res = sumaReferencia(numArray1, numArray2)
    println("El resultado de la suma es: $res")
    println("El valor de num1 es: ${numArray1[0]}")
    println("El valor de num2 es: ${numArray2[0]}")


}

fun sumaValor(a: Int, b: Int): Int {
    //a = a + 1  // Esta línea no tiene efecto en el valor de num1 y num2, solo modifica el valor de a en la función
    return a + b
}

fun sumaReferencia(a: IntArray, b: IntArray): Int {
    a[0] = a[0] + 1
    return a[0] + b[0]
}

