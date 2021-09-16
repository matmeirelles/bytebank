package br.com.alura.bytebank.teste

fun testaFuncoesArrays() {
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade: Int? = idades.maxOrNull()
    val menorIdade: Int? = idades.minOrNull()
    val idadeMedia: Double = idades.average()

    println("Maior idade: $maiorIdade ")
    println("Menor idade: $menorIdade ")
    println("Idade média: $idadeMedia ")

    println("Todos são maior de idade? ${idades.all { it >= 18 }} ")
    println("Pelo menos um deles é maior de idade? ${idades.any { it >= 18 }}")

    println(idades.any())

    println("Maiores de idade: ${idades.filter { it >= 18 }}")

    println("Encontrar: ${idades.find { it == 10 }}")
}
