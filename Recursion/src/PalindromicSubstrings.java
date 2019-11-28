import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {

    public static void main(String[] args) {
       PalindromicSubstrings solution = new PalindromicSubstrings();
       String s = "abc";
       List<String> result = solution.countSubstrings(s);
       System.out.println(result);
    }

    public List<String> countSubstrings(String s) {
        List<String> result = new ArrayList<String>();
        if (s == null) {
            return result;
        }
        char[] input = s.toCharArray();
        StringBuilder prefix = new StringBuilder();
        findSubset(input, 0, prefix, result);
        return result;
    }

    public void findSubset(char[] input, int index, StringBuilder prefix, List<String> result) {
        if (index == input.length) {
            result.add(prefix.toString());
            return;
        }

        // case 1: add input[index] to the solution prefix
        prefix.append(input[index]);
        findSubset(input, index + 1, prefix, result);
        prefix.deleteCharAt(prefix.length() - 1);

        //case 2: do not addd input[index] to the solution prefix
        findSubset(input, index + 1, prefix, result);

    }
}
