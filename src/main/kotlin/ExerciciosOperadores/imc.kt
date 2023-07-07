package ExerciciosOperadores

/**
 * entrada de dados:
 *  peso
 *  altura
 *  Processamento de dados
 *  imc = peso / altura * altura
 *  altura em metros e peso em Kq
 * Regras:
 * IMC entre 18,5 e 24,9: Peso normal
 * IMC entre 25,0 e 29,9: Sobrepeso
 * IMC entre 30,0 e 34,9: Obesidade Grau I
 * IMC entre 35,0 e 39,9: Obesidade Grau II
 * IMC acima de 40,0: Obesidade Grau III
 */


fun main() {
    // Inicio: entrada de dados
    println("Por favor, insira o peso:")
    var entradaDeDados = readln();
    val peso : Double = entradaDeDados.toDouble();

    println("Por favor, insira a sua altura:")
    entradaDeDados = readln();
    val altura = entradaDeDados.toDouble();
    // FIM: Entrada de dados

    // processamento de dados
    val imc = peso / (altura * altura)
    //val imc = peso / Math.pow(altura, 2.0);

    // FIM processamento de Dados

    // SAIDA de DADOS

    /*
    * Regras:
 * IMC entre 18,5 e 24,9: Peso normal
 * IMC entre 25,0 e 29,9: Sobrepeso
 * IMC entre 30,0 e 34,9: Obesidade Grau I
 * IMC entre 35,0 e 39,9: Obesidade Grau II
 * IMC acima de 40,0: Obesidade Grau III
 */
    val condicao_peso_normal: Boolean =  imc >= 18.5 && imc <= 24.9;
    val condicao_peso_sobrepeso =  imc >= 25.0 && imc <= 29.9;
    val condicao_peso_obesidade_1 =  imc >= 30 && imc <= 34.9;
    val condicao_peso_obesidade_2 =  imc >= 35 && imc <= 39.9;
    val condicao_peso_obesidade_3 =  imc >= 40;

    if( condicao_peso_normal) {
        println("IMC: $imc -> peso normal")
    } else if(condicao_peso_sobrepeso) {
        println("IMC: $imc -> sobrepeso")
    } else if( condicao_peso_obesidade_1 ) {
        println("IMC: $imc -> grau de obesidade 1")
    } else if( condicao_peso_obesidade_2) {
        println("IMC: $imc -> grau de obesidade 2")
    } else if( condicao_peso_obesidade_3 ){
        println("IMC: $imc -> grau de obesidade 3")
    } else {
        println("erro no processamento, verifique os dados informados")
    }


}