import java.lang.reflect.Array;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        String[] input= {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> out = s.groupAnagrams(input);
        System.out.println(out);
    }
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> res = new ArrayList<>();
        if(strs == null || strs.length == 0){
            return res;
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String current = sort(s);
            if(!map.containsKey(current)){
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(current, list);
            } else {
                map.get(current).add(s);
            }
        }
        for(Map.Entry e : map.entrySet()){
            List<String> cur = (List<String>) e.getValue();
            res.add(cur);
        }
        return res;
    }

    private String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
