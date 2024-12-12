public class CoinChangeII {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=5;
        int ind = coins.length-1;
        int[][] dp = new int[ind+1][amount+1];
        for(int i=0;i<ind+1;i++){
            for(int j=0;j<amount+1;j++){
                dp[i][j]=-1;
            }
        }
        int res=coinChange(coins, amount, dp, ind);
        System.out.println(res);
        System.out.println(coinChangeTabu(coins,amount));
        
    }
    public static int coinChange(int[] coins, int amount, int[][] dp, int ind){
        if(ind==0){
            if(amount%coins[0]==0){
                return 1;
            }
            else return 0;
        }
        else if(amount==0){
            return 1;
        }
        if(dp[ind][amount]!=-1){
            return dp[ind][amount];
        }
        int take = 0;
        int not_take = coinChange(coins, amount, dp, ind-1);
        if(coins[ind]<=amount){
            take = coinChange(coins, amount-coins[ind], dp, ind);
        }
        return dp[ind][amount]=take+not_take;
    }
    public static int coinChangeTabu(int[] coins, int amount){
        int l=coins.length;
        int[][] dp = new int[l][amount+1];
        for(int j=0;j<=amount;j++){
            if(j%coins[0]==0){
                dp[0][j]=1;
            }
            else{
                dp[0][j]=0;
            }
        }
        for(int i=1;i<l;i++){
            for(int j=0;j<amount+1;j++){
                int take = 0;
                int not_take = dp[i-1][j];
                if(coins[i]<=j){
                    take = dp[i][j-coins[i]];
                }
                dp[i][j]=take+not_take;
            }
        }
        return dp[l-1][amount];
    }
}
