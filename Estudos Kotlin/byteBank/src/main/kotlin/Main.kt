/**
 * A função main permite a execução desse programa, ela testa instâncias
 * da classe Conta.
 * @author Alisson Jaques
 * */
fun main() {
    println("\nBem Vindo ao Byte Bank!\n")

    val conta01 = Conta(nomeCliente = "Alisson", numeroConta = 1)
    conta01.deposita(1000.0)
    conta01.deposita(50.0)
    conta01.saca(50.0)

    val conta02 = Conta(nomeCliente = "Bruna", numeroConta = 2)
    conta02.deposita(1010.0)
    conta02.deposita(40.0)
    conta02.saca(40.0)

    println(conta01.toString())
    println(conta02.toString())

    if (conta01.transfere(valor = 1000.0, destino = conta02)) {
        println("Transferência realizada com sucesso!")
    } else {
        println("Erro ao transferir, saldo insuficiente.")
    }

    println(conta01.toString())
    println(conta02.toString())
}

/**
 * A classe Conta possui campos e métodos que representam uma
 * conta bancária.
 * @param nomeCliente o nome do titular da conta
 * @param numeroConta o número da conta bancária
 * @author Alisson Jaques
 * */
class Conta(
    var nomeCliente: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    /**
     * Este método recebe como argumento um valor e o deposita na conta.
     * @param valor o valor a ser depositado na conta
     * */
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    /**
     * Este método recebe um valor flututante como argumento e retira do
     * saldo atual esse valor, realizando um saque na conta.
     * @param valor o valor a ser sacado da conta
     */
    fun saca(valor: Double) {
        if (this.saldo >= valor) { // se a conta possuir saldo suficiente
            this.saldo -= valor // realiza o saque
        }
    }

    /**
     * Este método recebe como argumento um valor e uma conta destino e
     * faz a transferência desse valor do objeto atual para o objeto Conta
     * destino.
     * @param valor o valor a ser transferido
     * @param destino uma instância da classe Conta, que receberá o valor da
     * transferência
     * */
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) { // se a conta tiver saldo suficiente
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    /**
     * @return uma String com os campos da classe formatados
     * */
    override fun toString(): String {
        return "Nome Cliente: $nomeCliente\nNumero da Conta: $numeroConta\nSaldo: R$ $saldo\n"
    }
}

fun testaLacos() {
    //var i: Int = 1
    /*while (i < 5) {
        val nomeCliente: String = "Alisson Jaques $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 200.0 + i

        println("\nTitular da conta: $nomeCliente")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: R$ $saldo")
        i++
    }*/
    for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break
        }
    }

    for (i in 5 downTo 1 step 2) {
        val nomeCliente: String = "Alisson Jaques $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 200.0 + i

        println("\nTitular da conta: $nomeCliente")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: R$ $saldo")
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo da conta esta positivo.")
        saldo == 0.0 -> println("Saldo da conta e neutro.")
        else -> println("Saldo da conta esta negativo.")
    }
}