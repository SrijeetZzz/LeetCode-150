import java.util.ArrayList;
import java.util.Arrays;

public class SubSetSum_WHM {
    public static void main(String[] args) {
       int[] arr={1,1,1};
       Arrays.sort(arr); 
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       ArrayList<Integer> ds = new ArrayList<>();
       findCombination(0, arr, ans, ds); 
       System.out.println(ans);
    }
    public static void findCombination(int ind, int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i = ind; i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            findCombination(i+1, arr, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}