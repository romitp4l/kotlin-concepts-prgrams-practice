fun main() {
    val row = 5
    var ch = 'A'
    for (i in 1..5) {
        for (j in 1..i) {

            print("$ch ")

        }
        ch++
        println()
    }
}