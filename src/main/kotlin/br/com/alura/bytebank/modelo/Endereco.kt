package br.com.alura.bytebank.modelo

import kotlin.math.log

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
) {
    override fun toString(): String {
        return """Endereco:
            |(logradouro='$logradouro', 
            |numero=$numero, 
            |bairro='$bairro', 
            |cidade='$cidade', 
            |estado='$estado', 
            |cep='$cep', 
            |complemento='$complemento')""".trimMargin()
    }

    // Alteração do equals para utilizar todas as properties da classe
    override fun equals(other: Any?): Boolean {
        if (this === other) return true // Verifica se as duas variáveis apontam para o mesmo objeto. Caso positivo, são iguais
        if (javaClass != other?.javaClass) return false // Verifica se as variáveis possuem a mesma classe. Caso contrário, são diferentes

        other as Endereco // Faz o cast, garantindo que a variável "other" está sendo tratada como classe Endereco

        //Verifica se cada property de other é igual
        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false

        // Se todas as variáveis acima forem iguais, então as duas variáveis, são iguais
        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode() // Cria uma variável para somar o valor do hashcode

        //A medida que a property é igual, ele adiciona ao total da variável o valor da property
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result // Ao final, retorna o valor do novo hashcode
    }

//    override fun equals(other: Any?): Boolean {
//        if (other != null && other is Endereco) {
//            return this.logradouro == other.logradouro
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return logradouro.hashCode()
//    }


}
