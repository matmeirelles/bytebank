interface Autenticavel {
    /** Para aplicar a regra na própria interface é necessário incluir essa variável (que é abstrata)
    Nesse caso, ele está indicando que quem implementar o método "autentica" vai garantir que irá enviar o parâmetro "senha"
    Importante: Não é possível incluir o modificador private na interface. Por esse motivo, caso seja utilizado uma informação
    sensível, como "senha" abaixo, é ideal que ela não seja utilizada dentro de uma interface*/
    //val senha: Int

    fun autentica(senha: Int): Boolean //{
//        if (this.senha == senha) {
//            return true
//        }
//        return false
//    }
}