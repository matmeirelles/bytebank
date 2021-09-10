package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testeSobrescrevendoFuncoesAny() {
    val endereco = Endereco(logradouro = "Rua Colômbia")
    val enderecoNovo = Endereco(logradouro = "Rua Colômbia")

    println(endereco.equals(enderecoNovo))

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")

    println(endereco.logradouro)
    println(endereco.hashCode())

    println(enderecoNovo.logradouro)
    println(enderecoNovo.hashCode())

    println(endereco.equals(enderecoNovo))
}
