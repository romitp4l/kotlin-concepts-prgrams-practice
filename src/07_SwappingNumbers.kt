fun main() {
    var first = 34
    var second = 33434

    println("-- Numbers before Swapping --")
    println("first no : ${first}")
    println("second no : ${second}")

    var temp = first
    first= second
    second=temp
    println("-- Numbers aftere Swapping --")
    println("first no : ${first}")
    println("second no : ${second}")
}