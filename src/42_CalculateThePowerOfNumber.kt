fun main() {
    var base :Long= 3
    var exponent = 39
    var result : Long = 1
    while (exponent != 0) {
        result *= base
        --exponent

    }
    println("$result")
}