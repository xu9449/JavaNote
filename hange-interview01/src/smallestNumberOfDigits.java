import java.util.ArrayList;
import java.util.List;

public class smallestNumberOfDigits {

    public static void main(String[] args) {
        smallestNumberOfDigits s = new smallestNumberOfDigits();
        Integer N = 1;
        Integer result =s.smallestNumber2(N);
        System.out.println(result.toString());


        List<Integer> x = new ArrayList<>();
        List<? super Integer> result2 = process(x);
    }

    public static <E extends Number> List<? super E> process(List<E> nums){
        List<E> result = new ArrayList<>();
        return result;
    }









    public Integer smallestNumber2(Integer input) {
        Integer digits = 0;
        Integer result = 1;
        while(input/10 != 0){
            digits++;
            input = input/10;
        }

        if(digits == 0) return digits;

        for(int i = 0; i < digits; i++){
            result = result * 10;
        }
        return result;
    }
}
