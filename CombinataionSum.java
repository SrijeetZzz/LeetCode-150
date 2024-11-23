import java.util.ArrayList;
import java.util.List;

public class CombinataionSum {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int target = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        findCombination(0, target, ds, ans, arr, 0);
        System.out.println(ans);
    }
    public static void findCombination(int ind, int target, ArrayList<Integer> ds, ArrayList<List<Integer>> ans, int arr[], int sum){
        if(ind == arr.length){
            if(target == sum){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        sum = sum +arr[ind];
        ds.add(arr[ind]);
        findCombination(ind+1, target, ds, ans, arr, sum);
        sum = sum -arr[ind];
        ds.remove(ds.size()-1);
        findCombination(ind+1, target, ds, ans, arr, sum);
    }
}
