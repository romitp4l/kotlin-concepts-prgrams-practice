import java.math.BigInteger

fun main() {
    var number = 4
    var factorial = BigInteger.ONE
    for (i in 1..number)
    {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))

    }

    println("Factorial of $number is $factorial")
}