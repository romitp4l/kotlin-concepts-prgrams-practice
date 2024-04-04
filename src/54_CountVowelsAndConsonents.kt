fun main() {
    var sentence = " this is the sample sentence to check 23 4343 jdj999  "
    var vowels = 0
    var consonents = 0
    var digits = 0
    var space = 0

    sentence = sentence.toLowerCase()
    for (i in 0..sentence.length - 1) {
        var char = sentence[i]
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            vowels++
        }else if (char in 'a'..'z') {
            consonents++
        }else if (char in '0'..'9') {
            digits++
        } else {
            space++
        }

    }

    println("No of vowels : $vowels , consonents : $consonents , digits : $digits , spaces : $space")

}