fun main() {
    var year: Int = 2024
    var leap: Boolean = false

    fun checkLeap(year: Int): Boolean {
        return if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                true
            } else {
                false
            }
        } else {
            false
        }
    }

    println(checkLeap(year))
}
