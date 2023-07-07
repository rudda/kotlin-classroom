package AulaOperadoresLogicos

fun main() {

    var media = 1

    val media_a = media > 9
    val media_b = media <=9  && media >=7
    val media_c = media < 7

    println(media_a)
    println(media_b)
    println(media_c)


    if( media_a ) {
    println("aluno media a")
    }
    if (media_b) {
    println("aluno media b")
    }
    if (media_c) {
    println("aluno media c")
    }

}