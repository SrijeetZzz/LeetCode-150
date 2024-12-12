public class KnapSack {
    public static void main(String args[]){
        int[] vol={30,40,50};
        int[] wt={3,4,5};
        int n=vol.length;
        int wght=8;
        int [][] dp = new int[n][wght+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= wght; j++) {
                dp[i][j] = -1;
            }
        }
        int res=knapsack(n, wt, vol, wght,dp);
        System.out.println(res);
    }
    public static int knapsack(int n,int [] wt, int[] vol, int wght,int[][] dp){
        if(n==0){
            return 0;
        }
        if(dp[n-1][wght]!=-1){
            return dp[n-1][wght];
        }
        int take= Integer.MIN_VALUE;
        int not_take = knapsack(n-1, wt, vol, wght,dp);
        if(wght>=wt[n-1]){
            take=vol[n-1]+knapsack(n-1, wt, vol, wght-wt[n-1],dp);
        }
        return dp[n-1][wght]=Math.max(take, not_take);
    }
}
