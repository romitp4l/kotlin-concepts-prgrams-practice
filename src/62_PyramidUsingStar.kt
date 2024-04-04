fun main() {
    val rows = 5
    fun blank(space: Int) {
        repeat(space) { print("  ") }
    }
    fun asterisk(star: Int) {
        repeat(star) { print("* ") }
    }
    for (i in 1..rows){
        //Printing the blanks

        blank(rows-i)
        asterisk(2*i - 1)
        println()
    }

}