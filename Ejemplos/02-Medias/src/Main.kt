fun main() {
    println("Calculo de medias aritméticas")
    print("Ingrese el primer número: ")
    val num1 = readln().toDouble()
    print("Ingrese el segundo número: ")
    val num2 = readln().toDouble()
    print("Ingrese el tercer número: ")
    val num3 = readln().toDouble()

    var valoresCorrectos = true

    // numeros deben estar entre 0 y 10
    if (num1 < 0 || num1 > 10) {
        println("El primer número debe estar entre 0 y 10")
        valoresCorrectos = false
        // hola
    }
    if (num2 < 0 || num2 > 10) {
        println("El segundo número debe estar entre 0 y 10")
        valoresCorrectos = false
    }
    if (num3 !in 0.0..10.0) {
        println("El tercer número debe estar entre 0 y 10")
        valoresCorrectos = false
    }

    if (valoresCorrectos) {
        val mediaAritmetica = (num1 + num2 + num3) / 3
        // Media entera sin usar el .toInt()
        var mediaEntera: Int = 0
        when (mediaAritmetica) {
            in 0.0..<0.5 -> mediaEntera = 0
            in 0.5..<1.5 -> mediaEntera = 1
            in 1.5..<2.5 -> mediaEntera = 2
            in 2.5..<3.5 -> mediaEntera = 3
            in 3.5..<4.5 -> mediaEntera = 4
            in 4.5..<5.5 -> mediaEntera = 5
            in 5.5..<6.5 -> mediaEntera = 6
            in 6.5..<7.5 -> mediaEntera = 7
            in 7.5..<8.5 -> mediaEntera = 8
            in 8.5..<9.5 -> mediaEntera = 9
            in 9.5..10.0 -> mediaEntera = 10
        }
        val mediaRedondeadaDosDecimales: Double = (mediaAritmetica * 100).toInt() / 100.0
        //var decimales = (mediaAritmetica * 100).toInt() % 100

        println("La media aritmética es: $mediaAritmetica")
        println("La media entera es: $mediaEntera")
        println("La media redondeada a dos decimales es: $mediaRedondeadaDosDecimales")
    } else {
        println("Los valores ingresados no son correctos")
    }
}