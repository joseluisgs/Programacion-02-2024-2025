fun main() {
    println("INICIO")
    var tipoVia: String = "ciudad"
    var velocidadActual: Double = 0.0
    var tipoViaCorrecto: Boolean = false
    var velocidadActualCorrecto: Boolean = false
    val toleranciaVelocidad: Double = 1.1

    val velocidadMaximaCiudad: Double = 50.0 * toleranciaVelocidad
    val velocidadMaximaCarretera: Double = 90.0 * toleranciaVelocidad
    val velocidadMaximaAutovia: Double = 120.0 * toleranciaVelocidad


    println("Indica Tipo de vía [ciudad, carretera, autovia]:")
    tipoVia = readln().lowercase() // Leemos en minúsculas

    if ((tipoVia == "ciudad") || (tipoVia == "carretera") || (tipoVia == "autovia")) {
        tipoViaCorrecto = true
    } else {
        println("Error: tipo de vía incorrecto")
    }

    println("Indica la velocidad actual:")
    velocidadActual = readln().toDouble()

    if (velocidadActual < 0) {
        println("Error: velocidad actual inválida")
    } else {
        velocidadActualCorrecto = true
    }

    if (tipoViaCorrecto && velocidadActualCorrecto) {
        if ((tipoVia == "ciudad") && (velocidadActual > velocidadMaximaCiudad)) {
            println("Alerta multa: Excediendo velocidad máxima en una ciudad.")
        } else if ((tipoVia == "carretera") && (velocidadActual > velocidadMaximaCarretera)) {
            println("Alerta multa: Excediendo velocidad máxima en una carretera.")
        } else if ((tipoVia == "autovia") && (velocidadActual > velocidadMaximaAutovia)) {
            println("Alerta multa: Excediendo velocidad máxima en una autovía.")
        } else {
            println("Velocidad correcta.")
        }
        /*when {
            tipoVia == "ciudad" && velocidadActual > velocidadMaximaCiudad -> println("Alerta multa: Excediendo velocidad máxima en una ciudad.")
            tipoVia == "carretera" && velocidadActual > velocidadMaximaCarretera -> println("Alerta multa: Excediendo velocidad máxima en una carretera.")
            tipoVia == "autovia" && velocidadActual > velocidadMaximaAutovia -> println("Alerta multa: Excediendo velocidad máxima en una autovía.")
            else -> println("Velocidad correcta.")
        }*/
    } else {
        println("Error: datos incorrectos, ha habido un problema con la velocidad o el tipo de vía.")
    }

    println("FIN")


}