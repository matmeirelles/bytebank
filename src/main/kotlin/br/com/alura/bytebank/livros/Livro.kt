package br.com.alura.bytebank.livros

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) : Comparable<Livro> {
    override fun toString(): String {
        return "Livro(titulo='$titulo', autor='$autor', anoPublicacao=$anoPublicacao, editora=$editora)\n"
    }

    override fun compareTo(other: Livro): Int {
        return this.titulo.compareTo(other.titulo)
    }
}

