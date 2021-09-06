package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaContasDiferentes
import br.com.alura.bytebank.teste.testeObjectExpression

fun main() {

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





