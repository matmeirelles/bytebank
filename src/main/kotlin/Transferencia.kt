interface Transferencia {

    val saldo: Double
    fun transfere(contaDestino: Conta, valor: Double): Boolean {

        if (saldo >= valor) {
            this.saque(valor)
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

    fun saque(valor: Double): Boolean
}