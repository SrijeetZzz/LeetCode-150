import java.util.*;

public class Repeat {
    public static void main(String[] args) {
        int[] arr = {5,4,1,4,3,5,1,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i : hm){
            
        }
    }
}
