package arrays

import kotlin.random.Random

fun main() {
    var serieATimes = arrayOf(
        "América Mineiro",
        "Athletico Paranaense",
        "Atlético Goianiense",
        "Atlético Mineiro",
        "Bahia",
        "Ceará",
        "Chapecoense",
        "Corinthians",
        "Cuiabá",
        "Flamengo",
        "Fluminense",
        "Fortaleza",
        "Grêmio",
        "Internacional",
        "Juventude",
        "Palmeiras",
        "Santos",
        "São Paulo",
        "Sport",
        "Vasco da Gama"
    )


    // contar quantos times há no array
    val tamanhoDoArray = serieATimes.size
    println("o tamanho do array é: $tamanhoDoArray")
    var contador = 0;

    for( times in serieATimes) {
        contador++
    }
     println("tamanho do array pelo contador é: $contador")

    // remover um time especifico
    var copyArrayTime = Array(tamanhoDoArray -1 ) { "" }
    println( "tamanho do copy array ${copyArrayTime.size}")
    val range = 0..(tamanhoDoArray - 1)
    var contadorCopy = 0
    for( i in range) {

        if( !(serieATimes[i]== "Palmeiras")) {
            //println( "original: ${serieATimes[i]}")
            copyArrayTime[contadorCopy] = serieATimes[i]
            contadorCopy++
        }
    }

    serieATimes = copyArrayTime
    for( time in serieATimes) {
        println(time)
    }

    for( i in range) {

        if( (serieATimes[i]== "Palmeiras")) {
            serieATimes[i] = "${serieATimes[i]}:  Não tem Mundial"
        }
    }

    for( time in serieATimes) {
        println(time)
    }

    //alterar o nome de um time

    val gastosDoMes = Array(30) { Random.nextDouble(1.0, 300.0) }

    // acumular valores
    var acumulador: Double = 0.0;
    for( gastoDia in gastosDoMes ) {
        acumulador+= gastoDia
    }

    println("Total gastos do Mês: ${acumulador}")
}