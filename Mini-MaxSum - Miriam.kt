/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    val orderedArr = arr.sorted()
    var sum: Long = 0
    for (e in arr ){
        sum += e
    }

    val maxSum: Long = sum - orderedArr[0]
    val minSum: Long = sum - orderedArr[arr.size -1]

    val result = arrayOf(minSum, maxSum)
    println("${result[0]} ${result[1]}")

}


fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}