public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int j =0;
        int i =0;
        while(i<t.length() && j<s.length()){
            if(s.charAt(j)==t.charAt(i)){
                j=j+1;
                i=i+1;
            }
            else{
                i=i+1;
            }
        }
        return j == s.length();
    }
    public static void main(String[] args) {
        String s ="abc";
        String t ="adbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
