package model

class Gerente (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario){
    // fun getBonificacao(){
     //    return this.salario * 0.2;
    // }
    fun autentica(senha: String): Boolean {
        return this.senha == senha;
    }
}