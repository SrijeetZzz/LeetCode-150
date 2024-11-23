import java.util.ArrayList;

public class SubSetSum {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        ArrayList<Integer> ans = new ArrayList<>();
        //ArrayList<Integer> ds = new ArrayList<>();//
        subsetSum(0, 0, arr, ans);
        System.out.println(ans);
    }
    public static void subsetSum(int ind, int sum, int[] arr, ArrayList<Integer> ans){
        if(ind==arr.length){
            ans.add(sum);
            return;
        }
        //ds.add(arr[ind]);//
        sum=sum+arr[ind];
        subsetSum(ind+1, sum, arr, ans);
        //ds.remove(ds.size()-1);//
        sum=sum-arr[ind];
        subsetSum(ind+1, sum, arr, ans);
    }
}
