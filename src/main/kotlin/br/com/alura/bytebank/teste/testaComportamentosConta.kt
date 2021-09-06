package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val clienteMateus = Cliente(nome = "Mateus Meirelles", cpf = "352.159.008-92", senha = 1234)

    val contaMateus = ContaCorrente(clienteMateus, numero = 1000)
    contaMateus.deposita(500.0)

    println(contaMateus.titular)
    println(contaMateus.numero)
    println(contaMateus.saldo)

    val clienteMari = Cliente(nome = "Mariana Vieira", cpf = "123.123.123-22", senha = 1234)

    println("**********************")
    val contaMari = ContaPoupanca(titular = clienteMari, numero = 1001)
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
