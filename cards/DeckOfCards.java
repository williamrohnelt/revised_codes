package codigos_revisados.cards;

// importe da classe SecureRandom que está no pacote security, dentro da biblioteca java
import java.security.SecureRandom;

public class DeckOfCards {

    // atributos (variáveis), criação de 4 veriáveis

    // declara um array de objetos Card, do tipo Card, criados com a classe Card.java, array com o nome de deck
    // private significa que só a própria classe pode acessá-lo
    private Card[] deck;

    // variável private do tipo int, com o nome de currentCard, sem nenhum valor definido
    private int currentCard;

    // criação de uma variável constante (final), a palavra final significa que é uma constante, o valor não pode mudar
    // variável de tipo int e nome NUMBER_OF_CARD, recebe o valor 52
    private static final int NUMBER_OF_CARDS = 52;

    // criação de uma variável de nome randomNumbers, do tipo SecureRandom
    // SecureRandom gera números aleatórios de forma criptograficamente segura diferente do Random comum, é muito mais difícil de prever
    // new SecureRandom() cria o objeto na memória, = atribui o objeto criado à variável randomNumbers
    private static final SecureRandom randomNumbers = new SecureRandom();

    // método construtor

    // método construtor, pois tem o mesmo nome da classe e não tem tipo de retorno
    // é chamado no main, cria dois arrays de strings, faces e suits, e atribui valores
    public DeckOfCards() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // define que o array deck do tipo Card, vai ter 52 de tamanho
        deck = new Card[NUMBER_OF_CARDS];

        // atribui o valor 0 à variável currentCard
        currentCard = 0;

        // preenche baralho com objetos Card
        for (int count = 0; count < deck.length; count++) {
            // no primeiro loop, count é 0 = deck[0], o índice 0 do array deck irá receber um objeto Card, objeto esse que tem como parâmetro duas strings
            // primeira string do objeto Card irá ser a string do array faces, que está no índice [count % 13], [0 % 13] = 0, a string que está no índice 0 do array faces é Ace
            // segunda string será do array suits, [count / 13], [0 / 13] =  0 (divisão inteira / entre dois inteiros em Java ignora o decimal), string que está no índice 0 do array suits é Hearts
            // o índice 0 do array deck irá receber o objeto Card("Ace", "Hearts") no primeiro loop
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    // métodos comuns

    // criação do método shuffle, publico e void
    public void shuffle() {

        // define o valor 0 à variável currentCard
        currentCard = 0;

        // variável first recebe 0 no primeiro loop, o loop é executado enquanto first for menor que deck.length (deck.length = 52)
        for (int first = 0; first < deck.length; first++) {

            // variável second do tipo int recebe o retorno da função nextInt, essa função tem origem da variável randomNumbers do tipo e classe SecureRandom
            // nextInt, método que gera um número inteiro aleatório, recebe um limite como argumento, nesse caso o número 52
            // gera um número entre 0 e limite (52) - 1, ou 0 e 51, esse número irá representar um índice do array deck
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // criação da variável temp do tipo Card
            // atribui à variável temp o valor que está no índice 0 do array deck
            // pois first é 0 nesse primeiro loop, deck[first] = deck[0] = Card{face="Ace", suit="Hearts"}
            Card temp = deck[first]; // temp = Card{face="Ace", suit="Hearts"}

            // valor do índice first = 0 do array deck é substituído pelo valor do índice second = valor aleatório (nextInt) do array deck
            deck[first] = deck[second];

            // valor do índice second = valor aleatório (nextInt) do array deck é substituído pelo valor atribuído à variável temp (Card{face="Ace", suit="Hearts"})
            deck[second] = temp;
        }
    }

    // distribui uma Card
    // método público do tipo Card, com o nome dealCard
    public Card dealCard() {

        // determina se ainda há Cards a serem distribuídas
        // currentCard = 0
        if (currentCard < deck.length)
            return deck[currentCard++]; // retorna Card do índice atual no array deck
        else
            return null; // retorna nulo para indicar que todos as Cards foram distribuídas
    }

} // fim da classe DeckOfCards