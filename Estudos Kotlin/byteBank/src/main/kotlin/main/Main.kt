import model.Diretor
import model.Funcionario
import model.Gerente

/**
 * A função main permite a execução desse programa
 * @author Alisson Jaques
 * */
fun main() {
    println("\n=========== Bem Vindo ao Byte Bank! ===========\n")

    val funcionario = Funcionario(
        nome = "Alisson Jaques",
        cpf = "999.999.999-99",
        salario = 2000.0);

    println("Dados do Funcionário\n" +
            "Nome: ${funcionario.nome}\n" +
            "CPF: ${funcionario.cpf}\n" +
            "Salário: R$ ${funcionario.salario}\n" +
            "Bonificação: R$ ${funcionario.getBonificacao()}");

    val gerente = Gerente(
        nome = "Bruna Silva Jaques",
        cpf = "777.777.777-77",
        salario = 2000.0,
        senha = "123456");

    println("\nDadados do Gerente\n" +
            "Nome: ${gerente.nome}\n" +
            "CPF: ${gerente.cpf}\n" +
            "Salário: R$ ${gerente.salario}\n" +
            "Bonificação: R$ ${gerente.getBonificacao()}");
    if(gerente.autentica("123456")){
        println("Acesso Gerente: autorizado.");
    } else{
        println("Acesso Gerente: não autorizado.");
    }

    val diretor = Diretor(
        nome = "João Francisco da Silva",
        cpf = "888.888.888-88",
        salario = 4000.0,
        senha = "787878",
        plr = 300.00);

    println("\nDadados do Diretor\n" +
            "Nome: ${diretor.nome}\n" +
            "CPF: ${diretor.cpf}\n" +
            "Salário: R$ ${diretor.salario}\n" +
            "Bonificação: R$ ${diretor.getBonificacao()}\n" +
            "PLR: R$ ${diretor.plr}");
    if(diretor.autentica("787878")){
        println("Acesso Gerente: autorizado.");
    } else{
        println("Acesso Gerente: não autorizado.");
    }

    println("\n===============================================\n")
}