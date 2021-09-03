class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
) : FuncionarioAdm(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    //Formato mais verboso de escrever uma propriedade
    override val bonificacao: Double
        get() {
            return plr
        }
}