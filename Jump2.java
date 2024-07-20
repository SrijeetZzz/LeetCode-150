public class Jump2 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        int answer=jump(nums);
        System.out.println(answer);
    }
    public static int jump(int[] nums) {
        int answer = jumpFind(0,0,nums);
        return answer;
    }
    public static int jumpFind(int i,int j,int[] nums){
        int mini = 999;
        if(i>nums.length){
            return j;
        }
        else{
            for(i=1 ; j<=nums[i];i++){
                mini = Math.min(mini,jumpFind(i+1,j+1,nums));
            }
            return mini;
        }
       
    }
}
