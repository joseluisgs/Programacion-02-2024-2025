package primos

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    println("Hola Primos")
    val initTime = System.currentTimeMillis()
    println("Primeros 100 números primos")
    printFirstPrimeNumbers(50000)
    println("Primeros 50 números primos gemelos")
    printFirstTwinPrimeNumbers(5000)
    val endTime = System.currentTimeMillis()
    println("Tiempo de ejecución: ${endTime - initTime} ms")
}

fun printFirstPrimeNumbers(number: Int = 35) {
    var count = 0
    var i = 2
    while (count < number) {
        if (isPrime(i)) {
            println("${count + 1}: $i")
            count++
        }
        i++
    }
}

fun printFirstTwinPrimeNumbers(number: Int = 35) {
    var count = 0
    var i = 2
    while (count < number) {
        if (areTwinPrimeNumbers(i)) {
            println("${count + 1}: $i, ${i + 2}")
            count++
        }
        i++
    }
}

fun printTwinPrimeNumbersInRange(start: Int = 2, end: Int = 100) {
    for (i in start..end) {
        if (areTwinPrimeNumbers(i)) {
            println("$i, ${i + 2}")
        }
    }
}

fun areTwinPrimeNumbers(num: Int): Boolean {
    return areTwinPrimeNumbers(num, num + 2)
}

fun areTwinPrimeNumbers(num1: Int, num2: Int): Boolean {
    return isPrime(num1) && isPrime(num2) && abs(num1 - num2) == 2
}

fun isPrime(num: Int): Boolean {
    when (num) {
        0, 1 -> return false
        in 2..3 -> return true
        else -> {
            if (num % 2 == 0) return false
            val sqrtNum = sqrt(num.toDouble()).toInt()
            for (i in 3..sqrtNum step 2) {
                if (num % i == 0) {
                    return false
                }
            }
            return true
        }
    }
}