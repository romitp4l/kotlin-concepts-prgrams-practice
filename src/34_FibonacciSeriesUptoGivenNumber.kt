fun main() {
    val termUpTo = 34
    var term1 = 0
    var term2 = 1

    var i = 1

    println("Printing the fibonacci series upto $termUpTo")


    while (term1 <= termUpTo){

        print("$term1 +")
        var sum = term1 + term2
        term1 = term2
        term2 = sum

    }
}