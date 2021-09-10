package br.com.alura.bytebank.teste

fun testaExpressions() {
    val entrada: String = "a"

    val entradaNumero: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Não é possível realizar a conversão")
        null
    }

    val valorTaxa: Double? = when (entradaNumero) {
        null -> null
        else -> entradaNumero + 0.1
    }

    println("entradaNumero: $entradaNumero")
    println("valorTaxa: $valorTaxa")
}
