package utils

import model.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set;

    fun registraBonificacao(funcionario: Funcionario){
        total += funcionario.getBonificacao;
    }
}