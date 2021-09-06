package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    // Formato mais simples de mostrar o retorno do valor de uma Property, utilizando get()
    abstract val bonificacao: Double
}