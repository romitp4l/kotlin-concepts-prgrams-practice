fun main() {
    var start = 0
    var end =100

    //println(chechPrime(11))
    for (i in start..end) {
        if (chechPrime(i)) {
            println(i)
        }
    }

}

fun chechPrime( number : Int):Boolean{
    var flagForPrime = true

    for (i in 2..number / 2) {
        if (number % i == 0) {
            flagForPrime = false
            break
        }

    }

    return flagForPrime
}