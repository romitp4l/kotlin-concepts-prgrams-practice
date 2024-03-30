fun main() {
    var char = '*'
    when{
        ( char in 'a'..'z' || char in 'A'..'Z') -> println("${char} is alphabet")
        else -> println("${char} is not an alphabet")

    }
}