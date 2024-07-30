import java.util.HashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for( int i=0;i<nums.length;i++){
            int y = target-nums[i];
            if(hm.containsKey(y) && hm.get(y)!=i){
                return new int[] { hm.get(y), i };
            }
        }
        return new int[] {};

    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] answer = twoSum(nums, 9);
        for(int i : answer){
            System.out.println(answer[i]);
        }
    }
}
