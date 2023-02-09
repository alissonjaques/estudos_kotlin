package model.Funcionario

class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario){
    override val getBonificacao: Double get() =  super.getBonificacao + this.salario + this.plr;
    fun autentica(senha: String): Boolean {
        return this.senha == senha;
    }
    override fun toString() : String{
        return super.toString()
            .replace("Dados do Funcionário","Dados do Diretor") + "PLR: R$ ${plr}\n";
    }
}