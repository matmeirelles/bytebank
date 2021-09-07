package br.com.alura.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int = 0
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    //Formato mais simples de escrever uma Property, sem o get()
    override val bonificacao: Double = salario * 0.1

    override fun autentica(senha: Int): Boolean = this.senha == senha
}