class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        // We'll reuse the input matrix as a DP table
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && i > 0 && j > 0) {
                    // Update the current cell with the size of the largest square ending here
                    matrix[i][j] = 1 + Math.min(matrix[i-1][j], 
                                                Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                }
                count += matrix[i][j];
            }
        }

        return count;
    }
}
