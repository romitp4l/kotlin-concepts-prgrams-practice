fun main() {
    val totalTerms = 100
    var i = 1
    var term1 = 0
    var term2 = 1

    println(" Printing first $totalTerms of the fibonacci series ")


    while (i <= totalTerms) {
        print("$term1 + ")
        var sum = term1 + term2
        term1 = term2
        term2 = sum
        i++

    }
}