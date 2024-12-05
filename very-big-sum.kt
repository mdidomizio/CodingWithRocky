fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var sum: Long = 0
    for (e in ar){
        sum += e
    }
    return sum
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
