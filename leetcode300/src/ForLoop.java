import com.sun.source.util.SourcePositions;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        ForLoop sol = new ForLoop();
        int a = 6;
        int res = sol.fibonacci(a);
        System.out.println(res);

    }
    public int fibonacci(int k) {
        // Write your solution here
        if(k <= 0){
            return 0;
        }
        int[] result = new int[k + 1];
        result[1] = 1;
        if(result[k] != 0) {
            return result[k];
        }else{
            result[k] = fibonacci(k - 1) + fibonacci(k -2);
            return result[k];
        }
    }

}








