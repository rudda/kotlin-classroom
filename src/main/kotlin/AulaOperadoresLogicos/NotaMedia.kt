package AulaOperadoresLogicos

import kotlin.system.exitProcess

/**
 * Problema:
 * Escreva um programa que permita a um professor coletar as três notas
 * de um aluno na disciplina de História e calcular a média aritmética dessas notas.
 * Em seguida, o programa deve imprimir na tela se o aluno está aprovado ou não,
 * considerando a seguinte regra:
 * se a média for maior ou igual a 7, o aluno está aprovado,
 * caso contrário, o aluno está reprovado.
 */

fun main() {
    // coletar a nota 1
    print("Informe a  primeira nota do aluno:")
    val n1: Double = readln().toDouble()

    if( n1 >= 0 && n1 <=10 ){
        println("nota valida continue")
    } else {
        println("nota informada é invalida")
        exitProcess(1)
    }

    // coletar a nota 2
    print("Por favor insira a segunda nota:")
    val n2: Double = readln().toDouble()

    // coletar a nota 3
    print("Por favor insira a terceira nota:")
    val n3: Double = readln().toDouble()

    println("Nota 1: $n1")
    println("Nota 2: $n2")
    println("Nota 3: $n3")

    // calcular a média aritmetica das 3 notas
    val media : Double = (n1 + n2 + n3) / 3

    println("a media do aluno é: $media")

    // o aluno foi aprovado ?
    // if = se
    // if ( condição ) = condição = verdadeira ou falsa
    // operadores de comparação:
    // > maior >= maior igual
    // < menor <= menor igual
    // == igual
    // != diferente
    if( media >= 7) {
        println("O aluno foi aprovado")
    } else   { //senao
        println("O aluno foi reprovado")
    }


}


