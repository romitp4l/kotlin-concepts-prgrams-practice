import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter the number :" +
            "")

    val number = reader.nextInt()
    if (number % 2 == 0 ){
        println("${number}is even")

    }else
        println("${number} is off")
}