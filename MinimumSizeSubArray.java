public class MinimumSizeSubArray {
    public static int minSubArrayLen(int target, int[] nums) {
        int m_ind = Integer.MAX_VALUE;
    int l = 0;
    int sum = 0;

    for (int r = 0; r < nums.length; r++) {
        sum += nums[r];

        while (sum >= target) {
            m_ind = Math.min(m_ind, r - l + 1);
            sum -= nums[l];
            l++;
        }
    }

    return m_ind == Integer.MAX_VALUE ? 0 : m_ind;

    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int answer= minSubArrayLen(7, nums);
        System.out.println(answer);

    }
}
