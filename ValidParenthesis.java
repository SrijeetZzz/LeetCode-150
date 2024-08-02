import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('{', '}');
        hm.put('[', ']');
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char current = s.charAt(i);
            if (hm.containsKey(current)) {
                st.add(current);
            } else {
                if (st.isEmpty() || current != hm.get(st.peek())) {
                    return false;
                }
                st.pop();
            }
            i++;
        }
        
        return st.isEmpty();
    } 
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }
}
