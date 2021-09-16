package br.com.alura.bytebank.livros

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>,

    ) {

    fun ordenarPorAutor(): List<Livro> {

        return livros.sortedBy { it.autor }
    }

    fun ordenarPorAnoPublicacao(): List<Livro> {

        return livros.sortedBy { it.anoPublicacao }
    }
}

