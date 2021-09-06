package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numero: Int,

) {
    var saldo = 0.0
        protected set

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