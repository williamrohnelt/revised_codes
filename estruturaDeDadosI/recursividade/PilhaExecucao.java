package estruturaDeDadosI.recursividade;

public class PilhaExecucao {
    
   public static int B (int x, int y) {
      return x + y;
   }

   public static int A (int i, int j, int k) {
      int x;
      // Chamada ao método B(), o cursor do programa é deslocado para o método B().
      x = B (i, j);
      x = x + k;
      return x;
   }

   public static void main(String args[]) {
      int i, j, k, y;
      i = 1; j = 2; k = 3;
      // Chamada ao método A(), o cursor do programa é deslocado para o método A().
      y = A (i, j, k);
      System.out.println("y: " + y + "\n");
   }

}
