public class LongestCommonSubsequence {

    //Memoiation
   public static void main(String[] args) {
        String s ="abde";
        String t="bdge";
        int ind1 = s.length()-1;
        int ind2 = t.length()-1;
        int [][] dp = new int[ind1+1][ind2+1];
        for(int i=0;i<=ind1;i++){
            for(int j=0;j<=ind2;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(countLCS(s, t, ind1, ind2, dp));
        System.out.println(countLCSTabu(s,t));
        int i=ind1+1;
        int j=ind2+1;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            if(s.charAt(i-1)==t.charAt(j-1)){
                sb.append(s.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        for(int k=sb.length()-1;k>=0;k--){
            System.out.print(sb.charAt(k));
        }
        // String lcs = backtrackLCS(s, t, dp);
        // System.out.println("LCS String: " + lcs);
   }
   public static int countLCS(String s, String t,int ind1,int ind2, int[][] dp){
        if(ind1<0 || ind2<0){
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(s.charAt(ind1)==t.charAt(ind2)){
            return 1+countLCS(s, t, ind1-1, ind2-1,dp);
        }
        else{
            return dp[ind1][ind2]=Math.max(countLCS(s, t, ind1-1, ind2,dp), countLCS(s, t, ind1, ind2-1,dp));
        }
   }

   // Tabulation Code
   public static int countLCSTabu(String s, String t){
        int n = s.length();
        int m = t.length();
        int [][] dp = new int[n+1][m+1];
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
        return dp[n][m];
   }
//    public static String backtrackLCS(String s, String t, int[][] dp) {
//     int i = s.length();
//     int j = t.length();
//     StringBuilder sb = new StringBuilder();

//     // Backtracking logic
//     while (i > 0 && j > 0) {
//         if (s.charAt(i - 1) == t.charAt(j - 1)) { // Match found
//             sb.append(s.charAt(i - 1));
//             i--;
//             j--;
//         } else if (dp[i - 1][j] >= dp[i][j - 1]) { // Move up
//             i--;
//         } else { // Move left
//             j--;
//         }
//     }

//     return sb.reverse().toString(); // Reverse the LCS to get the correct order
// }

}
