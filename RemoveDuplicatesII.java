public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {0,0,0,2,2,2,2,3,3,3};
        int size = removeDuplicates(nums);
        for (int k = 0; k < size; k++) {
            System.out.println(nums[k]);
        }
    }
    
    public static int removeDuplicates(int[] nums) {
       int count=1;
       int index=1;
       for(int j=1;j<nums.length;j++){
        if(nums[j]==nums[j-1]){
            count++;
        }
        else{
            count =1; 
        }
        if(count<=2){
            nums[index]=nums[j];
            index++;
        }
          }return index;
}
}