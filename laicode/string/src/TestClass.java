public class TestClass {
    public static void main(String[] args) {
        TestClass s = new TestClass();
        String a = "abcdefg";
        String res = s.rightShift(a, 3);
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

}
