fun main(args: Array<String>) {
    val low = 999
    val high = 99999

    for (number in low + 1..high - 1) {
        if (checkArmstrongNumber(number))
            print("$number ")
    }
}

fun checkArmstrongNumber(num: Int): Boolean {
    var digits = 0
    var result = 0
    var originalNumber = num

    // number of digits calculation
    while (originalNumber != 0) {
        originalNumber /= 10
        ++digits
    }

    originalNumber = num

    // result contains sum of nth power of its digits
    while (originalNumber != 0) {
        val remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
        originalNumber /= 10
    }

    if (result == num)
        return true

    return false
}