public class Jump1 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,1,1,0,2,5};
        if(canJump(nums)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    public static boolean canJump(int[] nums) {
        int maxReached=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReached){
                return false;
            }
            else{
                maxReached= Math.max((maxReached), i+nums[i]);
                if(maxReached>nums.length){
                    break;
                }
            }
        }
        return true;
    }
}
