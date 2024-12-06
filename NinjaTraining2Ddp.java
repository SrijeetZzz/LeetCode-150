public class NinjaTraining2Ddp {
    public static void main(String[] args) {
        int[][] points = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int[][] dp = new int[3][4];
        int res=ninjat(2, 3, points,dp);
        System.out.println(res);
    }
    public static int ninjat(int day, int last, int[][] points, int[][] dp){
        if(day==0){
            int maxi=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    maxi=Math.max(maxi, points[0][task]);
                }
            }
            return maxi;
        }
        if(dp[day][last]!=0){
            return dp[day][last];
        }
        int maxi=0;
        for(int task=0;task<3;task++){
            if(task!=last){
                int point = points[day][task]+ninjat(day-1, task, points,dp);
                maxi=Math.max(point,maxi);
            }
        }
        return dp[day][last]=maxi;
    }
}
