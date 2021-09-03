class ContaSalario(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saque(valor: Double): Boolean {

        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        }
        return false
    }
}