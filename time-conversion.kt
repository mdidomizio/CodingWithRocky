fun timeConversion(s: String): String {
    // Write your code here
    val withoutPmAm = s.dropLast(2).toCharArray()
    var hour = ("${withoutPmAm[0]}${withoutPmAm[1]}").toInt()
    val isPm = s.contains('P')
    val hourString12Am = ("00")
    val hourStringAm = ("0").toCharArray()

    if (isPm && hour != 12){
        hour += 12
    } else if (!isPm && hour < 10 ){
        hourStringAm[1] = hour.toChar()
    }
    val result = withoutPmAm.mapIndexed { index, value ->
        if (!isPm && hour == 12) {
            if (index < 2) hourString12Am.toCharArray()[index] else value
        } else if (!isPm && hour < 10){
            if (index < 2) hourStringAm[index] else value
        } else {
            if (index < 2) hour.toString().toCharArray()[index] else value
        }
    }.toTypedArray().joinToString("")
    return result
}

fun main(){
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}