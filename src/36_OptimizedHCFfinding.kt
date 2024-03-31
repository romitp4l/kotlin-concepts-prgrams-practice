fun main() {
    var n1 = 20
    var n2 = 88

    var hcf = 1
    while (n1 != n2 ){
        if (n1 > n2){
            n1 = n1 - n2
        }else{
           n2 = n2 - n1
        }
    }

    println(" The HCF is: $n1")
}