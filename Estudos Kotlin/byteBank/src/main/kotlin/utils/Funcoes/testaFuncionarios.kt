package utils;

import model.Funcionario.Analista
import model.Funcionario.Diretor
import model.Funcionario.Funcionario
import model.Funcionario.Gerente
import utils.Classes.CalculadoraBonificacao

fun testeFuncionario(){
    val bonificacao = CalculadoraBonificacao();
    print(delimitador)
    val funcionario = Funcionario(
        nome = "Alisson Jaques",
        cpf = "999.999.999-99",
        salario = 2000.0);
    bonificacao.registraBonificacao(funcionario);
    print("${funcionario}${autentica(funcionario)}\n${delimitador}")

    val gerente = Gerente(
        nome = "Bruna Silva Jaques",
        cpf = "777.777.777-77",
        salario = 2000.0,
        senha = "123456");
    bonificacao.registraBonificacao(gerente);
    print("${gerente}${autentica(gerente)}\n${delimitador}")

    val analista = Analista(
        nome = "Frodo Bolseiro",
        cpf = "555.555.555-55",
        salario = 1700.0);
    bonificacao.registraBonificacao(analista);
    print("${analista}${delimitador}")

    val diretor = Diretor(
        nome = "João Francisco da Silva",
        cpf = "888.888.888-88",
        salario = 4000.0,
        senha = "787878",
        plr = 300.00);
    bonificacao.registraBonificacao(diretor);
    print("${diretor}${autentica(diretor)}\n${delimitador}")
    print("Total bonificação: R$${bonificacao.total}\n${delimitador}");
}

val delimitador: String get() = "-----------------------------------------------\n";

fun autentica(funcionario: Funcionario): String{
    if(funcionario is Diretor){
        return if(funcionario.autentica("787878")) "Acesso Diretor: autorizado.";
        else "Acesso Diretor: não autorizado.";
    } else if(funcionario is Gerente){
        return if(funcionario.autentica("123456")) "Acesso Gerente: autorizado.";
        else "Acesso Gerente: não autorizado.";
    }
    return "Acesso: não autorizado.";
}