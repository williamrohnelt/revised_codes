package estruturaDeDadosI.pilha_stack.testPilha_3;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Eduardo");
        pilha.push("Aline");
        pilha.push("Amanda");
        pilha.push("William");
        pilha.push("Bruna");

        System.out.println(pilha);

        pilha.push("Test");

        System.out.println("Removendo: " + pilha.pop());

        System.out.println(pilha);

        System.out.println("Removendo: " + pilha.pop());
        System.out.println("Removendo: " + pilha.pop());
        System.out.println("Removendo: " + pilha.pop());
        System.out.println("Removendo: " + pilha.pop());

        System.out.println(pilha.peek());

        pilha.push("Eduardo");
        pilha.push("Aline");
        pilha.push("Amanda");

        System.out.println(pilha.peek());

    }
}
