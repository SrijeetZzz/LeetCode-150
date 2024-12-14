public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "bbabcbcab";
        StringBuilder sb = new StringBuilder(s).reverse();
        String t = sb.toString();
        int ind1 = s.length()-1;
        int ind2 = t.length()-1;
        int [][] dp = new int[ind1+2][ind2+2];
        for(int i=0;i<=ind1;i++){
            for(int j=0;j<=ind2;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(countLCSTabu(s,t,dp));
        // int i=ind1+1;
        // int j=ind2+1;
        // StringBuilder sbs = new StringBuilder();
        // while(i>0 && j>0){
        //     if(s.charAt(i-1)==t.charAt(j-1)){
        //         sbs.append(s.charAt(i-1));
        //         i--;
        //         j--;
        //     }
        //     else if(dp[i-1][j]>dp[i][j-1]){
        //         i--;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // for(int k=sbs.length()-1;k>=0;k--){
        //     System.out.print(sbs.charAt(k));
        // }
        
    }
    public static int countLCSTabu(String s, String t, int [][] dp){
        int n = s.length();
        int m = t.length();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        // for(int k=0;k<=n;k++){
        //     for(int l=0;l<=m;l++){
        //         System.out.print(dp[k][l]);
        //     }
        //     System.out.println("");
        // }
        return dp[n][m];
   }
}
