package precision

import kotlin.math.abs

// https://dcain.etsin.upm.es/~carlos/bookCNP/02.02_Precision.html
fun main() {
    println("Hola Precision")
    val fracccion: Float = 1.0f / 6.0f
    var resultado: Float = 0.0f
    println("1/6 = $fracccion")

    for (i in 1..6) {
        resultado += fracccion
    }

    if (resultado == 1.0f) {
        println("Resultado correcto: $resultado")
    } else {
        println("Resultado incorrecto: $resultado")
    }

    if (abs(1.0f - resultado) < 0.00001f) {
        println("Resultado correcto con precisión de 0.00001: $resultado")
    } else {
        println("Resultado incorrecto con precisión de 0.00001: $resultado")
    }
}