// WAP to create a jagged array and fill it with values, then display the values in the array.
// date: 2025-04-30

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][]; 
        jaggedArray[0] = new int[]{1,2};
        jaggedArray[1] = new int[]{3,4,5};
        jaggedArray[2] = new int[]{6};

        // Fill the jagged array with values
        // int value = 1;
        // for (int i = 0; i < jaggedArray.length; i++) {
        //     for (int j = 0; j < jaggedArray[i].length; j++) {
        //         jaggedArray[i][j] = value++;
        //     }
        // }

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
