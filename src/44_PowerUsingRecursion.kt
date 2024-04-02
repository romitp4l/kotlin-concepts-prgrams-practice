fun main() {
    var base = 3
    var exponent = 3
    var result = power(base,exponent)

    println("The result of $base to the power $exponent is $result")
}

fun power(base: Int, exponent: Int): Int {
    if (exponent != 0) {
        return base * power(base,exponent-1)

    }else
        return 1

}
