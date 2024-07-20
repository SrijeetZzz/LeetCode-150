import java.util.Arrays;

public class H {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        int answer = hIndex(citations);
        System.out.println(answer);
    }
    public static int hIndex(int[] citations) {
        Arrays.sort((citations));
        if(citations.length%2 == 0){
            return citations[citations.length/2 - 1];
        }
        else return citations[citations.length/2];
    }
    
}
