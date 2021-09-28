package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testeOpcoesAutenticavel() {
    val analista = Analista(
        nome = "Alex",
        cpf = "",
        salario = 1000.0,
        senha = 1000
    )

    //gerente herda de FuncionarioAdmin que implementa Autenticavel
    val gerente = Gerente(
        nome = "Fran",
        cpf = "",
        salario = 2000.0,
        senha = 2000
    )

    val cliente = Cliente(
        nome = "Fran",
        cpf = "",
        senha = 3000
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(analista, senha = 1000) {
        println("Testando autenticação")
    }
    sistemaInterno.entra(gerente, senha = 2000) {
        println("Testando autenticação")
    }
    sistemaInterno.entra(cliente, senha = 3000) {
        println("Testando autenticação")
    }
}
