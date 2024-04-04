fun main() {
    var sentence = "this is the sample sentence of gkjdlkd 24237778782 32 32"
    var vowels = 0
    var consonents = 0
    var digits = 0
    var spaces = 0

    sentence = sentence.toLowerCase()

    for (i in 0..sentence.length - 1) {
        val char = sentence[i]
        when (char) {
            'a', 'e', 'i', 'o', 'u' -> vowels++
            in 'a'..'z' -> consonents++
            in '0'..'z' -> digits++
            else -> spaces++

        }
    }

    println("vowels : $vowels , consonents : $consonents , digits : $digits , spaces : $spaces")
}