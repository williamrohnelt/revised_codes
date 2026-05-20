package estruturaDeDadosI.prova2;

public class Recursao {
    public static void main(String[] args) {
        recursao(24);
    }

    public static int recursao(int n) {
        System.out.println(n + " ");
            if (n <= 10) {
                return n * 2; // 4 * 2 = 8
            } else {
                return recursao(recursao(n / 6)); // 24 / 6 = 4
            }
    }
}

//print
//24 
//4 
//8 