fun main() {

    val conta1 = ContaCorrente(titular = "Mateus Meirelles", numero = 100)
    val conta2 = ContaPoupanca(titular = "Mariana Vieira", numero = 101)
    val conta3 = ContaSalario(titular = "Ana Carla", numero = 103)

    println("Saldo conta ${conta1.titular}: ${conta1.saldo}")
    conta1.deposita(valor = 1000.0)
    println("Saldo conta ${conta1.titular}: ${conta1.saldo}")

    conta1.transfere(contaDestino = conta3, valor = 300.0)
    println("Saldo conta ${conta1.titular}: ${conta1.saldo}")
    println("Saldo conta ${conta3.titular}: ${conta3.saldo}")

    conta3.saque(valor = 100.0)
    println("Saldo conta ${conta1.titular}: ${conta1.saldo}")
    println("Saldo conta ${conta3.titular}: ${conta3.saldo}")



}




