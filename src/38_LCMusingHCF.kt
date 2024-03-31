fun main() {
    var num1 = 8
    var num2 = 4

    var hcf = 1

   var i = 1
    while (i <= minOf(num2,num1)){
        if (num1 % i ==0 && num2 % i ==0){
            hcf = i
        }
        i++
    }
    println("The hcf is $hcf")

    // As we know that  num1* num2 = hcf * lcm

    var lcm = (num2* num1)/hcf
    println("LCM of $num1 and $num2 is : $lcm")


}