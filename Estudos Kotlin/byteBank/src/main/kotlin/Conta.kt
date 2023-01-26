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