package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaObjects() {
    var cliente1 = Cliente(
        nome = "Mateus",
        cpf = "123.123.123-22",
        senha = 123
    )

    var contaPoupanca = ContaPoupanca(titular = cliente1, numero = 1000)
    var contaCorrente = ContaCorrente(titular = cliente1, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}
