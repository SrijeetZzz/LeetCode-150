public class ReverseWordInAString {
    public static String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String [] strArr = s.split(" ");
        System.out.println(strArr);
        int l = 0;
        int r =strArr.length-1;
        while(l<=r){
            String temp = strArr[l];
            strArr[l] = strArr[r];
            strArr[r] = temp;
            r--;
            l++;
        }
        return String.join(" ", strArr);
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        String strr = reverseWords(str);
        System.out.println(strr);
    }
}
