package codigos_revisados.cards;

public class DeckOfCardsMain {

    public static void main(String[] args) {

        //    criação da variável myDeckOfCards do tipo DeckOfCards
        //    |                   atribui o objeto à variável
        //    |                   |  cria o objeto do tipo DeckOfCards
        //    |                   |  |       executa o construtor
        //    |                   |  |       |
        DeckOfCards myDeckOfCards = new DeckOfCards();
        // myDeckOfCards possui uma referência para o objeto em memória que contém o array deck com 52 objetos Card

        // acessa a função shuffle do objeto DeckOfCards
        // embaralha as 52 cartas trocando cada carta de posição com outra aleatória
        myDeckOfCards.shuffle();

        // imprime todas as 52 cartas na ordem em que elas são distribuídas
        for (int i = 1; i <= 52; i++) {
            // distribui e exibe uma Card
            System.out.printf("%-19s", myDeckOfCards.dealCard().toString());
            if (i % 4 == 0) // gera uma nova linha após cada quarta carta
                System.out.println();
        }
    }
}