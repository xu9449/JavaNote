public class RecursiveMemo {

    public static void main(String[] args) {
        RecursiveMemo s = new RecursiveMemo();
        int a = 3;
        int[] arr = new int[a + 1];
        int fibo = s.FiboRe(a,arr);
        System.out.println(fibo);
    }
    public int FiboRe(int k, int[] arr){
        if(k <= 0) return 0;
        arr[1] = 1;
        if(arr[k] != 0){
            return arr[k];
        } else {
            arr[k] = FiboRe(k-1, arr) + FiboRe(k-2, arr);
        }
        return arr[k];
    }
}
