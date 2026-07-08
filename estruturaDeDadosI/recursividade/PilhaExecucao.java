package estruturaDeDadosI.recursividade;

public class PilhaExecucao {

    // method B, public, and receives two integer values
    // the two values added together
    // return the sum of the two values
    public static int B(int i, int j) {
        return i + j;
    }

    // method A, public, and receives three integer values
    public static int A(int i, int j, int k) {
        // create a integer variable x
        // x is the B return
        int x;
        // chamada ao método B(), o cursor do programa é deslocado para o método B().
        x = B(i, j);
        x = x + k;
        return x;
    }

    public static void main(String args[]) {
        int i;
        int j;
        int k;
        int y;

        i = 1;
        j = 2;
        k = 3;

        // chamada ao método A(), o cursor do programa é deslocado para o método A().
        y = A(i, j, k);
        System.out.println("y: " + y + "\n");
    }
}