public class MinimumFallingSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 10, 4},
            {100, 3, 2, 1},
            {1, 1, 20, 1},
            {1, 2, 2, 1}
        };
        int result = minFallingPathSum(matrix);
        System.out.println(result);
    }
    public static int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];

        for (int col = 0; col < cols; col++) {
            dp[0][col] = matrix[0][col];
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int up = dp[row - 1][col];
                int leftDiagonal = col > 0 ? dp[row - 1][col - 1] : Integer.MAX_VALUE;
                int rightDiagonal = col < cols - 1 ? dp[row - 1][col + 1] : Integer.MAX_VALUE;
                dp[row][col] = matrix[row][col] + Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < cols; col++) {
            minSum = Math.min(minSum, dp[rows - 1][col]);
        }

        return minSum;
    }
}
