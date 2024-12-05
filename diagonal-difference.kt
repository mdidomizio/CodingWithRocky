fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leToRiSum = 0
    var riToLeSum = 0

    for (i in 0..arr.size-1){
        val y = (arr.size - 1) - i

        leToRiSum += arr[i][i]
        riToLeSum += arr[i][y]
    }

    var diff = leToRiSum - riToLeSum
    if (diff < 0) diff = (diff * -1)
    return diff

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
