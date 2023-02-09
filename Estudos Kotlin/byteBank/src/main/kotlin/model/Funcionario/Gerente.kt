package model.Funcionario

open class Gerente (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario){
    override val getBonificacao: Double get() = super.getBonificacao + this.salario;
    fun autentica(senha: String): Boolean {
        return this.senha == senha;
    }
    override fun toString(): String {
        return super.toString().replace("Dados do Funcionário","Dados do Gerente");
    }
}