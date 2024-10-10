package dev.joseluisgs

fun main() {
    var i = 1
    while (i <= 10) {
        println("el valor de i es $i")
        i++
    }

    println("************")

    // hacia atras
    i = 10
    while (i >= 1) {
        println("el valor de i es $i")
        i--
    }

    println("************")

    // for con rango y paso 1
    for (j in 1..10) {
        println("el valor de j es $j")
    }

    println("************")

    // for con rango y paso 2
    for (j in 1..10 step 2) {
        println("el valor de j es $j")
    }

    println("************")

    // For hacia atras con paso 1
    for (j in 10 downTo 1) {
        println("el valor de j es $j")
    }

    println("************")

    // For con rango y paso 2 hacia atras
    for (j in 10 downTo 1 step 2) {
        println("el valor de j es $j")
    }

    println("************")
    // estos dos son lo mismo, van a hacerlas cosas 9 veces
    for (j in 1..<10) {
        println("el valor de j es $j")
    }

    for (j in 1..9) {
        println("el valor de j es $j")
    }

    for (j in 1 until 10) {
        println("el valor de j es $j")
    }

    for (j in 0 until 10) {
        println("el valor de j es $j")
    }

    // While con break en 6
    i = 1
    while (i <= 10) {
        println("el valor de i es $i")
        if (i == 6) {
            break
        }
        i++
    }
    // For con break en 6
    for (j in 1..10) {
        println("el valor de j es $j")
        if (j == 6) {
            break
        }
    }

    // while salir en 6
    i = 1
    while (i <= 10 && i != 6) {
        println("el valor de i es $i")
        i++
    }
    i = 1
    while (!(i > 10 || i == 6)) {
        println("el valor de i es $i")
        i++
    }


}