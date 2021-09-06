package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero,
), Transferencia {
    override fun saque(valor: Double): Boolean {

        if (this.saldo >= valor) {
            this.saldo -= valor * 1.01
            return true
        }
        return false
    }
}