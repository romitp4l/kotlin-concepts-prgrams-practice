fun main() {
    var num = -345
    var result: String
    if (num.toDouble() > 0.0 ){
        result = "Positive"

    }
    else if (num.toDouble() < 0.0){
        result = "Negative"
    }
    else{
        result = " Zero "
    }

    println(" ${num} is ${result}")
}