package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")

//    Cliente(
//        nome = "Mateus",
//        cpf = "123.456.789-00",
//        endereco = Endereco(),
//        senha = 123
//    ).let { cliente: Cliente ->
//        ContaPoupanca(
//            titular = cliente,
//            numero = 1
//        )
//    }.run {
//        deposita(valor = 1000.0)
//        saldo * taxaMensal
//    }.let{
//        println("Rendimento mensal = $it")
//    }

    val conta = ContaPoupanca(
        titular = Cliente(
            nome = "Mateus",
            cpf = "123.456.789-00",
            endereco = Endereco(),
            senha = 123
        ),
        numero = 1000
    )
    conta.deposita(valor = 1000.0)

    run {
        var saldo = conta.saldo
        repeat(times = 12) {
            saldo += saldo * taxaMensal
        }
//        for (count in 1..12) {
//            saldo += saldo * taxaMensal
//        }
        println(saldo)
    }
}
