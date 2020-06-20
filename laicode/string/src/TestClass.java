public class TestClass {
    public static void main(String[] args) {
        TestClass s = new TestClass();
        String a = "ljlxurwjybgaymfkulvdqhycdhyypzlmxdlwovrgfmopoxqnqkktslo";
        String res = s.compress(a);
        System.out.println(res);
    }
    public String rightShift(String input, int n) {
        // Write your solution here
        if(n == 0) return input;
        char[] res = input.toCharArray();
        char[] arr = input.toCharArray();
        for(int i = 0; i < arr.length; i++){
            int j = i;
            j = (j+n)%arr.length;
            res[j] = arr[i];
        }
        return new String(res);
    }

    public String compress(String input) {
        // Write your solution here
        if(input.length() == 0) return input;
        char[] arr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            num = 1;
            while(i+1 < arr.length && arr[i+1]==arr[i]){
                num++;
                i++;
            }
            sb.append(num);
            // two cases: 1)the end of string 2) end of sub string
        }
        return sb.toString();
    }

}
