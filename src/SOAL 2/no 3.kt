fun plugin(nomer: Int) {
    for (i in 1..nomer) {
        val OP = when {
            i % 15 == 0 -> "plugin"
            i % 3 == 0 -> "plug"
            i % 5 == 0 -> "in"
            else -> i.toString()
        }
        println(OP)
    }
}

fun main() {
    plugin(50)
}
