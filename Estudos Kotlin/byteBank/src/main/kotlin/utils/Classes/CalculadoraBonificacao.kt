package utils.Classes

import model.Funcionario.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set;

    fun registraBonificacao(funcionario: Funcionario){
        total += funcionario.getBonificacao;
    }
}