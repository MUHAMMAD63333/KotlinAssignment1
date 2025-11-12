// KotlinAssignment1 - Main.kt

// A) Sum integers from 1 up to max (inclusive)
fun addUpTo(max: Int): Int {
    require(max >= 0) { "max must be non-negative" }
    var sum = 0
    for (i in 1..max) sum += i
    return sum
}

// B) Factorial (iterative)
fun factorialIter(n: Int): Long {
    require(n >= 0) { "n must be non-negative" }
    var result = 1L
    for (i in 2..n) result *= i.toLong()
    return result
}

// C) Factorial using a lambda (anonymous function)
val factorialLambda: (Int) -> Long = { n ->
    require(n >= 0) { "n must be non-negative" }
    var r = 1L
    for (i in 2..n) r *= i.toLong()
    r
}

// D) Factorial (recursive)
fun factorialRec(n: Int): Long =
    when {
        n < 0  -> throw IllegalArgumentException("n must be non-negative")
        n <= 1 -> 1L
        else   -> n.toLong() * factorialRec(n - 1)
    }

// Simple test harness
fun main() {
    println("A) addUpTo(10) = ${addUpTo(10)}")           // 55
    println("B) factorialIter(5) = ${factorialIter(5)}") // 120
    println("C) factorialLambda(5) = ${factorialLambda(5)}") // 120
    println("D) factorialRec(5) = ${factorialRec(5)}")   // 120
}
