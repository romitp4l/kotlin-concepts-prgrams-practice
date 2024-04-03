// an integer divisible by the sum of its number is known as harshad number
class Solution {
    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {

        var sumOfDigits = 0
        var temp = x
        while (temp != 0) {
            var remainder = temp % 10
            sumOfDigits += remainder
            temp /=10

        }

        if (x % sumOfDigits == 0) {
            return sumOfDigits
        } else {
            return -1
        }

    }
}




