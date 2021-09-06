package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val clienteMateus = Cliente(
        nome = "Mateus",
        cpf = "",
        endereco = Endereco(
            logradouro = "Rua Cidade de Quito"
        ),
        senha = 1234
    )
    val clienteRicardo = Cliente(nome = "Ricardo", cpf = " ", senha = 1234)

    val conta1 = ContaCorrente(
        titular = clienteMateus,
        numero = 1000
    )

    val conta2 = ContaPoupanca(
        titular = clienteRicardo,
        numero = 1001
    )

    conta1.deposita(valor = 1000.0)
    conta2.deposita(valor = 1000.0)

    conta1.saque(valor = 500.0)
    conta2.saque(valor = 500.0)

    //Incluindo o print de um endereço para mostrar como uma composição funciona
    println("***************************")
    println("Logradouro: ${conta1.titular.endereco.logradouro}")
    println("***************************")

    println("Saldo conta 1: ${conta1.saldo}")
    println("Saldo conta 2: ${conta2.saldo}")

    conta1.transfere(
        contaDestino = conta2,
        valor = 200.0
    )

    println("Saldo conta 1: ${conta1.saldo}")
    println("Saldo conta 2: ${conta2.saldo}")
}