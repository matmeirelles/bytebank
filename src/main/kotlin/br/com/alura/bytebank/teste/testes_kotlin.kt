package br.com.alura.bytebank.teste

fun main() {
    tabelaPeriodica(5)
}

fun tabelaPeriodica(number: Int) {
    val multiplicadores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var i = 0
    do {
        println("$number x ${multiplicadores[i]} = ${number * multiplicadores[i]}")
        i++
    } while (i < 10)

}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 4) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}
