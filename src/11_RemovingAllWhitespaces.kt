fun main() {
    var  inputSentence = "this   is the sample that is need     to remove its all whitespaces"
    println("The original sentence is :  ${inputSentence}")

    inputSentence = inputSentence.replace("\\s".toRegex(),"")
    println("After Replacement : ${inputSentence}")
}