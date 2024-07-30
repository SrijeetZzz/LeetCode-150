import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<String> seen = new HashSet<>();
        String cur = Integer.toString(n);
        while (!seen.contains(cur)) {
            seen.add(cur);
            int sum = 0;
            for (char digit : cur.toCharArray()) {
                int d = Character.getNumericValue(digit);
                sum += d * d;
            }
            
            if (sum == 1) {
                return true;
            }

            cur = Integer.toString(sum);
        }
        
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
