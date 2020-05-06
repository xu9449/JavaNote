import com.sun.source.util.SourcePositions;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
//        int rows = 8;
//
//        for(int i = 1; i <= rows; i++){
//            for(int j = 1; j < i; j++){
//                System.out.print(" ");
//            }
//            for(int k = i; k <= rows; k++){
//                System.out.print(k);
//            }
//                System.out.println();
//
//        }
//        for(int i = rows -1 ; i >=1; i--){
//            for(int j = 1; j < i; j++){
//                System.out.print(" ");
//            }
//            for(int k = i; k <= rows; k++){
//                System.out.print(k);
//            }
//
//            System.out.println();
//        }
        int row = 7;
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();
        for(int i = 1; i <= row; i++) {
            stack1.push(i);
        }





    }

}
