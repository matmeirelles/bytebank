fun testaContasDiferentes() {
    val conta1 = ContaCorrente(
        titular = "Mateus",
        numero = 1000
    )

    val conta2 = ContaPoupanca(
        titular = "Ricardo",
        numero = 1001
    )

    conta1.deposita(valor = 1000.0)
    conta2.deposita(valor = 1000.0)

    conta1.saque(valor = 500.0)
    conta2.saque(valor = 500.0)

    println("Saldo conta 1: ${conta1.saldo}")
    println("Saldo conta 2: ${conta2.saldo}")

    conta1.transfere(
        contaDestino = conta2,
        valor = 200.0
    )

    println("Saldo conta 1: ${conta1.saldo}")
    println("Saldo conta 2: ${conta2.saldo}")
}