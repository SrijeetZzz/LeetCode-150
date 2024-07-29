import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    HashMap<Character, Integer> hm = new HashMap<>();

    for (char c : s.toCharArray()) {
        hm.put(c, hm.getOrDefault(c, 0) + 1);
    }
    for (char c : t.toCharArray()) {
        if (hm.containsKey(c)) {
            hm.put(c, hm.get(c) - 1);
            if (hm.get(c) == 0) {
                hm.remove(c);
            }
        } else {
            return false;
        }
    }
    return hm.isEmpty();
} 


    public static void main(String[] args) {
        String s ="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s, t));
    }
}
