fun main() {
    val number = 47
    var i = 2
    var flag = true
    while (i <= (number / 2)) {
        if (number % i == 0) {
            flag = false
            break
        }
        ++i
    }

    if (flag) {
        println("$number is prime number ")
    } else {
        println("$number is not a prime number ")
    }
}