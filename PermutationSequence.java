import java.util.ArrayList;

public class PermutationSequence {
    public static void main(String[] args) {
        int n=3;
        int k=3;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        permute(arr, 0, ans);
        System.out.println(ans.get(k-1));


    }
    public static void permute(int[] arr, int ind, ArrayList<ArrayList<Integer>> ans ){
        if(ind==arr.length){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(ind, i, arr);
            permute(arr, ind+1, ans);
            swap(ind, i, arr);
        }
    }
    public static void swap(int ind, int i, int[] arr){
        int t = arr[i];
        arr[i]= arr[ind];
        arr[ind]= t;
    }


}