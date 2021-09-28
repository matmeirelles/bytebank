package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNullableElvisOperator() {
    val texto: String? = null
    val tamanhoTexto: Int = texto?.length ?: 0
    println(tamanhoTexto)

    val enderecoNulo: Endereco? = Endereco()
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro)
        endereco?.complemento?.let { println(it.length) }
        println(endereco.complemento?.length ?: 0)
    }
}