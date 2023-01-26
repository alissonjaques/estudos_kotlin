fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo da conta esta positivo.")
        saldo == 0.0 -> println("Saldo da conta e neutro.")
        else -> println("Saldo da conta esta negativo.")
    }
}