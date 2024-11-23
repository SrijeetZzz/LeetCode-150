import java.util.ArrayList;

public class Permutation_WithSpace {
    public static void main(String[] args) {
    int[] arr ={1,2,3};
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> ds = new ArrayList<>();
    boolean[] freq = new boolean[arr.length];
    permute(arr, ans, ds, freq);
    System.out.println(ans);
    }
    public static void permute(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds, boolean[] freq){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                ds.add(arr[i]);
                freq[i]=true;
                permute(arr, ans, ds, freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}
