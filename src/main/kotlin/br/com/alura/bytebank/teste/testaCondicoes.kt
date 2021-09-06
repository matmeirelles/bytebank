package br.com.alura.bytebank.teste

fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> println("Seu saldo é positivo: $saldo")
        saldo == 0.0 -> println("Seu saldo é: $saldo")
        else -> println("Seu saldo é negativo: $saldo")
    }
}