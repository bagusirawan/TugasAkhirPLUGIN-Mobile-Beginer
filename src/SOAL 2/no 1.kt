package `SOAL 2`

fun main() {
    val mataPelajaran = listOf("Bahasa Indonesia", "Bahasa Inggris", "Matematika", "IPA")
    val nilai = mataPelajaran.map { pelajaran ->
        var input: Int?
        do {
            print("$pelajaran: ")
            input = readLine()?.toIntOrNull()
            if (input !in 0..100) println("Input tidak valid. Masukkan nilai antara 0 sampai 100.")
        } while (input == null || input !in 0..100)
        input
    }

    val rataRata = nilai.average()
    val grade = when (rataRata.toInt()) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }

    println("Nilai rata-rata: %.2f".format(rataRata))
    println("Grade: $grade")
}
