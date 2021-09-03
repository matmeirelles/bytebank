fun testaComportamentosConta() {
    val contaMateus = ContaCorrente(titular = "Mateus Meirelles", numero = 1000)
    contaMateus.deposita(500.0)

    println(contaMateus.titular)
    println(contaMateus.numero)
    println(contaMateus.saldo)

    println("**********************")
    val contaMari = ContaPoupanca(titular = "Mariana Vieira", numero = 1001)
    contaMari.deposita(780.0)

    println(contaMari.titular)
    println(contaMari.numero)
    println(contaMari.saldo)

    if (contaMateus.saque(600.0)) {
        println("${contaMateus.titular}, saque realizado com sucesso.\nSaldo da conta: R$${contaMateus.saldo}")
    } else {
        println("Impossível realizar operação. Saldo insuficiente.\nSaldo atual: R$${contaMateus.saldo}")
    }
}
