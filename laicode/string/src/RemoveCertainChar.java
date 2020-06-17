import java.util.*;
import java.util.stream.Collectors;

public class RemoveCertainChar {
    public static void main(String[] args) {
        RemoveCertainChar s = new RemoveCertainChar();
        String res = s.remove("abccddefffghhhh", "fc");
        System.out.println(res);

    }

    public String remove(String input, String t) {
        // Write your solution here
        List<Character> res = new ArrayList<>();
        if(input.length() == 0) {
            return input;
        }
        if(t.length() == 0){
            return input;
        }

        char[] in = input.toCharArray();
        char[] target = t.toCharArray();
        //should we create a new array or we just delete the target char at index

        Set<Character> hashSet = new HashSet<>();
        for(char b : target){
            hashSet.add(b);
        }
        for(char a : in){
            if(!hashSet.contains(a)){
                res.add(a);
            }
        }

         String x = res.stream()
                       .map(String::valueOf)
                       .collect(Collectors.joining());
        return x;
    }
}
