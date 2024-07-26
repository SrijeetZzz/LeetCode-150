public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int answer = maxArea(height);
        System.out.println(answer);
    }
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max_h=0;
        int h=0;
        while(l<r){
            h=Math.min(height[l],height[r]);
            int width = r-l;
            int cur_h= width*h;
            max_h=Math.max(max_h, cur_h);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max_h;
    }
}
