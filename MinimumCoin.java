public class MinimumCoin {
    // public static void main(String[] args) {
    //     int[] coin ={2,5,10,1};
    //     int n=coin.length;
    //     int target=27;
    //     int dp[][]= new int[n+1][target+1];
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j <= target; j++) {
    //             dp[i][j] = -1;
    //         }
    //     }
    //     int res=coinCount(n-1,target,coin,dp);
    //     if(res==Integer.MAX_VALUE) 
    //         System.out.println(-1);
    //     else 
    //         System.out.println(res);
    // }
    // public static int coinCount(int ind, int target, int[] coin,int[][] dp){
    //     if(ind==0){
    //         if(target%coin[0]==0){
    //             return target/coin[ind];
    //         }
    //         else return Integer.MAX_VALUE;
    //     }
    //     if(dp[ind][target]!=-1){
    //         return dp[ind][target];
    //     }
    //     int take=Integer.MAX_VALUE;
    //     int not_take = coinCount(ind-1, target, coin,dp);
    //     if(target>=coin[ind]){
    //         take=1+coinCount(ind, target-coin[ind], coin,dp);
    //     }
    //     return dp[ind][target]=Math.min(take, not_take);
    // }
            public static void main(String args[]) {
                int[] coins={2,5,10,1};
                int target =27;
                int n = coins.length;
                int[][] dp = new int[n][target + 1];
                
                // Initialize the DP table with a high value
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= target; j++) {
                        dp[i][j] = Integer.MAX_VALUE;
                    }
                }
                
                // Base case: Filling the first row
                for (int T = 0; T <= target; T++) {
                    if (T % coins[0] == 0) {
                        dp[0][T] = T / coins[0];
                    }
                }
                
                // DP transitions for remaining rows
                for (int ind = 1; ind < n; ind++) {
                    for (int T = 0; T <= target; T++) {
                        int take = Integer.MAX_VALUE;
                        if (T >= coins[ind] && dp[ind][T - coins[ind]] != Integer.MAX_VALUE) {
                            take = 1 + dp[ind][T - coins[ind]];
                        }
                        int not_take = dp[ind - 1][T];
                        dp[ind][T] = Math.min(take, not_take);
                    }
                }
                
                int ans = dp[n - 1][target];
                System.out.println(ans == Integer.MAX_VALUE ? -1 : ans); 
            }
    
    
}


