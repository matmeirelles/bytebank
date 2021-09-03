fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaAline = ContaCorrente("Aline", 1003)
    var contaMaria = ContaCorrente("Maria", 1002)

    println("contaAline ${contaAline.titular}")
    println("contaMaria ${contaMaria.titular}")

    println(contaAline)
    println(contaMaria)
    contaMaria = ContaCorrente("Maria", 1004)
    println(contaMaria)
}