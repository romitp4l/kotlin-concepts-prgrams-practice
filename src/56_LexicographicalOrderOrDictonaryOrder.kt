fun main() {
    var  input = arrayOf("romit", "pal", "java", "kotlin", "android", "jetpack-compose")
    for (i in 0..input.size - 1) {
        for (j in i + 1 until input.size) {
            if (input[i].compareTo(input[j]) > 0) {
                val temp = input[i]
                input[i] = input[j]
                input[j] = temp

            }
        }


    }

    println(" In dictonary format : ")
    input.forEach { println(it) }


}