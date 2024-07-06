package problems.solving

import java.time.Year

fun main() {
    val year = 2024;
    val result = solution(year);
    println("o ano $year pertence ao século $result");
}

//For year = 1905, the output should be solution(year) = 20; For year = 1700,
// the output should be solution(year) = 17. Input/Output
//[execution time limit] 3 seconds (kt)

fun solution( year: Int): Int {
    return if( year in 1..2005) {
        if( year in 1..100 ){
            return 1
        } else {
            if( year % 100 == 0) {
                return year/100;
            } else {
                return  (year/100) +1;
            }
        }
    } else {
        0
    }
}

