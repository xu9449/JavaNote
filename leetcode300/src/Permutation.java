import java.sql.SQLOutput;
import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        Permutation p = new Permutation();
        String s = "abca";
        char[] input = s.toCharArray();
        p.permutation(input, 0);

    }
    void permutation(char[] input, int index){
        if(index == input.length) {
            System.out.println(input);
            return;
        }

        for(int i = index; i < input.length; i++){
            swap(input, index, i);
            permutation(input, index + 1);
            swap(input, index, i);
        }
    }

    void swap(char[] array, int l, int r){
        char help = array[l];
        array[l] = array[r];
        array[r] = help;
    }

//    public static void main (String args[])
//    {
//        System.out.println("Please enter the string whose permutations we need to show ");
//        Scanner in = new Scanner(System.in);
//        String original=in.nextLine();
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Results are :");
//        System.out.println("");
//        System.out.println("");
//        permute(original);
//    }
//
//    public static   void permute( String input)
//    {
//        int inputLength = input.length();
//        boolean[ ] used = new boolean[ inputLength ];
//        StringBuffer outputString = new StringBuffer();
//        char[ ] in = input.toCharArray( );
//        doPermute ( in, outputString, used, inputLength, 0 );
//
//    }
//
//    public static    void doPermute ( char[ ] in, StringBuffer outputString,
//                                      boolean[ ] used, int inputLength, int level)
//    {
//        if( level == inputLength) {
//            System.out.println ( outputString.toString());
//            return;
//        }
//
//        for( int i = 0; i < inputLength; ++i )
//        {
//
//            if( used[i] ) continue;
//
//            outputString.append( in[i] );
//            used[i] = true;
//            doPermute( in,   outputString, used, inputLength, level + 1 );
//            used[i] = false;
//            outputString.setLength(   outputString.length() - 1 );
//        }
//    }
}
