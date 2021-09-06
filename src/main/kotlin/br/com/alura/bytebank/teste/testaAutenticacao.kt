package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Mateus",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Mariana",
        cpf = "222.222.222-11",
        salario = 2000.0,
        plr = 1000.0,
        senha = 4321
    )

    val cliente = Cliente(
        nome = "Ana Carla",
        cpf = "241.124.242-12",
        senha = 4124
    )

    val sistema = SistemaInterno()
    sistema.entra(usuario = gerente, senha = 1234)
    sistema.entra(usuario = diretor, senha = 4321)
    sistema.entra(usuario = cliente, senha = 4124)

}
