package programacao1.projetoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Curso> listaCursos = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("Menu");
            System.out.println("1: Criar Curso");
            System.out.println("2: Pesquisar Curso");
            System.out.println("3: Remover Curso");
            System.out.println("4: Sair");
            System.out.print("Informa a opção desejada: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // limpeza do buffer

            switch (opcao) {
                case 1:
                    Curso novoCurso = new Curso();
                    Instrutor novoInstrutor = new Instrutor();

                    System.out.print("Informe o nome do curso: ");
                    novoCurso.setNomeCurso(leitor.nextLine());

                    System.out.print("Informe o número de aulas: ");
                    novoCurso.setNumeroAulas(leitor.nextInt());
                    leitor.nextLine();

                    System.out.print("Informe o público alvo (iniciante ou experiente): ");
                    novoCurso.setPublicoAlvo(leitor.nextLine());

                    System.out.print("Qual o ano de lancamento do curso? ");
                    novoCurso.setAnoLancamento(leitor.nextInt());
                    leitor.nextLine();

                    System.out.print("Informe o nome do instrutor: ");
                    novoInstrutor.setNomeInstrutor(leitor.nextLine());

                    System.out.print("Informe o email do instrutor: ");
                    novoInstrutor.setEmail(leitor.nextLine());

                    novoCurso.setInstrutor(novoInstrutor);

                    // adicionando aulas ao curso
                    System.out.print("Quantas aulas deseja cadastrar? ");
                    int qtdAulas = leitor.nextInt();
                    leitor.nextLine();

                    for (int i = 0; i < qtdAulas; i++) {
                        Aula novaAula = new Aula();

                        System.out.printf("Aula %d%n", i + 1);

                        System.out.print("Informe o número da Aula: ");
                        novaAula.setNumeroAula(leitor.nextInt());
                        leitor.nextLine();

                        System.out.print("Informa o assunto: ");
                        novaAula.setAssunto(leitor.nextLine());

                        System.out.print("Informa o total de horas: ");
                        novaAula.setNumeroAula(leitor.nextInt());
                        leitor.nextLine();

                        novoCurso.setAula(novaAula);
                    }

                    listaCursos.add(novoCurso);
                    System.out.println("Curso cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaCursos.isEmpty()) {
                        System.out.println("Nenhum curso cadastrado.");
                        break;
                    }

                    System.out.print("Informe o nome do curso a pesquisar: ");

                    // variáveil do tipo String chamada nomePesquisa
                    // recebe a string digitada no teclado
                    String nomePesquisa = leitor.nextLine();

                    // variável chamada encontrado do tipo boolean
                    // inicia com false
                    boolean encontrado = false;

                    // loop for-each
                    // cada loop é verificado um objeto do tipo Curso que está na listaCursos
                    // a cada loop esse objeto é armazenado na variável c
                    for (Curso c : listaCursos) {

                        //         pega o nome do curso atual
                        //         /\                compara com o que o foi digitado, ignorando maiúsculas/minúsculas
                        //         |                 /\
                        //         |                 |
                        if (c.getNomeCurso().equalsIgnoreCase(nomePesquisa)) {

                            // executa o método exibeCurso() do objeto que está em c
                            c.exibeCurso();
                            encontrado = true;
                            break;
                        }
                    }

                    // !encontrado tem que ser true para entrar no if e imprimir a mensagem
                    // se encontrado é true (pois encontrou um curso) o sinal NOT (!) inverte o valor para false e não entra no if
                    if (!encontrado) {
                        System.out.println("Curso não encontrado.");
                    }
                    break;

                case 3:
                    if (listaCursos.isEmpty()) {
                        System.out.println("Nenhum curso cadastrado.");
                        break;
                    }

                    System.out.print("Informe o nome do curso a remover: ");
                    String nomeRemover = leitor.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < listaCursos.size(); i++) {
                        if (listaCursos.get(i).getNomeCurso().equalsIgnoreCase(nomeRemover)) {
                            listaCursos.remove(i);
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("Curso removido com sucesso!");
                    } else {
                        System.out.println("Curso não encontrado.");
                    }
                    break;

                case 4:
                    int totalAulas = 0;
                    for (Curso c : listaCursos) {
                        totalAulas = totalAulas + c.getNumeroAulas();
                    }
                    System.out.println("Total de aulas na coleção: " + totalAulas);
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        leitor.close();
    }
}