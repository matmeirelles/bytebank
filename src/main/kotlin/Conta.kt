abstract class Conta(
    val titular: String,
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

//    fun transfere(contaDestino: Conta, valor: Double): Boolean {
//
//        if (saldo >= valor) {
//            this.saque(valor)
//            contaDestino.deposita(valor)
//            return true
//        }
//        return false
//    }
}