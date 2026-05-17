package investimento;

// uma interface é como um contrato, ela define o que uma classe deve ter, mas não como implementar
public interface Investimento {

    // atributos
    // em interfaces, todo atributo é automaticamente public static final, mesmo que você não escreva
    // é a forma de definir constantes em Java
    public static final double GANHOS = 0.02;

    // métodos
    // sem implementação, só a assinatura
    // em interfaces, todo método é automaticamente public abstract, mesmo que você não escreva
    // significa que qualquer classe que implemente essa interface obrigatoriamente deve ter esse método
    public abstract void calculaJuros();
}