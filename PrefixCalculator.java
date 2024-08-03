import java.util.HashSet;
import java.util.Stack;

public class PrefixCalculator {

    public static int evalRPN(String[] tokens) {
        HashSet<String> hs = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        hs.add("+");
        hs.add("-");
        hs.add("/");
        hs.add("*");
        int i=0;
        while(i<tokens.length){
            if(!hs.contains(tokens[i])){
                st.push(Integer.parseInt(tokens[i]));
            }
            else{
                int a = st.pop();
                int b = st.pop();
                int val = 0;
                switch (tokens[i]) {
                    case "+":
                        val = b + a;
                        break;
                    case "-":
                        val = b - a;
                        break;
                    case "*":
                        val = b * a;
                        break;
                    case "/":
                        val = b / a;
                        break;
                }
                st.push(val);
            }
            i++;
        }
        return st.peek();

    }
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }
}
