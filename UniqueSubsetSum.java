import java.util.ArrayList;
import java.util.Arrays;

public class UniqueSubsetSum {
    public static void main(String[] args) {
       int[] arr={1,2,1,2,1};
       Arrays.sort(arr); 
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       ArrayList<Integer> ds = new ArrayList<>();
       findCombination(0, arr, 4, ans, ds); 
       System.out.println(ans);
    }
    public static void findCombination(int ind, int[] arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            findCombination(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}
