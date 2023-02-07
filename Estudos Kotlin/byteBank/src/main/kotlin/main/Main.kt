import model.Diretor
import model.Funcionario
import model.Gerente

/**
 * A função main permite a execução desse programa
 * @author Alisson Jaques
 * */
fun main() {
    println("\n=========== Bem Vindo ao Byte Bank! ===========")
    print(delimitador)
    val funcionario = Funcionario(
        nome = "Alisson Jaques",
        cpf = "999.999.999-99",
        salario = 2000.0);
    print("${funcionario}${autentica(funcionario)}\n${delimitador}")

    val gerente = Gerente(
        nome = "Bruna Silva Jaques",
        cpf = "777.777.777-77",
        salario = 2000.0,
        senha = "123456");
    print("${gerente}${autentica(gerente)}\n${delimitador}")

    val diretor = Diretor(
        nome = "João Francisco da Silva",
        cpf = "888.888.888-88",
        salario = 4000.0,
        senha = "787878",
        plr = 300.00);
    print("${diretor}${autentica(diretor)}\n${delimitador}")
    println("===============================================\n")
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