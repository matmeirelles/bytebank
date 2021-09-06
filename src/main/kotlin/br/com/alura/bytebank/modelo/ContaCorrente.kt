package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero,
), Transferencia {
    override fun saque(valor: Double): Boolean {

        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        }
        return false
    }
}