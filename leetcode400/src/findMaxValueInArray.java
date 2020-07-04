import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class findMaxValueInArray {
    public static void main(String args [])

    {
        findMaxValueInArray s = new findMaxValueInArray();
        String result= intToStr(23);
        System.out.println("Output is : "+ result);
    }

    public static final int MAX_DIGITS = 10;
    public static String intToStr( int num ){
        int i = 0;
        boolean isNegative = false;
        /* Buffer big enough for largest int and - sign */
        char[] temp = new char[ MAX_DIGITS + 1 ];
        /* Check to see if the number is negative */
        if( num < 0 ){
            num = -num;
            isNegative = true;
        }
        /* Fill buffer with digit characters in reverse order */
        do {
            temp[i++] = (char)((num % 10) + '0');
            num /= 10;
        } while( num != 0 );
        StringBuilder b = new StringBuilder();
        if( isNegative )
            b.append( '-' );
        while( i > 0 ){
            b.append( temp[--i] );
        }
        return b.toString();
    }

}
