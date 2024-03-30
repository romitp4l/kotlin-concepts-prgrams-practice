fun main() {
    val inputString ="  this is the sample string just for checking "
    val char ='h' //character to check
    var freq = 0
    for (i in 0..(inputString.length-1)){
        if (char == inputString[i]){
            freq++
        }
    }

    println("frequncy of the ${char} is : ${freq}")
}