import java.util.*;
//Using an Extra HashMap
public class SubSetSum2 {
    public static void main(String[] args) {
        int[] arr = {2,1,2,3,2,3};
        Arrays.sort(arr);
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<ArrayList<Integer>> hm = new HashSet<>();
        subsetII(0, arr, ds, ans);
        for(ArrayList<Integer> list : ans){
            hm.add(list);
        }
        System.out.println(hm);
    }
    public static void subsetII(int ind, int[] arr, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans){
        if(ind==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        subsetII(ind+1, arr, ds, ans);;
        ds.remove(ds.size()-1);
        subsetII(ind+1, arr, ds, ans);
    }

}
