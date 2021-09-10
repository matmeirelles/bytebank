package br.com.alura.bytebank.modelo

class Pessoa(
    val nome: String,
    val idade: Int,

    val documento: Documento
) {

    fun fala() {
        println("emite som")
    }

    override fun toString(): String {
        return "Nome: ${this.nome}\nIdade: ${this.idade}\n$documento"
    }

    operator fun component1() = this.nome
}

data class Documento(
    val rg: String,
    val cpf: String
) {
}