public class NumberOfDifferentBits {
    public static void main(String[] args) {
        NumberOfDifferentBits s = new NumberOfDifferentBits();
        int res = s.diffBits(0, 15);
        System.out.println(res);
    }
    public int diffBits(int a, int b) {
        // Write your solution here
        int count = 0;
        for(int i = 0; i < 32; i++){
            count += (a >>> i & 1)^(b >>> i & 1);
        }
        return count;
    }
}
