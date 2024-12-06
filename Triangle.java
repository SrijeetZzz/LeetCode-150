public class Triangle {
    public static void main(String[] args) {
        int[][] tri = {
            {1},
            {2,3},
            {3,6,7},
            {8,9,6,10}
        };
        int n = tri.length;
        int[][] dp = new int[3][3];
        int res = triangle(tri, 0, 0,n,dp);
        System.out.println(res);

    }
    public static int triangle(int [][] tri,int rows,int cols,int n,int[][] dp){
        if(rows==n-1){
            return tri[n-1][cols];
        }
        if(dp[rows][cols]!=0){
            return dp[rows][cols];
        }
        int d = tri[rows][cols]+triangle(tri, rows+1, cols, n,dp);
        int dg = tri[rows][cols]+triangle(tri, rows+1, cols+1, n,dp);
        return dp[rows][cols]=Math.min(d,dg);
    }
}
