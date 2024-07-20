public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {6,5,5};
        int result=majorityElement(nums);
        System.out.println(result);
    }
    public static int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

}
