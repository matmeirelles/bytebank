package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

//Testando a criação de um objeto anônimo, ou seja, sem class
fun testeObjectExpression() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1234

        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(usuario = fran, senha = 1234)

    println("nome do cliente: ${fran.nome}")
}