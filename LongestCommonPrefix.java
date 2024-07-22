public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            str=common(str,strs[i]);
        }
        return str;
    }
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String strs = longestCommonPrefix(input);
        System.out.println(strs);
    }
    public static String common(String s1, String s2){
        int n =Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append((s1.charAt(i)));
            }
            else{
                break;
            }
        
        }
        
    return sb.toString();
    }
}
