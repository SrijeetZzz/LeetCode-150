import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] chr = pattern.toCharArray();
        HashMap<Character, String> hm = new HashMap<>();
        
        if (chr.length != str.length) {
            return false;
        } else {
            for (int i = 0; i < chr.length; i++) {
                if (hm.containsKey(chr[i])) {
                    if (!hm.get(chr[i]).equals(str[i])) {
                        return false;
                    }
                } else {
                    if (hm.containsValue(str[i])) {
                        return false;
                    } else {
                        hm.put(chr[i], str[i]);
                    }
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "cat dog dog cat";
        System.out.println(wordPattern(pattern, s));

    }
}
