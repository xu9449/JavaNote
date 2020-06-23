public class ReverseBits {
    public static void main(String[] args) {

    }
    public long reverseBits(long n) {
        // Write your solution here
        long res = 0;
        for(int i = 0; i < 16; i++){
            long curBit = (n >>> i) & 1;
            if(curBit == 1){
                res ^= 1 << (32 - i);
            }
        }
        return res;
        //vec[c/32] |= 1 << (c % 32);
    }
}
