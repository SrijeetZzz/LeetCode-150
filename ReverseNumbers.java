public class ReverseNumbers {
    public static void main(String[] args){
        int n = 123456;
        char[] c = Integer.toString(n).toCharArray();
        for(int i = c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
    
}
