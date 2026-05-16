package codigos_revisados.cards;

// criação da classe Card, que representa uma carta de baralho
public class Card {

    // variável private do tipo String com o nome de face, é final pois não é possível altera-lá
    private final String face;

    // variável private do tipo String com o nome de suit, é final pois não é possível altera-lá
    private final String suit;

    // construtor da classe Card que recebe dois argumentos String, cardFace e cardSuit, 
    public Card(String cardFace, String cardSuit) {

        // this.face atualiza a variável face com o valor passado para o argumento cardFace
        this.face = cardFace;

        // this.suit atualiza a variável suit com o valor passado para o argumento cardSuit
        this.suit = cardSuit;
    }

    // criação de um método chamado toString, do tipo String
    public String toString() {

        // esse método retorna o valor da variável face e suit com a string "of" entre elas
        return face + " of " + suit;
    }
}