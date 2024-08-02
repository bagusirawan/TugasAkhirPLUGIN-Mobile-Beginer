package `SOAL 2`

fun main() {
    val baris = 6

    for (i in baris downTo 1) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }

    for (i in 1..baris) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}
