import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwapSwap {

    public static void main(String[] args) {
        SwapSwap s = new SwapSwap();
        String input = "AAB";
        List<String> result = s.permutation(input);
        System.out.println(result);
    }
    public List<String> permutation(String input) {
        char[] array = input.toCharArray();
        List<String> result = new ArrayList<>();
        swapSwap(array, 0, result);
        return result;
    }

    public void swapSwap(char[] array, int index, List<String> result){
        if(index == array.length){
            result.add(new String(array));
            return;
        }
        Set<Character> set = new HashSet<>();
        for(int i = index; i < array.length; i++){
            if(!set.contains(array[i])){
                swap(array, index, i);
                set.add(array[i]);
                swapSwap(array, index+1, result);
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
