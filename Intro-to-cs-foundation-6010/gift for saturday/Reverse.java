import java.util.* ;

class Reverse
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;
//build an array with 101 
      int[] array_of_integers      =  new  int[ 6 ] ;
      int   integer_index          = 0 ;
      int   integer_from_keyboard  =  0 ;

      System.out.print("\n This program reads integers from the keyboard."
                 +  "\n After receiving a zero, it prints the numbers"
                 +  "\n Please, start entering numbers."
                 +  "\n The program will stop when you enter a zero.\n"
                 + "\n Please enter integer in 1-39.") ;
      // do is like an initial interface do-while
      do
      {if(integer_index < 7) {
         System.out.print( " "  +  integer_index  +  "  Enter an integer: ") ;
         integer_from_keyboard  =  keyboard.nextInt() ;
         if(integer_from_keyboard < 40) {
         array_of_integers[ integer_index ]  =  integer_from_keyboard ;
         integer_index  ++ ;
         }
         else { System.out.print("\n error.");
         }
      }
      else {
    	  System.out.print("\n The array is full.");
    	  
      }
      }
      // print the reverse order.
      // why is !=0 not = 0
       while  ( integer_from_keyboard  !=  0 ) ;

      for  ( integer_index = 0; integer_index < 7;integer_index ++ )
      {
         System.out.print( array_of_integers[ integer_index ]  +  "   " ) ;
     
      } 
     /* while (integer_index > 6);
      {
    	  System.out.print("\n Thank you!");
    	  break;
      }*/      
    
   }
   }

