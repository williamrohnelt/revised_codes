package estruturaDeDadosI.prova1;

public class App {
    public static void main(String[] args) {

        // criando as duas listaa
        ListaSimplesmenteEncadeada lista1 = new ListaSimplesmenteEncadeada(null);
        ListaSimplesmenteEncadeada lista2 = new ListaSimplesmenteEncadeada(null);

        // adicionando nodos no início da lista 1
        lista1.adicionarNoInicio(5, "John");
        lista1.adicionarNoInicio(10, "Paul");
        lista1.adicionarNoInicio(15, "George");
        
        // adicionando nodos no início da lista 2
        lista2.adicionarNoInicio(5, "John");
        lista2.adicionarNoInicio(10, "Paul");
        lista2.adicionarNoInicio(15, "George");

        // verificando se as listas são iguais
        // criação de uma variável do tipo boolean chamada listasIguais
        // recebe o valor do retorno do método verificarListasIguais(), (true or false)
        boolean listasIguais = lista1.verificarListasIguais(lista2);
        if (listasIguais) {
            System.out.println("As duas listas são iguais!");
        } else {
            System.out.println("As duas listas são diferentes!");
        }
    }
}