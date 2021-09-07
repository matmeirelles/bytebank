package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(usuario: Autenticavel, senha: Int) {
        if (usuario.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }

        when (usuario) {
            is FuncionarioAdm -> {
                println("Opções admin")
            }
            is Funcionario -> {
                println("Opções comum")
            }
            else -> {
                println("Opções reduzidas")
            }
        }
    }
}