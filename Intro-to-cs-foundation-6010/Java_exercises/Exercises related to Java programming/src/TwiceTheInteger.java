import java.util.* ;
public class TwiceTheInteger {
	 public static void main( String[] not_in_use )
	   {
	      Scanner  keyboard  =  new  Scanner( System.in ) ;

	      int  integer_from_keyboard ;
	      int  twice_the_integer ;
	      int  integer2 ;
	      int  integer3 ;

	      System.out.print(
	          "\n This program is a computer game. Please, type in "
	        + "\n an integer in the range  1 ... 2147483646 : " ) ;

	      integer_from_keyboard  =  keyboard.nextInt() ;

	      twice_the_integer  =  integer_from_keyboard  /  2 ;
	      integer2 =  twice_the_integer / 2;
	      integer3 = integer2 / 2;

	      System.out.print( "\n You typed in " + integer_from_keyboard + "."
	                     +  "\n My number is " + twice_the_integer    + "," + integer2 +"," + integer3 +"."
	                     +  "\n Sorry, you lost. I won. The game is over.\n") ;
	   }
	}
