fun main() {
    val num1 = 39
    val num2 = 3983
    val num3 = 909

    if (num1 >= num3 && num1 >= num2){
        println("${num1} is the greatest of all")

    }else if (num2 > num3 && num2 > num1 ){
        println("${num2}  is the greatest of all")

    }else{
        println(" ${num3}")
    }
}