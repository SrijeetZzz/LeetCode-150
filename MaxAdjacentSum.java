import java.util.HashMap;

public class MaxAdjacentSum {
    public static void main(String[] args) {
        int[] arr={1,2,4,9,10};
        HashMap<Integer,Integer> dp = new HashMap<>();
        int result=maxsum(arr.length-1, arr,dp);
        System.out.println(result);
    }
    public static int maxsum(int ind, int[] arr,HashMap<Integer,Integer> dp) {
        
        if(ind==0){
            return arr[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp.containsKey(ind)){
            return dp.get(ind);
        }
        int pick=arr[ind]+maxsum(ind-2, arr,dp);
        int notpick=maxsum(ind-1, arr,dp);
        int result = Math.max(pick, notpick);
        dp.put(ind, result);
        return result;
    }
}
