package codigos_revisados.atleta;

import java.util.Scanner;

public class App {
    public static void main (String args[]) {

        // Scanner é uma classe da biblioteca padrão do Java, importada com import java.util.Scanner
        // é responsável por ler dados do teclado, arquivos...
        // variável do tipo Scanner com o nome de leitor, recebe o objeto Scanner, System.in é o argumento
        Scanner leitor = new Scanner(System.in);
        //                      |
        //                   Scanner, aqui é o construtor da classe sendo chamado para criar o objeto
        //                   é o mesmo nome da classe, em Java o construtor sempre tem o mesmo nome da classe

        // variáveis
        int idade;
        String nome;

        String endereco;
        double salario;

        // leitura
        System.out.printf("Informe a sua idade: ");
        idade = leitor.nextInt();
        leitor.nextLine(); // limpeza do buffer do teclado

        System.out.printf("Informe o seu nome: ");
        nome = leitor.nextLine();

        System.out.printf("Informe o seu endereco: ");
        endereco = leitor.next();
        leitor.nextLine();

        System.out.printf("Informe o seu salario: ");
        salario = leitor.nextDouble();

        // verificando...
        System.out.printf("Dados lidos: %s tem %d anos, ganha R$ %.2f, e mora em %s.\n", nome, idade, salario, endereco);

        // criando objeto
        Atleta atleta1 = new Atleta(nome, idade);

        System.out.printf("Dados do Atleta: %s tem %d anos.\n", atleta1.getNome(), atleta1.getIdade());

        leitor.close();
    }
}