import java.util.ArrayList;

public class PalindromePartition {
    public static void main(String[] args) {
        String s ="aabb";
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        palfunc(0, res, ans, s);
        System.out.println(ans);
    }
    public static void palfunc(int ind, ArrayList<String> res, ArrayList<ArrayList<String>> ans, String s ){
        if(ind==s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=ind; i<s.length(); i++){
            if(isPalindrome(s, ind, i)){
                res.add(s.substring(ind, i+1));
                palfunc(i+1, res, ans, s);
                res.remove(res.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
