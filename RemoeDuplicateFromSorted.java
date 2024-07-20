

public class RemoeDuplicateFromSorted {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int size = removeDuplicates(nums);
        for(int i=0;i<size;i++){
            System.out.println(nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        // ArrayList<Integer> myArrayList = new ArrayList<>();
        // myArrayList.add(nums[0]);
        // int k=0;
        // for(int i=1;i<nums.length;i++){
        //     if(myArrayList.get(k)!=nums[i])
        //     {
        //         myArrayList.add(nums[i]);
        //         k++;
        //     }
        // }
        // for (int i = 0; i < myArrayList.size(); i++) {
        //     System.out.println(myArrayList.get(i));
        // }
        // return myArrayList.size();
        int index = 1;
        int i =0;
        for(int j =1 ;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[index]=nums[j];
                i=j;
                index++;
            }
        }
        return index;
    }
}
