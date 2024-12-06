public class MaximumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 10, 4},
            {100, 3, 2, 1},
            {1, 1, 20, 1},
            {1, 2, 2, 1}
        };
        int result = maxFallingPathSum(matrix);
        System.out.println(result);
    }

    public static int maxFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];

        for (int col = 0; col < cols; col++) {
            dp[0][col] = matrix[0][col];
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int up = dp[row - 1][col];
                int leftDiagonal = col > 0 ? dp[row - 1][col - 1] : Integer.MIN_VALUE;
                int rightDiagonal = col < cols - 1 ? dp[row - 1][col + 1] : Integer.MIN_VALUE;
                dp[row][col] = matrix[row][col] + Math.max(up, Math.max(leftDiagonal, rightDiagonal));
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int col = 0; col < cols; col++) {
            maxSum = Math.max(maxSum, dp[rows - 1][col]);
        }

        return maxSum;
    }
}
