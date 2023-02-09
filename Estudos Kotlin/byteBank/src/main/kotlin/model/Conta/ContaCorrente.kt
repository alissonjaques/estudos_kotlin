package model.Conta

open class ContaCorrente(
    nomeCliente: String,
    numeroConta: Int
) : Conta(nomeCliente = nomeCliente, numeroConta = numeroConta) {
    override fun saca(valor: Double){
        super.saca(valor+0.1)
    }
}