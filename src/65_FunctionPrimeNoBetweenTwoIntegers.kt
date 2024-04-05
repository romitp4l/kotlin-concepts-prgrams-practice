fun main() {
    var start = 30
    var end = 80

    while (start < end) {
        if (checkPrime(start)) {
            println(start.toString())

        }

        start++
    }

    println(checkPrime(start))
    println(checkPrime(end))
//    for (i in start..end) {
//        if (checkPrime(i)) {
//            println(i)
//
//        }
//    }


}

fun checkPrime(num: Int) :Boolean{
    var flag = true

    for (i in 2..num/2) {
        if (num % i == 0) {
            flag = false
            break

        }
    }
    return flag
}