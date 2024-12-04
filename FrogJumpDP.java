import java.util.HashMap;

public class FrogJumpDP {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};

        //*Memo Call *//

        HashMap<Integer,Integer> memo = new HashMap<>();
        int res=frogjump(arr.length-1, memo, arr);
        System.out.println(res);

        //*Tabulation Call *//

        int result=frogjumpTabulation(arr.length,arr);
        System.out.println(result);

        
    }
    public static int frogjump(int ind, HashMap<Integer,Integer> memo, int[] arr){

        //*Memoization Code*//

        if(ind==0){
            return 0;
        }
        if(memo.containsKey(ind)){
            return memo.get(ind);
        }
        int left=frogjump(ind-1, memo, arr)+Math.abs(arr[ind]-arr[ind-1]);
        int right=Integer.MAX_VALUE;
        if(ind>1){
            right=frogjump(ind-2, memo, arr)+Math.abs(arr[ind]-arr[ind-2]);;
        }
        int result = Math.min(left,right);
        memo.put(ind, result);
        return result;
    }
    public static int frogjumpTabulation(int ind,int[] arr) {
           
        //*Tabulation code *//

        int[] dp = new int[arr.length];
        dp[0]=0;
        int right=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            if(i>1){
                right=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(left, right);
        }
        return dp[arr.length-1];
        
    }

}
