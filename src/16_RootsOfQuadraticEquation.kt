//ax2 + bx + c = 0, where
//a, b and c are real numbers and
//a ≠ 0
//
//-------------------------------
//
//The term b2-4ac is known as the determinant of a quadratic equation. The determinant tells the nature of the roots.
//
//If determinant is greater than 0, the roots are real and different.
//If determinant is equal to 0, the roots are real and equal.
//If determinant is less than 0, the roots are complex and different.


fun main() {

    val a = 3
    val b = 5
    val c = 2

    val root1: Double
    val root2: Double

//    val output : String

    val determinant: Double = (b * b) - (4.0 * a * c)
    if (determinant > 0) {
        root1 = (-b + Math.sqrt(determinant)) / (2 * a)
        root2 = (-b - Math.sqrt(determinant)) / (2 * a)

        var output = "  First root is : ${root1} , and the Second root is : ${root2}"
        println(output)
    } else if (determinant.toInt().toDouble() == 0.0) {
        root1 = (-b / (2 * a)).toDouble()
        root2 = root1

        var output = "  First root is : ${root1} , and the Second root is : ${root2}"
        println(output)

    }

    // when the roots are not real
    else if (determinant.toInt().toDouble() < 0.0) {
        val realPart = -b / (2 * a)
        val imaginaryPart = Math.sqrt(-determinant) / (2 * a)

        var output = " First root is : ${realPart} + ${imaginaryPart}" +
                "Second root is : ${realPart} - ${imaginaryPart}"
        println(output)

    }


}