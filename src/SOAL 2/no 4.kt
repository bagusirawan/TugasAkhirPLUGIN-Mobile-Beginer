package `SOAL 2`

fun main() {
    val baris = 6

    for (i in 0 until baris) {
        for (j in 0 until baris) {
            if (j >= i) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }

    for (i in 0 until baris) {
        for (j in 0 until baris) {
            if (j >= baris - i - 1) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}