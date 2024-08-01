import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {

        List<String> ar = new ArrayList<>();
        if (nums.length == 0) {
            return ar;
        }
        int l = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (l == nums[i - 1]) {
                    ar.add(String.valueOf(l));
                } else {
                    ar.add(l + "->" + nums[i - 1]);
                }
                l = nums[i];
            }
        }
        if (l == nums[nums.length - 1]) {
            ar.add(String.valueOf(l));
        } else {
            ar.add(l + "->" + nums[nums.length - 1]);
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        List<String> lst = summaryRanges(nums);
        System.out.println(lst);

    }
}
