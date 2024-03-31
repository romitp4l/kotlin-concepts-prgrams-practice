fun main() {
    val num1 = 34
    val num2 = 66



    // finding the biggest of both

    var lcm = if (num1 >= num2) {
        num1
    } else num2


    while (true){
        if (lcm % num1 ==0 && lcm % num2 == 0){
            println(" The LCM of $num1 and $num2 is $lcm")
            break
        }
        lcm++
    }

}