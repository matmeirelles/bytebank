package br.com.alura.bytebank.modelo

fun testaDataClass() {
    val mateus = Pessoa(
        nome = "Mateus",
        idade = 30,
        documento = Documento(
            rg = "47850022-1",
            cpf = "352.159.008-92"
        )
    )

    val (nome: String) = mateus

    println("meu nome é $nome")

    val (rg, cpf) = mateus.documento

    println("Rg: $rg, CPF: $cpf")
    println("Rg: ${mateus.documento.rg}, CPF: ${mateus.documento.cpf}")

    mateus.fala()
    println(mateus.documento)
}
