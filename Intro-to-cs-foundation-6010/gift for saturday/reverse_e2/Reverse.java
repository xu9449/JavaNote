import java.util.* ;

class Reverse
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;
//build an array with 101 
      int[] given_integers      =  new  int[ 10 ] ;
    
      int   integer_index          = 0 ;
      int   integer_from_keyboard  =  0 ;
      boolean integer_previously_given = false;
      System.out.print("\n This program reads integers from the keyboard."
                 +  "\n After receiving a zero, it prints the numbers"
                 +  "\n Please, start entering numbers."
                 +  "\n The program will stop when you enter a zero.\n"
                 + "\n Please enter integer in 1-39.") ;
      // do is like an initial interface do-while
      do
      {
    	  if(integer_index < 7) 
    	  {
    	System.out.print( " "  +  integer_index  +  "  Enter an integer: ") ;
         integer_from_keyboard  =  keyboard.nextInt() ;
         
         if(integer_from_keyboard < 40) {
         
        	 given_integers[ integer_index ]  =  integer_from_keyboard ;
             integer_index  ++ ;}
             else { 
            	 System.out.print("\n error.");
             }
    	  }        
         else {
       	  System.out.print("\n The array is full.");
       	 break;   
         }
         
         for ( int index_for_previous_numbers = 0 ;
         		 index_for_previous_numbers < integer_index ;
         		 index_for_previous_numbers ++ )
         		 {
         		 if ( given_integers[ index_for_previous_numbers ] ==
         		 integer_from_keyboard )
         		 {
         			 integer_previously_given = true ;
         		 System.out.print( "\n That integer has already been given.\n" ) ;
         		 break;// Here you have to modify the boolean variable.
         		 }
        		 } 
    	  }
         
      
     

      // print the reverse order.
      // why is !=0 not = 0
       while  ( integer_from_keyboard  !=  0 ) ;

      
      for  ( integer_index = 0; integer_index < 10;integer_index ++ )
      {
         System.out.print( given_integers[ integer_index ]  +  "   " ) ;
     
      } 
     /* while (integer_index > 6);
      {
    	  System.out.print("\n Thank you!");
    	  break;
      }*/      
    
   }
   }

