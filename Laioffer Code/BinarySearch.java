import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        int[] test = {-2, 0, 4, 5, 6, 8};
        int target = -9;
        int[] A = {1, 0, 1, 0, 1};
        int[] B = {0, 1, 0, 0, 1};
        int result = solution.binarySearch(test,target);

        //System.out.println(Arrays.toString(result));
        System.out.println(result);

    }

    public int binarySearchR (int[] A, int p, int q, int key) {
        if (p <= q) {

            int m = p + (q + p) / 2;
            if (A[m] == key) return m;
            else if (A[m] < key) return binarySearchR(A, m + 1, q, key);
            else return binarySearchR(A, p, m-1, key);

        }
        return -1;
    }

    public int binarySearch (int[] A, int x) {
        int i = 0;
        int j = A.length;
        while ( i <= j) {
            int m = i + (j - i) /2;
            if (A[m] == x) {
                return m;
            } else if (A[m] >x)
                j = m - 1;
            else
                i = m + 1;
        }

        return -1;
    }
}
