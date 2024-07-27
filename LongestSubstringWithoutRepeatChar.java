import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatChar {
    public static int lengthOfLongestSubstring(String s) {
        int l =0;
        int longest = 0;
        Set<Character> st = new HashSet<>();
        int n = s.length();
        if(s.isEmpty()){
            return 0;
        }
        for (int r = 0; r < n; r++) {  
            while (st.contains(s.charAt(r))) {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            longest = Math.max(longest, r - l + 1);
        }

        return longest;


    }
    public static void main(String[] args) {
        String s  = "abcabcbcb";
        int answer = lengthOfLongestSubstring(s);
        System.out.println(answer);

    }
}
