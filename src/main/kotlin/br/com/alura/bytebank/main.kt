package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.*

fun main() {

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

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}