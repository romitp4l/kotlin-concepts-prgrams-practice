
fun main() {
    val start = 999
    val end = 99999

    println("Printing the Armstrong numbers between $start and $end")

    for (i in start..end) {
        if (checkArmstrong(i)) {
            println(i)
        }
    }
}

fun checkArmstrong(num: Int): Boolean {
    var originalNumber = num
    var noOfDigits = 0

    // Count number of digits
    var temp = num
    while (temp != 0) {
        temp /= 10
        ++noOfDigits
    }

    // Resetting the original number to the input number
    originalNumber = num

    var cubeSum = 0.0
    while (originalNumber != 0) {
        val remainder = originalNumber % 10
        cubeSum += Math.pow(remainder.toDouble(), noOfDigits.toDouble())
        originalNumber /= 10
    }

    return cubeSum.toInt() == num
}
