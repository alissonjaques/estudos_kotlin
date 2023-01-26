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