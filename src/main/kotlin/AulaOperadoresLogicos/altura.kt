package AulaOperadoresLogicos

fun main(args: Array<String>) {
    val altura_mario = 1.80
    val idade_mario = 19
    val sexo_mario = "m"

    val condicao_altura = altura_mario >= 1.80
    val condicao_idade = idade_mario >= 18 && idade_mario <= 24
    val condicao_sexo = sexo_mario == "m"


    if( ! (altura_mario >= 1.80) )  {
        println("o atlena não atingiu a altura necessaria de 1.80 M")
    }
    if (! condicao_sexo) { // so entra verdades
        println("o atlena não corresponde ao sexo desejado para seleção do time")
    }

    if(!( condicao_idade )) {
        println("O Atleta nao tem a idade necessaria para seleção")
    }

    if( condicao_altura && condicao_idade && condicao_sexo) {
        println("atleta selecionado")
    } else {
        println("atleta não selecionado")
    }

}
