import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
      }
        HashMap<Character, Character> hm = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        for (int i = 0; i < ss.length; i++) {
            char sChar = ss[i];
            char tChar = tt[i];

            if (hm.containsKey(sChar)) {
                if (hm.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (hm.containsValue(tChar)) {
                    return false;
                }
                hm.put(sChar, tChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bada";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }
}
