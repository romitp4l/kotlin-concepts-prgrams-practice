fun main() {
    val num1 = 39
    val num2 = 3983
    val num3 = 909

    when {
        num1 >= num2 && num1 >= num3 -> println("${num1} is the greatest")
        num2 >= num1 && num2 >= num3 -> println("${num2} is the greatest")
        num3 >= num2 && num3 >= num1 -> println("${num3} is the greatest")
    }
}