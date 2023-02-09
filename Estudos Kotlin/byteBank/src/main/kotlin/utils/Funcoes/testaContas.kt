import model.Conta.Conta
import model.Conta.ContaCorrente
import model.Conta.ContaPoupanca

fun testaContas() {
    val contaCorrente = ContaCorrente(nomeCliente = "Alisson Jaques", numeroConta = 1000);
    val contaPoupanca = ContaPoupanca(nomeCliente = "Alisson Jaques", numeroConta = 2000);

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Conta Corrente: R$ ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: R$ ${contaPoupanca.saldo}")

    contaCorrente.saca(10.0)
    contaPoupanca.saca(10.0)

    println("Saldo Conta Corrente após o saque: R$ ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após o saque: R$ ${contaPoupanca.saldo}")

    contaCorrente.transfere(20.0,contaPoupanca);
    contaPoupanca.transfere(5.0,contaCorrente);

    println("Saldo Conta Corrente após a trasnferência: R$ ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após a trasnferência: R$ ${contaPoupanca.saldo}")
}