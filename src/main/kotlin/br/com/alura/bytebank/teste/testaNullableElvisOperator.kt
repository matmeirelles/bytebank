package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNullableElvisOperator() {
    val texto: String? = "Mateus"
    val tamanhoTexto: Int? = texto?.length ?: null
    println(tamanhoTexto)

    val enderecoNulo: Endereco? = Endereco()
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro)
        val tamanhoComplemento: Int = endereco.complemento?.length ?: 0
        println(tamanhoComplemento)
    }
}