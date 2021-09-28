package br.com.alura.bytebank.teste

import kotlin.random.Random

fun testaScopeFunctions() {
    val numbers: MutableList<String> = mutableListOf("one", "two", "three", "four", "five")

    println(numbers.map { it.length }.filter { it > 3 })

    //usando "let"
    numbers
        .map { it.length }
        .filter { it > 3 }
        .let(::println)

    //usando "with"
    with(numbers) {
        "The first element is ${first()}, and the last element is ${last()}"
    }.let(::println)

    //usando "run"
    run {
        val bemVindo = "Hello World"
        println(bemVindo)
    }

    //usando "apply"
    numbers.apply {
        add("six")
        add("seven")
    }

    //usando also
    numbers
        .also { println("Adicionando elementos à seguinte lista: $it") }
        .apply {
            add("eight")
            add("nine")
        }

    //Usando takeIf e takeUnless

    val number = Random.nextInt(100)

    val parOuNulo = number.takeIf { it % 2 == 0 }
    val imparOuNulo = number.takeUnless { it % 2 == 0 }

    println("par: $parOuNulo | ímpar: $imparOuNulo")
}
