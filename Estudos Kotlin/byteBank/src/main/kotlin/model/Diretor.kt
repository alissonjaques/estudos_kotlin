package model

class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario){
    override val bonificacao: Double get() =  this.salario * 0.3;
    fun autentica(senha: String): Boolean {
        return this.senha == senha;
    }
    override fun toString() : String{
        return super.toString()
            .replace("Dados do Funcionário","Dados do Diretor") + "\nPLR: R$ ${plr}";
    }
}