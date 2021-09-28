package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Colômbia"
        numero = 253
        bairro = "Vista Verde"
        cidade = "São José dos Campos"
        this
    }.let { endereco: Endereco ->
        println("endereco")
    }
}
