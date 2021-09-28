package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testeReferenciasItThis() {
    //Teste utilizando funções de escopo encadeadas, com seus retornos
    Endereco(
        logradouro = "Rua Colômbia",
        numero = 253,
        cidade = "São José dos Campos"
    ).apply {
        logradouro = logradouro.uppercase() + ", $numero"
        println(logradouro)
    }.run {
        println("banana")
    }.let(::println)//"this" é um receiver, e acessa de forma implcíta os membros da função

    //Teste utilizando referência "it"
    Endereco(
        logradouro = "Rua Colômbia",
        numero = 253,
        cidade = "São José dos Campos"
    ).let {
        it.logradouro += ", ${it.numero}"
        println(it.logradouro)
    } //"it" não acessa implicitamente os membros da função

    //Teste utilizando retorno de "sorted" para fazer um prinln na função apply
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .let {
            println("Sorting the list")
            it.sorted()
        }
        .apply { println(this) }
}
