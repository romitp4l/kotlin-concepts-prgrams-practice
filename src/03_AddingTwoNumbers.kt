import java.util.Scanner

fun main(args: Array<String>)
{

    println("enter the first number :")
    val num1= Scanner(System.`in`)


    val pahla = num1.nextInt()

    println("enter the second number ")

    val num2 = Scanner(System.`in`)
    val dooshra = num2.nextInt()
    val sum = pahla + dooshra
    println(sum)
}