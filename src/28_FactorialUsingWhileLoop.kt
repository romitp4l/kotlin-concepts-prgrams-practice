fun main() {
    val num = 4
    var factorial :Long = 1
    var i = 1
    while (i <= num ){
        factorial *=i.toLong()
        i++
    }

    println("Factorial of $num is $factorial")
}