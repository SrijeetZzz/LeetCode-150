public class LongestCommonSubstring {
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
        System.out.println(countLCSTabu(s,t));
    }
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
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans, dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }

}
