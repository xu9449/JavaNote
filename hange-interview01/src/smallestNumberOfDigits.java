public class smallestNumberOfDigits {

    public static void main(String[] args) {
        smallestNumberOfDigits s = new smallestNumberOfDigits();
        Integer N = 1;
        Integer result =s.smallestNumber2(N);
        System.out.println(result.toString());
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
