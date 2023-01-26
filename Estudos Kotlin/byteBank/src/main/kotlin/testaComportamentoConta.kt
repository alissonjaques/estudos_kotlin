fun testaComportamentoConta() {
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