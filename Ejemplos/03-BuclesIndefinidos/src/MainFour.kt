fun main() {
    println("Dime un día de la semana:")
    var diaInput = false
    var dia = ""
    do {
        dia = readln().lowercase()
        when (dia) {
            "lunes", "martes", "miércoles", "jueves", "viernes" -> {
                println("Es un día laboral")
                diaInput = true
            }

            "sábado", "domingo" -> {
                println("Es un día festivo")
                diaInput = true
            }

            else -> {
                println("Día incorrecto, introduce un día de la semana:")
            }
        }
    } while (!diaInput)
}