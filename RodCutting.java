public class RodCutting {
    //Memoization
    public static void main(String[] args) {
        int[] price={3, 5, 8, 9, 10, 17, 17, 20};
        int N = price.length;
        int[][] dp = new int[N][N+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<N+1;j++){
                dp[i][j]=-1;
            }
        }
        int res = rodCutter(price, N, dp, N-1);
        System.out.println(res);
        System.out.println(rodcutterTabu(price));
    }
    public static int rodCutter(int[] price, int N, int[][] dp,int ind){
        if(ind==0){
            return N*price[0];
        }
        if(dp[ind][N]!=-1){
            return dp[ind][N];
        }
        int take = Integer.MIN_VALUE;
        int not_take= rodCutter(price, N, dp, ind-1);
        int length=ind+1;
        if(length<=N){
            take=price[ind]+rodCutter(price, N-length, dp, ind);
        }
        return dp[ind][N] = Math.max(take,not_take);
    }

    //Tabulation
    public static int rodcutterTabu(int[] price) {
        int N = price.length;
        int[][] dp = new int[N][N+1];
        for(int l=0;l<=N;l++){
            dp[0][l]=price[0]*l;
        }
        for(int i=1;i<N;i++){
            for(int l=0;l<=N;l++){
                int take = Integer.MIN_VALUE;
                int not_take= dp[i-1][l];
                int length=i+1;
                if(length<=l){
                    take=price[i]+dp[i][l-length];
                }
                dp[i][l] = Math.max(take,not_take);
            }
        }
        return dp[N-1][N];       //cannot write N,N-1  because in the loop the value of N is being changed
    }
}
