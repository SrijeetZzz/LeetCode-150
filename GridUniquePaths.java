public class GridUniquePaths {
    public static void main(String[] args) {
        int[][] dp = new int[3][3];
        int res=count(2, 2,dp);
        System.out.println(res);
    }
    public static int count(int rows, int cols, int[][]dp){
        if(rows==0 && cols==0){
            return 1;
        }
        int left=0;
        int right=0;
        if(dp[rows][cols]!=0){
            return dp[rows][cols];
        }
        if(rows==0 && cols!=0){
            left=count(0, cols-1,dp);
        }
        else if(cols==0 && rows!=0){
            right=count(rows-1, 0,dp);
        }
        else{
            left=count(rows-1, cols,dp);
            right=count(rows, cols-1,dp);
        }
        return dp[rows][cols]=left+right;
    }
}
