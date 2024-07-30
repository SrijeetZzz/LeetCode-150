import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet <Integer> hm = new HashSet<>();
        int longest=0;
        int length=0;
        for(int i : nums){
            hm.add(nums[i]);
        }
        for(int i : nums)
            if(!hm.contains(nums[i]-1)){
                int j=i+1;
                length=1;
                while(hm.contains(nums[j])){
                    length+=1;
                }
                longest=Math.max(length,longest);
            }
            return longest;
        }
    
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int answer = longestConsecutive(nums);
        System.out.println(answer);
    }
}
