package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaHighOrderFunction() {

//    //Imprimindo endereço em maíusculo, tendo que criar duas variáveis para isso
//    val casa = Endereco(
//        logradouro = "Rua Colômbia",
//        numero = 253
//    )
//    val enderecoEmMaiusculo = "${casa.logradouro}, ${casa.numero}".uppercase()
//    println(enderecoEmMaiusculo)

    Endereco(
        logradouro = "Rua Colômbia",
        numero = 253
    )
        .apply {
            "$logradouro, $numero".uppercase()
        }
        .let(::println)

//    listOf(
//        Endereco(complemento = "casa"),
//        Endereco(complemento = "apartamento"),
//        Endereco()
//    ).filter { endereco ->
//        endereco.complemento.isNotEmpty()
//    }.let(::println)

    soma(1, 5) {
        println(it)
    }

    somaReceiver(1, 5) {
        println(this)
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Soma sendo efetuada")
    val valor = a + b
    resultado(valor)
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Soma sendo efetuada")
    val valor = a + b
    valor.resultado() //Igual a "resultado(valor)"
}
