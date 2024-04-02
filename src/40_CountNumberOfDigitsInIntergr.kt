fun main() {
    var count = 0
    var num = 343534

    while (num !=0 ){
        num /= 10
        ++count
    }
    println("number of digits : $count")
}