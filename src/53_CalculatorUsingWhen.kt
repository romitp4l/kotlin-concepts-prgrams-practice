import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the first no ")
    var num1 = sc.nextInt()

    println("Enter the second no ")
    var num2 = sc.nextInt()

    println("Enter the operator : +,-,*,/")

    var operator = sc.next()[0]

    var result : Int

    when (operator) {
        '+' -> result= num1 + num2
        '-' -> result= num1 - num2
        '*' -> result= num1 * num2
        '/' -> result= num1 / num2

        else ->{
            println("Operator is not correct")
            return
        }

    }

    println(" $num1  $operator  $num2  ==  $result")
}