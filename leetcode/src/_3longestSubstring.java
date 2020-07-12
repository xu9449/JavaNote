import java.util.HashMap;
import java.util.Map;

public class _3longestSubstring {
    public static void main(String[] args) {
        _3longestSubstring s = new _3longestSubstring();
        int res = s.lengthOfLongestSubstring(" ");
        System.out.println(res);
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] arr= s.toCharArray();
        int res = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
                count++;
            } else {
                int index = map.get(arr[i]);
                i = index;
                map.clear();
                res = res >= count? res:count;
                count = 0;
            }
        }
        return res = res >= count? res:count;
    }
}
