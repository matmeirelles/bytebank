package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(usuario: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (usuario.autentica(senha)) {

            println("Bem vindo ao Bytebank")
            autenticado()

        } else {

            println("Falha na autenticação")

        }
    }

    fun entraReceiver(usuario: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (usuario.autentica(senha)) {

            println("Bem vindo ao Bytebank")
            autenticado()

        } else {

            println("Falha na autenticação")

        }
    }

}