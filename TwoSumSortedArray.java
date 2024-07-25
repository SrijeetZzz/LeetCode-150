

public class TwoSumSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int [] nums = new int[2];
        while(r>l){
            int sum = numbers[l]+numbers[r];
            if(sum==target){
                nums[0]=l+1;
                nums[1]=r+1;
                break;
            }
            else if(sum>target){
                r=r-1;
            }
            else{
                l=l+1;
            }
        }
        return nums;
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int answer[] = twoSum(numbers, 9);
        for(int i = 0; i<2;i++){
            System.out.println(answer[i]);
        }
    }
}
