
// wxyz
// w, w


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationOfString {

    public static void main(String[] args) {
        PermutationOfString s = new PermutationOfString();
        String input = "wxyz";
        List<String> result = s.permutation(input);
        System.out.println(result);
    }
    public List<String> permutation(String input) {
        List<String> result = new ArrayList<>();
        if(input == null || input.length() <= 1){
            result.add(input);
            return result;
        }
        char[] arr = input.toCharArray();
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        helper(arr, set, 0, sb, result);
        return result;
    }

    public void helper(char[] array, Set<String> set, int index, StringBuilder sb, List<String> result){
        if(index == array.length){
            sb = new StringBuilder();
            return;
        }
        for(int i = index; i < array.length; i++){
            sb.append(array[i]);
            if(!set.contains(sb.toString())){
                result.add(sb.toString());
                swap(array, index, i);
                set.add(sb.toString());
                helper(array, set, index+1, sb, result);
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
                swap(array, i, index);
            }
        }

    }
    public void swap(char[] array, int l, int r){
        char tmp = array[l];
        array[l] = array[r];
        array[r] = tmp;
    }


}
