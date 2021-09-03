class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    //Formato mais simples de escrever uma Property, sem o get()
    override val bonificacao: Double = salario * 0.1

}