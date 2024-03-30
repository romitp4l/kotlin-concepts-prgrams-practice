fun main() {
    val totalTerms = 10
    var term1 = 0
    var term2 =1

    println("Printing first $totalTerms of the fibonacci Series ")

    for (i in  1..totalTerms){

        print(" $term1  + ")
        var sum = term1 + term2

        term1 = term2
        term2 = sum

    }
}