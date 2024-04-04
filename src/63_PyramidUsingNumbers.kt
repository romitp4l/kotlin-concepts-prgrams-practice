fun main() {
    val rows = 5

    for (i in 1..rows) {
        // Print leading spaces
        for (j in 1..rows - i) {
            print("  ")
        }

        // Print numbers increasing from i to i*2-1
        for (j in i until i * 2) {
            print("$j ")
        }

        // Print numbers decreasing from i*2-2 to i
        for (j in i * 2 - 2 downTo i) {
            print("$j ")
        }

        // Move to the next line
        println()
    }
}
