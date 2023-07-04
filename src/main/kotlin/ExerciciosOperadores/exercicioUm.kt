package ExerciciosOperadores

fun main() {
   // entrada de dados
   // O valor do empréstimo deve estar entre R$1.000 e R$100.000
   // taxa de juros entre 1% e 12 %
   // prazo : 1 e 10 anos
   // calcular o montante = valorEmprestado * (1 + taxaPorcentagem) ^ prazoAnos

  // entrada de dados do usuario
    println("Por favor informe o valor de Emprestimo: ")
    var entradaDeDados: String = readln()
    val emprestimo: Double = entradaDeDados.toDouble();
    println("Por favor, informe a taxa de juros anual ex: 12.1")
    entradaDeDados = readln();
    val taxa: Double = entradaDeDados.toDouble()
    println("Por favor, informe o prazo de contrato do empréstimo em anos")
    entradaDeDados = readln();
    val prazo : Int = entradaDeDados.toInt();

    val condicaoValorEmprestimo = emprestimo >= 1000 && emprestimo <= 100000;
    val condicaoJuros = taxa >= 1 && taxa <= 12;
    val condicaoPrazo = prazo >= 1 && prazo <= 10

    if( condicaoValorEmprestimo && condicaoJuros) {

            if( condicaoPrazo) {
               println("Emprestimo efetuado")
                // calcular o montante = valorEmprestado * (1 + taxaPorcentagem) ^ prazoAnos
                val taxaJuros: Double = 1.0 + (taxa/100.0);
                val montante = emprestimo * Math.pow(taxaJuros, prazo.toDouble())
                println("Voce emprestou $emprestimo a uma taxa de juros de $taxa ao ano")
                println("no prazo de $prazo anos com montante de $montante")

            }

    }

}