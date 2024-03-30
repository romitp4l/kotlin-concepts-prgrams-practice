fun main() {
     var number = 0
    when{
        number > 0.0 -> println("${number} is Positive")
        number < 0.0 -> println("${number} is Negative")
        else -> println("${number} is zero ")
    }
}