package codigos_revisados.programacao1.projetoParcial;

import java.util.Scanner; // classe Scanner, que permite a leitura do teclado

public class App {
    public static void main(String args[]) {

        // curso 1
        Curso curso1 = new Curso("Arquitetura", 28, "experiente", 1993);

        Instrutor instrutor1 = new Instrutor("William","william@gmail.com");

        curso1.setInstrutor(instrutor1);

        Scanner leitor = new Scanner(System.in);

        // curso 2
        Curso curso2 = new Curso();

        Instrutor instrutor2 = new Instrutor();

        curso2.setInstrutor(instrutor2);

        //leitura
        System.out.printf("Informe o nome do curso2: ");
        curso2.setNomeCurso(leitor.nextLine());

        System.out.printf("Informe o número de aulas: ");
        curso2.setNumeroAulas(leitor.nextInt());
        leitor.nextLine(); //limpeza do buffer do teclado

        System.out.printf("Informe o público alvo, iniciante ou experiente:");
        curso2.setPublicoAlvo(leitor.nextLine());

        System.out.printf("Qual o ano de lancamento do curso? ");
        curso2.setAnoLancamento(leitor.nextInt());
        leitor.nextLine(); //limpeza do buffer do teclado

        System.out.printf("Informe o nome do instrutor do curso: ");
        instrutor2.setNomeInstrutor(leitor.nextLine());

        System.out.printf("Informe o email do instrutor: ");
        instrutor2.setEmail(leitor.nextLine());

        leitor.close();


        System.out.println();

        System.out.println("Curso 1");

        curso1.exibeCurso();


        System.out.println();

        System.out.println("Curso 2");

        curso2.exibeCurso();
    }
}