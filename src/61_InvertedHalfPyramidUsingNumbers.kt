fun main() {
    val row = 5

    for (i in row downTo  1) {
        for (j in 1..i) {
            print(" $j   ")
        }
        println()
    }
}