fun fallingDistance(t: Int): Double {
    val g = 9.8 
    val d = 0.5 * g * t.toDouble().pow(2.0) 
    return d
}

fun main() {
    for (t in 1..10) {
        val distance = fallingDistance(t)
        println("Time: $t seconds, Distance: ${"%.2f".format(distance)} meters")
    }
}
