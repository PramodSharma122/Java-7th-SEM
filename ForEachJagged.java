// WAP to create a jagged array and fill it with values, then display the values in the array using for-each loop.
// date: 2025-04-30

public class ForEachJagged {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        
        for (int[] row : jaggedArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
