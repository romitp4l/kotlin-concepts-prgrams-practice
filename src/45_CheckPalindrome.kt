fun main() {
    var num = 124444421
    var reversedInteger = 0
    var remainder : Int
    var originalInterger : Int = num

    while (num != 0) {
        remainder = num % 10
        reversedInteger = (reversedInteger * 10 )+ remainder

        num /= 10


    }

    if (originalInterger == reversedInteger) {
        println("$originalInterger is the palindrom number")

    } else {
        println("$originalInterger is not a palindrome number ")
    }
}