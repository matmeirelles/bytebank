package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val clienteLeo = Cliente(nome = "Leonardo", cpf = "", senha = 1234)

    val contaLeo = ContaCorrente(titular = clienteLeo, numero = 1003)
    var contaMaria = ContaCorrente(titular = Cliente(nome = "Maria", cpf = "", senha = 1), numero = 1002)

    println("contaLeonardo ${contaLeo.titular.nome}")
    println("contaMaria ${contaMaria.titular.nome}")

    println(contaLeo)
    println(contaMaria)
    contaMaria = ContaCorrente(titular = Cliente(nome = "Maria Aparecida", cpf = "", senha = 1), numero = 1004)
    println(contaMaria)
}