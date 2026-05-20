package estruturaDeDadosI.prova2;

public class Combinacao {
    public static void main(String[] args) {
        System.out.println(combinacao(4, 2));
    }

    public static int combinacao(int n, int k) {
        if (k == 1) {
            return n;
        } else {
            if (k == n) {
                return 1;
            } else {
                return combinacao(n - 1, k - 1) + combinacao(n - 1, k);
            } //                    3      1                    3   2
              //                   if (k == 1)                    |
              //                    return n                      |
              //                       3          c(3 - 1, 2 - 1) + c(3 - 1, 2)
        }     //                                                  |
    }         //                                          c(2, 1) + c(2, 2)
}             //                                             2          1
              //                                                  3
              //                              3 + 3 = 6
// combinação é o cálculo de quantas formas podemos
// escolher k elementos de um conjunto de n elementos, sem importar a ordem
// caso recursivo = javareturn combinacao(n - 1, k - 1) + combinacao(n - 1, k);
// é baseado na identidade matemática de Pascal, C(n, k) = C(n-1, k-1) + C(n-1, k)