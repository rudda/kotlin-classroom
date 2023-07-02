package AulaOperadoresLogicos

fun main() {
    val segunda: String = "seg"
    val terca: String = "ter"
    val quarta: String = "qua"
    val quinta: String = "qui"
    val sexta: String = "sex"
    val sabado: String = "sab"
    val domingo: String = "dom"

    val dia = sabado;

    if( dia == sabado || dia == domingo) {
        println("Dia de folga")
    } else {
        println("Dia de trabalho")
    }

}