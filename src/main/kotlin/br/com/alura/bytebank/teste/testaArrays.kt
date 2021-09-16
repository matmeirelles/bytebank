package br.com.alura.bytebank.teste

fun testaArrays() {
    var maiorIdade: Int = Int.MIN_VALUE

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("Maior idade do array: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("Menor idade do aray: $menorIdade")

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

//    for (cont in salarios.indices) {
//        salarios[cont] *= 1.1
//    }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    println("Valor dos salários com aumentoL ${salarios.contentToString()}")

    val numeros = arrayOf(5, 3, 2)

    println("Testando arrayOf: ${numeros.contentToString()}")

    var lista = mutableListOf<Int>(1, 2, 3)

    println("Lista: $lista")

    lista += 5

    println("Lista alterada: $lista")
}
