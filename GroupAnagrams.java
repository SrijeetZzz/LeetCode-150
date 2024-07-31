import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> hm = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
            if(!hm.containsKey(sortedStr)){
                hm.put(sortedStr, new ArrayList<>());
            }
            hm.get(sortedStr).add(str);
        }
        return new ArrayList<>(hm.values());
    }
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ant","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}


