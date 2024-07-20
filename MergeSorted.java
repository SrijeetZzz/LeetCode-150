import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0)
        {
            for(int i=0;i<nums2.length;i++){
                System.out.println(nums2[i]);
            }
        }
        if(n==0){
            for(int i=0;i<nums1.length;i++){
                System.out.println(nums1[i]);
            }
        }
        
        else{
            System.out.println(nums1);
            System.out.println(nums2);
            int i = m;
            for(int k=0;i<nums1.length;k++){
                nums1[i]=nums2[k];
                i++;
            }
            Arrays.sort(nums1);
            System.out.println(nums1);
        }
    }
}
