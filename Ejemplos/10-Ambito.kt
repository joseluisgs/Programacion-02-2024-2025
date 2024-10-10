var c = 5 //si quiere suspender ya sabes lo que no has de hacer con las variables globales

fun main() {
    var num1 = 5
    var num2 = 10
    c = 10
    var res = sumaAmbito(num1, num2)
    println("El resultado de la suma es: $res")
    println("El valor de num1 es: $num1")
    println("El valor de num2 es: $num2")
    println("El valor de c es: $c")
}

fun sumaAmbito(a: Int, b: Int): Int {
    var c = 20 // Esta variable c es local a la función sumaAmbito, cuidado con las variables globales
    var res = a + b
    return res
}
