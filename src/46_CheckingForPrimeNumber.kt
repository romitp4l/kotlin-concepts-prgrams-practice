fun main() {

    var num = 12

    var flagForPrime = true

    for (i in 2..num / 2) {
        if (num % i == 0) {
            flagForPrime = false
            break
        }

    }

    if (flagForPrime) {
        println("$num is prime")
    } else {
        println("$num is not a prime")
    }


}


// Here the logic is that if the number is prime it must have factors more than 2 i.e., one and itself