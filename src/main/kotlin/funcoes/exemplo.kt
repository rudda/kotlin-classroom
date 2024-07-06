package funcoes

fun main() {
    val soma = adicionar(2,2)
    println(soma)
    subtrair(2, 10)
    subtrair(16, 100)
    println(retornarMeuNome())
    println(escrevaMeuNome())
    printar()
}

// fun com retorno e param
fun adicionar(numero1: Int, numero2 : Int): Int {
    return (numero1 + numero2)
}
// fun sem retorn e com param
fun subtrair(numero1: Int, numero2 : Int) {
    val sub = numero2 - numero1
    println("Subtracao: $sub")
}

fun retornarMeuNome(): String {
    return "Rudda Beltrao"
}

fun escrevaMeuNome() = "Ruddá"

// fun sem retorno e sem param
fun printar() {
    println("printando ...")
}

