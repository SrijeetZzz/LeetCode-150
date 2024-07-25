public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]";
        s = s.replaceAll(regex, "").toLowerCase();
        int r = s.length()-1;
        int l = 0;
        while(r>=l){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}
