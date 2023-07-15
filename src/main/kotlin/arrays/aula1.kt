package arrays
fun main() {
    var numerosImpares: Array<Int> = arrayOf(1,3,5,7,9,11,13,15,17,19,21)
    var primeiro_el = 0
    println(numerosImpares[0])
    val tam = numerosImpares.size
    var ultimo_el = tam -1
    println("o tamanho do array: $tam")
    println(numerosImpares[ultimo_el])
    // imprimir elemento por elemento
    println("------------------------------------")
    println(numerosImpares[primeiro_el])
    primeiro_el++ // 1
    println(numerosImpares[primeiro_el])
    primeiro_el++ // 2
    println(numerosImpares[primeiro_el])
    primeiro_el++ // 3
    println(numerosImpares[primeiro_el])
    println("---------------substituição de valore ---------------------")
    // substituir valores
    println("Vamos substituir >>  ${numerosImpares[ultimo_el]} por: 2")
    numerosImpares[ultimo_el]= 2
    println("novo valor:  ${numerosImpares[ultimo_el]}")
    println("---------------Acionar um elemento ao array ---------------------")
    numerosImpares+= 23
    ultimo_el = numerosImpares.size -1
    println("ultimo elemento: ${numerosImpares[ultimo_el]}")

}
