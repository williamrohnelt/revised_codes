package estruturaDeDadosI.array;

public class SumArray {
    public static void main(String[] args) {

        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        //              0,  1,  2,   3,  4,  5,  6,  7,  8,  9
        // array.length = 10

        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}

// total += array[counter]
// total = total + array[counter]

// Total of array elements: 849