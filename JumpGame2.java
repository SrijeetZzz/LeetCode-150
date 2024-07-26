public class JumpGame2 {
    public static int jump(int[] nums) {
        int l =0;
        int r =0;
        int count =0;
        int n = nums.length-1;
        while(r<n){
            int farthest =0;
            for(int i=l;i<r+1;i++){
                farthest = Math.max(farthest,nums[i]+i);
            }
            count++;
            l=r+1;
            r=farthest;
        }
        return count;
        
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int answer = jump(nums);
        System.out.println(answer);
    }
}
