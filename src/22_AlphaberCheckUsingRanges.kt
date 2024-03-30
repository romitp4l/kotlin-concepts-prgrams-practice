fun main() {
    var char = '*'
    if (char in 'a'..'z'  || char in 'A'..'Z'){
        println("${char} is Alphabet")
    }else
        println("${char} in not an Alphabet")
}