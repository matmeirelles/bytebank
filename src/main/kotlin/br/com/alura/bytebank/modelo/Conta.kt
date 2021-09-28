package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel by titular {
    var saldo: Double = 0.0
        protected set

    companion object {

        var total: Int = 0
            private set
    }

    init {

        total++
    }

//    override fun autentica(senha: Int): Boolean {
//        return titular.autentica(senha)
//    }

    fun deposita(valor: Double) {

        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saque(valor: Double): Boolean

//    fun transfere(contaDestino: br.com.alura.bytebank.modelo.Conta, valor: Double): Boolean {
//
//        if (saldo >= valor) {
//            this.saque(valor)
//            contaDestino.deposita(valor)
//            return true
//        }
//        return false
//    }
}

class ContaCorrente(
    titular: Cliente,
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

class ContaSalario(
    titular: Cliente,
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