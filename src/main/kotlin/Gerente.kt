class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdm(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    //Formato mais simples de escrever uma Property, sem o get()
    override val bonificacao: Double = salario
}