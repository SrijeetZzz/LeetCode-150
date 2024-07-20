public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 4, 2, 3, 4, 4, 4, 3, 3, 3, 3};
        int answer = removeElement(nums,2);
        System.out.println("----Output-----");
        
        for (int i = 0; i < answer; i++) {
            System.out.print(nums[i] +",");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int newsize = 0;
        int c = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[newsize]=nums[i];                  
                newsize++;
            }
            else{
                c++;
            }
        }
        System.out.println(nums.length-c);
        return newsize;

    }
}
