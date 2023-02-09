package model.Funcionario

class Analista (
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario){
    override val getBonificacao: Double get() = super.getBonificacao + this.salario/2.0;

    override fun toString(): String {
        return super.toString().replace("Dados do Funcionário","Dados do Analista");
    }
}