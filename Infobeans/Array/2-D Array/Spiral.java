public class SimpleSpiralMatrix {
    public static void main(String[] args) {
        int n = 4; // Size of the matrix (change this for different sizes)
        int[][] matrix = new int[n][n];

        int num = 1; // Start filling from 1
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; // Move top boundary down

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // Move right boundary left

            // Fill bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--; // Move bottom boundary up

            // Fill left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++; // Move left boundary right
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
