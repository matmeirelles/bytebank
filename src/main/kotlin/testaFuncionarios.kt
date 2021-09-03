private val gerente = Gerente(
    nome = "Fran",
    cpf = "098.765.432.10",
    salario = 6000.0,
    senha = 1234
)

fun testaFuncionarios() {
    val mateus = Analista(
        nome = "Mateus Meirelles Roberto",
        cpf = "123.456.789-10",
        salario = 4500.0
    )

    println(
        "Nome: ${mateus.nome}\n" +
                "CPF: ${mateus.cpf}\n" +
                "Salário: ${mateus.salario}\n" +
                "Bonificação: ${mateus.bonificacao}\n"
    )

    val fran = Gerente(
        nome = "Fran",
        cpf = "098.765.432.10",
        salario = 6000.0,
        senha = 1234
    )

    println(
        "Nome: ${fran.nome}\n" +
                "CPF: ${fran.cpf}\n" +
                "Salário: ${fran.salario}\n" +
                "Bonificação: ${fran.bonificacao}\n"
    )

    if (fran.autentica(senha = 54321)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val mariana = Diretor(
        nome = "Mariana",
        cpf = "111.111.111.-11",
        salario = 10000.0,
        senha = 124012,
        plr = 4000.0
    )
    mariana.plr = 5000.0

    println(
        "Nome: ${mariana.nome}\n" +
                "CPF: ${mariana.cpf}\n" +
                "Salário: ${mariana.salario}\n" +
                "Bonificação: ${mariana.bonificacao}\n" +
                "plr: ${mariana.plr}"
    )

    val maria = Analista(
        nome = "Maria",
        cpf = "244.124.412-12",
        salario = 3400.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(mateus)
    calculadora.registra(mariana)
    calculadora.registra(fran)
    calculadora.registra(maria)
    println("total de bonificações: ${calculadora.total}")
}