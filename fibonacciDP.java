import java.util.HashMap;

public class fibonacciDP {
    public static int fibonacci(int n, HashMap<Integer,Integer> memo) {
        if (n <= 1) {
            return n;
        }
        // Check if the result is already in the memo
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // Compute and store the result in the memo
        int result = fibonacci(n - 1,memo) + fibonacci(n - 2,memo);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        int n = 10; // Example input
        HashMap<Integer, Integer> memo = new HashMap<>();
        System.out.println(fibonacci(n, memo) );// Output: 55
    }

}
