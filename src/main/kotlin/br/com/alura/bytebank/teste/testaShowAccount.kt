package br.com.alura.bytebank.teste

fun showAccounts() {
    val nomes = arrayOf("Mateus", "Mariana", "Isadora", "Ana Carla", "Orlando")

    for (i in 1..5) {
        val titular = nomes[i - 1]
        val numeroConta = 4123 + i
        var saldo: Double = 0.0 + i

        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println("**************************************")
    }
}