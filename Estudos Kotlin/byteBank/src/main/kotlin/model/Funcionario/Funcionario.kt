package model.Funcionario

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val getBonificacao: Double get() = this.salario * 0.1;
    override fun toString(): String{
        return "               Dados do Funcionário            \n" +
                "Nome: ${nome}\n" +
                "CPF: ${cpf}\n" +
                "Salário: R$ ${salario}\n" +
                "Bonificação: R$ ${getBonificacao}\n";
    }
}