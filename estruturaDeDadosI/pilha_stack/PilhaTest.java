package estruturaDeDadosI.pilha_stack;

// Importa a classe Scanner.
// Scanner: É uma classe que já vem pronta no pacote java.util. Ela possui várias ferramentas para ler textos e números.
import java.util.Scanner;

// Modificador de acesso, significa que esta classe é "pública" e qualquer outra parte do projeto pode usar essa classe.
public class PilhaTest {
    public static void main(String[] args) { // Método principal (Padrão).

        // leitor: Nome da variável do tipo Scanner.
        // = (atribuição) sinal de igual que diz, "Pegue o que eu criar à direita e guarde na variável à esquerda".
        // new (criação) palavra-chave, ela diz ao sistema, "Aloque memória e crie um novo objeto".
        // Scanner(System.in) é o construtor, aqui estamos inicializando o Scanner. O detalhe crucial é o que está entre parênteses: System.in: Significa entrada do sistema (o que for digitado no teclado).
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira uma frase: ");

        // String frase, o que foi digitado é guardado dentro desta variável de texto.
        // leitor.nextLine(): Este é o comando mágico. Ele faz o programa "pausar" e esperar que o usuário digite algo e aperte Enter. Ele lê a linha inteira, incluindo espaços.
        String frase = leitor.nextLine();

        System.out.println("Você digitou: " + frase);

        leitor.close();
    }
}
