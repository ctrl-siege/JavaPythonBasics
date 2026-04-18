
public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // Create a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access elements
        System.out.println("Element at row 1, column 2: " + matrix[0][1]); // Output: 2

        // Loop through the 2D array
        System.out.println("\nMatrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Modify an element
        matrix[1][1] = 50;

        System.out.println("\nUpdated matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Note: Java arrays are fixed size, so we can't "append" like Python.
        // Instead, create a new larger array and copy values.

        int[][] newMatrix = new int[matrix.length + 1][3];

        // Copy old values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }

        // Add new row
        newMatrix[matrix.length] = new int[]{10, 11, 12};

        System.out.println("\nAfter adding a new row:");
        for (int[] row : newMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Sum all elements
        int total = 0;
        for (int[] row : newMatrix) {
            for (int value : row) {
                total += value;
            }
        }

        System.out.println("\nSum of all elements: " + total);
    }
}