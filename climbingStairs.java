import java.util.HashMap;

public class climbingStairs {
    public static void main(String[] args) {
        HashMap<Integer,Integer> dp = new HashMap<>();
        int res = climb(4,dp);
        System.out.println(res);
    }
    public static int climb(int n,HashMap<Integer,Integer> dp){
        if(n<=1){
            return 1;
        }
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        int result=climb(n-1,dp)+climb(n-2,dp);
        dp.put(n, result);
        return result;
    }

}
