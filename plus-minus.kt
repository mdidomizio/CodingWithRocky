fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here

    var sumPos = 0
    var sumNeg = 0
    var sumZero = 0

    for (e in arr) {
        when {
            e < 0 -> sumNeg++
            e > 0 -> sumPos++
            else -> sumZero++
        }
    }

    val n = arr.size

    val formattedPos = String.format("%.6f", sumPos.toDouble() / n.toDouble()).replace('.', ',')
    val formattedNeg = String.format("%.6f", sumNeg.toDouble() / n.toDouble()).replace('.', ',')
    val formattedZero = String.format("%.6f", sumZero.toDouble() / n.toDouble()).replace('.', ',')

    println(formattedPos)
    println(formattedNeg)
    println(formattedZero)
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
