import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        //subsequence("", "abc");//
        System.out.println(subseqRet("", "abc"));
    }
    //Without Arraylist//
    public static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return; 
        }
        else{
            char ch = up.charAt(0);
            subsequence(p+ch, up.substring(1));
            subsequence(p, up.substring(1));
        }
    }
    //With Arraylist
    public static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p+ch, up.substring(1));
        ArrayList<String> right = subseqRet(p,up.substring(1));
        left.addAll(right);
        return left;


    }
}
