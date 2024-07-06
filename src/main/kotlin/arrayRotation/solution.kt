package arrayRotation

fun rotateArray(arr: IntArray, k: Int): IntArray {
    val n = arr.size
    val result = IntArray(n)

    for (i in arr.indices) {
        result[(i + k) % n] = arr[i]
    }

    return result
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val k = 2
    val rotatedArr = rotateArray(arr, k)
    println(rotatedArr.joinToString(", ")) // Saída: 4, 5, 1, 2, 3
}
