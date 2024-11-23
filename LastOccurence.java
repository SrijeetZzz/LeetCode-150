public class LastOccurence {
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        if(words.length>0){
            int st = words[words.length-1].length();
            return st;
        }
        else return 0;
        
        
        
    }public static void main(String[] args) {
        int ans = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(ans);
    }
}
