package model

class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario){
    // fun getBonificacao(){
     //    return this.salario * 0.2;
    // }
    fun autentica(senha: String): Boolean {
        return this.senha == senha;
    }
}