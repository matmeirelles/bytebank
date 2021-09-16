package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.average
import br.com.alura.bytebank.modelo.bigDecimalArrayOf
import br.com.alura.bytebank.modelo.sum
import java.math.BigDecimal
import java.math.RoundingMode

fun testaBigDecimal() {

    val salarios = bigDecimalArrayOf(
        "1500.00",
        "2000.00",
        "5000.00",
        "10000.00",
        "20000.00"
    )

    println("Salários: ${salarios.contentToString()}")

    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salarioComAumento: Array<BigDecimal> = salarios.map { salario ->
        if (salario < "5000.00".toBigDecimal()) {
            (salario + "500.00".toBigDecimal())
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()

    val gastoInicial = salarioComAumento.sum()

    val meses = "6.0".toBigDecimal()
    val gastoFinal = salarioComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Salários com Aumento: ${salarioComAumento.contentToString()}")

    println("Gasto inicial: $gastoInicial")
    println(gastoInicial.javaClass)
    println("Gasto final: $gastoFinal")

    val mediaMaioresSalarios: BigDecimal = salarioComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .average()

    val mediaMenoresSalarios: BigDecimal = salarioComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .average()

    println("Média dos 3 maiores salários: $mediaMaioresSalarios")
    println("Média dos 3 menores salários: $mediaMenoresSalarios")

}
