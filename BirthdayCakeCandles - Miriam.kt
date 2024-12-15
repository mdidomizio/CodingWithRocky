fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var numberOfMax = 0
    val max = candles.max()
    for (i in candles.indices) {
        if (max == candles[i]) {
            numberOfMax++
        }
    }
    return numberOfMax
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}