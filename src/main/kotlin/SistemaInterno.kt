class SistemaInterno {

    fun entra(usuario: Autenticavel, senha: Int) {
        if (usuario.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}