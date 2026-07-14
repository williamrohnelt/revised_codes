package student;

public class ExampleCodes {
    public static void main(String args[]) {

        int vetor[] = new int[20];      // declaration of an integer array called vector of size 20 and allocation in memory
        System.out.println(vetor[0]);   // printing the first element of the vector to the screen
        System.out.println(vetor[5]);   // printing the sixth element of the vector on the screen

        String characters[] = new String[5];                // declaration of a string array called characters of size 5 and allocation in memory
        float medias[] = new float[15];                     // declaration of a float array called medias of size 15 and allocation in memory
        boolean InvitationsPurchased[] = new boolean[10];   // declaration of a boolean array called invitationsPurchased of size 10
        System.out.println(characters[2]);                  // printing the value of index 2 of the characters array
        System.out.println(medias[2]);                      // printing the value of index 2 of the medias array
        System.out.println(InvitationsPurchased[2]);        // printing the value of index 2 of the invitationsPurchased array

        String beatles[] = new String[4];
        beatles[0] = "John";
        beatles[1] = "Paul";
        beatles[2] = "George";
        beatles[3] = "Ringo";
        System.out.println(beatles[1]);
        System.out.println(beatles[4]);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        // matriz[4][3]:

        //           col 0  col 1   col 2
        // line 0:  [  0]  [  5]   [ 10]
        // line 1:  [ 15]  [ 20]   [ 25]
        // line 2:  [ 30]  [ 35]   [ 40]
        // line 3:  [ 45]  [ 50]   [ 55]
        int matriz[][] = new int[4][3];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = 3 * l * 5 + 5 * c;
            }
        }

        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++)
                System.out.print(matriz[l][c] + "\t");
            System.out.println();
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++)
                System.out.print(matriz[l][c] + "\t");
            System.out.println();
        }

        Student student[] = new Student[4];
        student[0] = new Student(1, "John");
        student[1] = new Student(2, "Paul");
        student[2] = new Student(3, "George");
        student[3] = new Student(4, "Ringo");

        for (int i=0; i<student.length; i++) {
            System.out.println(student[i].getRegistration() + ": " + student[i].getName());
        }
    }
}