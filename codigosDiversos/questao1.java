package codigosDiversos;

public class Questao1 {
    public static void main(String[] args) {

        int[][] matriz = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
        int i;
        int j;
        int var1;
        int var2;

        for (j = 1; j < 2; j++) {
            for (i = 0; i < 3; i++) {

                /* \t é uma sequência de escape que representa o caractere de tabulação horizontal,
                // equivalente a pressionar a tecla Tab no teclado */
                // 1° loop = matriz[1][0] = 6
                // 2° loop = matriz[1][1] = 7
                // 3° loop = matriz[1][2] = 8
                System.out.printf("%d\t", matriz[j][i]);
            }
        }
        System.out.printf("\n\n");

        var1 = matriz[1][3];
        i = 0;
        while (i < 2) {
            System.out.printf("%d\t", var1 * i);
            i++;
        }
        System.out.printf("\n\n");

        var2=matriz[0][0];
        i=0;
        while (i<5) {
            System.out.printf("%d\t", matriz[var2][i]);
            i = i + 2;
        }
        System.out.printf("\n\n");
    }
}