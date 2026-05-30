package estruturaDeDadosI.prova2.questao8;

public class App {
    public static void main(String[] args) {

        // variáveis locais, existem dentro do método main
        Nodo lista;
        Nodo aux;
        int n = 5;

        if (n == 0) {
            lista = null;
        } else {
            // o n-- é o pós-decremento, usa o valor atual de n primeiro, depois subtrai 1
            lista = new Nodo(n--); // Nodo.5|null

            // o for sem inicialização e sem incremento funciona como um while
            while (n > 0) {
                aux = new Nodo(n--); // aux.Nodo.1|null
                aux.setProximo(lista); // aux=Nodo.1|Nodo.2|Nodo.3|Nodo.4|Nodo.5|null
                lista = aux; // lista=Nodo.1|Nodo.2|Nodo.3|Nodo.4|Nodo.5|null
            }
        }

        while (lista != null) {
            System.out.printf("%d ", lista.getValor());
            lista = lista.getProximo();
        }
    }
}
// print
// 1 2 3 4 5

// lista=Nodo.5|null
// aux=Nodo.4|null
// aux=Nodo.4|Nodo.5|null
// lista=Nodo.5|null = aux=Nodo.4|Nodo.5|null
// lista=Nodo.4|Nodo.5|null