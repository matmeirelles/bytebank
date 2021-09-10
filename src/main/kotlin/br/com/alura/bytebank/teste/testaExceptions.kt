package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun funcao1() {
    println("iniciando funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println("Exception de cast de classe")
        e.printStackTrace()
    }
    println("fim funcao1")
}

fun funcao2() {
    println("iniciando funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}