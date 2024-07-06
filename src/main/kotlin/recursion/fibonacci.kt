package recursion



//fun fibonacci( i: Int): Int {
//    if( i <= 1) return i;
//    else {
//        return (fibonacci(i-1)+ fibonacci(i-2))
//    }
//}
//val sequence = fibonacci(4)
//println("result: $sequence")

//var a = 0
//var b = 1
//var fib = 1 // a+b
//var n = 8
//
//if( n <= 1){
//    println(n)
//    return
//}
//
//for(i in 2 .. n) {
//    fib = a + b;
//    a = b;
//    b = fib;
//}
//
//println("result: ${fib}")



















/* Sequência de Fibonacci
 A sequência de Fibonacci é definida da seguinte forma:
 F(n) = F(n-1) + F(n-2)
 com as condições iniciais:
 F(0) = 0
 F(1) = 1
 */
fun fibonacci(n : Int): Int {
    println("f($n)")
    if( n <= 1) {

        return n
    }

    return fibonacci( n -1) + fibonacci( n -2);
}
fun main() {
//F(n) = F(n-1) + F(n-2)
// 0,1,1,2,3,5,8
// f(0) = 0
// f(1) = 1
// f(2) =  f(2-1) + f(2-2) = f(1) + f(0) =   1 + 0 = 1
// f(3) = f(3-1) + f(3-2) = f(2) + f(1) = 1 + 1 = 2
// f(4) = f(4-1) + f(4-2) = f(3) + f(2) = 2 + 1 = 3
// f(5) = F(5-1) + F(5-2) = F(4) + F(3) = 3 + 2 = 5


    val n = 5
    val resultado = fibonacci(n)
    println("f($n)= $resultado")




}













