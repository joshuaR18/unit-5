fun fibonacci(number: Int): Int {
    if (number <= 0) {
        return 0
    }
    if (number == 1 || number == 2) {
        return 1
    }
    return fibonacci(number - 1) + fibonacci(number - 2)
}

fun main() {
    println(fibonacci(1))  // Output: 1
    println(fibonacci(2))  // Output: 1
    println(fibonacci(3))  // Output: 2
    println(fibonacci(4))  // Output: 3
    println(fibonacci(5))  // Output: 5
    println(fibonacci(6))  // Output: 8
    println(fibonacci(7))  // Output: 13
    println(fibonacci(10)) // Output: 55
}
