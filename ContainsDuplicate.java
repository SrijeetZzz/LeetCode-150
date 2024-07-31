import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            else{
                if(i-hm.get(nums[i])<=k){
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums, 2));
    }
}
