public class RotateArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k==0){
            System.out.println(nums);
        }
        else{
            int[] temp = new int[k];
            int j=0;
            for(int i = k+1; i < nums.length; i++){
                temp[j]=nums[i];
                j++;
            }
            for (int i = nums.length - 1; i >= k; i--) {
                          nums[i] = nums[i - k];
                        }
            for(int i=0;i<k;i++){
                nums[i]=temp[i];
            }
            for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]);
            }
        }

    }
}
// public class RotateArray {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5, 6, 7};
//         rotate(nums, 3);
//     }

//     public static void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         if (k == 0) {
//             printArray(nums);
//         } else {
//             int[] temp = new int[k];
//             for (int i = 0; i < k; i++) {
//                 temp[i] = nums[nums.length - k + i];
//             }
//             for (int i = nums.length - 1; i >= k; i--) {
//                 nums[i] = nums[i - k];
//             }
//             for (int i = 0; i < k; i++) {
//                 nums[i] = temp[i];
//             }
//             printArray(nums);
//         }
//     }

//     public static void printArray(int[] nums) {
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }
