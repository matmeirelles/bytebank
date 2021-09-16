package br.com.alura.bytebank.teste

fun testaRanges() {
    val serie: IntRange = 1..10
//
//    for (s in serie) {
//        print("$s ")
//    }

//    val numerosPares = 0..100 step 2
//
//    for (numero in numerosPares){
//        print("$numero ")
//    }

//    val numerosPares = 0 until 100 step 2
//
//    for (numero in numerosPares) {
//        print("$numero ")
//    }
//    println()
//    val numerosImpares = 99 downTo 0 step 2
//
//    numerosImpares.forEach { print("$it ") }
//    println(numerosImpares.javaClass)

    val intervalo = 1200.0..6000.0
    val salario = 6000.01

    if (salario in intervalo) {
        println("Salário está no intervalo")
    } else {
        println("Salário não está no intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'm'

    alfabeto.forEach { print("$it ") }
    println(letra in alfabeto)
}
