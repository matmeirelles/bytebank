package br.com.alura.bytebank.teste

import br.com.alura.bytebank.livros.Livro
import br.com.alura.bytebank.livros.Prateleira
import br.com.alura.bytebank.livros.imprimeComMarcadores

fun testaListasImutaveis() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = mutableListOf(
            Livro(
                titulo = "Grande Sertão: Veredas",
                autor = "João Guimarães Rosa",
                anoPublicacao = 1956
            ),
            Livro(
                titulo = "Minha vida de menina",
                autor = "Helena Morley",
                anoPublicacao = 1942,
                editora = "Editora A"
            ),
            Livro(
                titulo = "Memórias Póstumas de Brás Cubas",
                autor = "José de Alencar",
                anoPublicacao = 1865,
                editora = "Editora B"
            ),
            Livro(
                titulo = "Iracema",
                autor = "José de Alencar",
                anoPublicacao = 1865,
                editora = "Editora B"
            )
        )
    )

    val porAutor = prateleira.ordenarPorAutor()
    val porAnoPublicacao = prateleira.ordenarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}
