public class MinimumPaths {
    public static void main(String[] args) {
        int[][] grid = {
            {5,9,6},
            {11,5,2}
        };
        int[][] dp =new int[2][3];
        int res=count(1, 2,grid,dp);
        System.out.println(res);
    }
    public static int count(int rows, int cols, int[][]grid,int[][]dp){
        if(rows==0 && cols==0){
            return grid[0][0];
        }
        if(dp[rows][cols]!=0){
            return dp[rows][cols];
        }
        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(rows==0 && cols!=0){
            left=count(0, cols-1,grid,dp)+grid[0][cols];
        }
        else if(cols==0 && rows!=0){
            right=count(rows-1, 0,grid,dp)+grid[rows][0];
        }
        else{
            left=grid[rows][cols]+count(rows-1, cols,grid,dp);
            right=grid[rows][cols]+count(rows, cols-1,grid,dp);
        }
        return dp[rows][cols]=Math.min(right, left);
    }
}
