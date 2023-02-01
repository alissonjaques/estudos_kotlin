package model

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    fun getBonificacao(): Double{
        return this.salario * 0.1;
    }
}