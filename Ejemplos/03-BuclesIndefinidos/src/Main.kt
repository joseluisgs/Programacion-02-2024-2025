fun main() {
    println("Empiezo el bucle while")
    var i = 1
    while (i <= 10) {
        println("Hola 1DAW $i")
        i++
    }
    println("Fin del bucle while")

    println("Empiezo el bucle do-while")
    var j = 1
    do {
        println("Hola 1DAW $j")
        j++
    } while (j <= 10)
    println("Fin del bucle do-while")

    var numero = 1
    while (numero <= 100) {
        if (numero % 2 == 0) {
            println("El número $numero es par")
        } else {
            println("El número $numero es impar")
        }
        numero++
    }
}