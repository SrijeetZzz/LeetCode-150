import java.util.HashMap;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr={1,2,4,9,10};
        int[] ftemp = new int[arr.length-1];
        int[] rtemp = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            ftemp[i]=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            rtemp[i-1]=arr[i];
        }
        int res1=maxsum(ftemp.length-1, ftemp);
        int res2=maxsum(rtemp.length-1, rtemp);
        int result=Math.max(res1, res2);
        System.out.println(result);
    }
    public static int maxsum(int ind, int[] arr) {
        HashMap<Integer,Integer> dp = new HashMap<>();
        if(ind==0){
            return arr[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp.containsKey(ind)){
            return dp.get(ind);
        }
        int pick=arr[ind]+maxsum(ind-2, arr);
        int notpick=maxsum(ind-1, arr);
        int result = Math.max(pick, notpick);
        dp.put(ind, result);
        return result;
    }
}
