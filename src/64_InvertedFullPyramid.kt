fun main() {
    var rows = 5
    fun blank(bl: Int) {
        repeat(bl) { print("  ") }
    }
    fun asterisk(ast: Int) {
        repeat(ast) { print("* ") }
    }

    for (i in 5 downTo 1) {
        blank(rows - i)
        asterisk(2*i -1)
        println()
    }

}