fun main() {
    var start = 2
    var end = 30
    while (start < end) {
        var flagIsNotPrime = false

        for (i in 2..start / 2) {
            if (start % i == 0) {
                flagIsNotPrime = true
                break
            }
        }
        if (!flagIsNotPrime) {
            println("$start")
        }

        ++start
    }
}