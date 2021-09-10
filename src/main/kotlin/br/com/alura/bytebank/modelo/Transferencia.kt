package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

interface Transferencia {

    val saldo: Double
    val titular: Cliente
    fun transfere(contaDestino: Conta, valor: Double, senha: Int) {

        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }
        if (!titular.autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        this.saque(valor)
        contaDestino.deposita(valor)

    }

    fun saque(valor: Double): Boolean
}