public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int [] answer = productExceptSelf(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(answer[i]);
        }
    }
    
    public static int[] productExceptSelf(int[] nums) {
        int l_mult =1;
        int r_mult =1;
        int n= nums.length;
        int [] l_array = new int[n];
        int [] r_array = new int[n];
        for(int i = 0; i<n ; i++){
            int j= n-(i+1);
            l_array[i] = l_mult;
            r_array[j] = r_mult;
            l_mult *= nums[i];
            r_mult *= nums[j]; 
        }
        for(int i=0;i<n;i++){
            nums[i]=l_array[i]*r_array[i];
        }
        return nums;
    }
}
