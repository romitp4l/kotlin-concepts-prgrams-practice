fun main() {
    val num = 5
    val factorial = findFactors(num)
    println("Factorial of $num is $factorial")

}
fun findFactors(num:Int):Long{
    if (num >= 1)
        return num * findFactors(num -1 )
    else
        return 1
}