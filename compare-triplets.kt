fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aScore = 0
    var bScore = 0
    for (i in 0.. a.size - 1)
        if(a[i] == b[i]){
            aScore + 0
            bScore + 0
        } else if (a[i] > b[i]){
            aScore++
        } else bScore++

    val result: Array<Int> = intArrayOf(aScore, bScore).toTypedArray()

    return result
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}