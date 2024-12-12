public class PartitionEqualsSubsetSum {
    public static void main(String[] args) {
        int[] nums ={1,5,11,5};
        int sum=0;
        int ind= nums.length-1;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0){
            System.out.println(false);
            return;
        }
        int target = sum/2;
        System.out.println(PartitonSubsetSum(nums,target,ind));
        
    }
    public static boolean PartitonSubsetSum(int[] nums, int target,int ind){
        if(target==0){
            return true;
        }
        if(ind==0){
            return nums[ind]==target;
        }
        boolean notPick = PartitonSubsetSum(nums,target,ind-1);
        boolean pick = false;
        if(target>nums[ind]){
            pick=PartitonSubsetSum(nums,target-nums[ind],ind-1);
        }
        return pick || notPick;
    }
}
