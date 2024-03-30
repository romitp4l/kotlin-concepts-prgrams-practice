fun main() {
    val first = 112
    val second = 334
    var hcf = 1

    var i = 1

    while (i <= first && i <= second){

        if (first % i == 0 && second % i == 0){
            hcf = i
        }
        ++i
    }
    println(" The hcf/gcd of $first and $second is : $hcf")

}