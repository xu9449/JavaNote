
import  java.util.* ;

class Fullname
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      String  first_name ;
      String  last_name ;
      
      System.out.print( "\n Please, type in your first name: " ) ;
      first_name  =  keyboard.nextLine() ;
      System.out.print( "\n Please, type in your last name:  " ) ;
      last_name   =  keyboard.nextLine() ;
      String full_name = first_name + " " + last_name ;
      
      System.out.print( "\n Your full name is "
                     +  first_name  +  " "  +  last_name  +  ".\n" ) ;
   
      System.out.print( "\n Your first name has " + first_name.length() + " characters." 
      + "\n Your last name has " + last_name.length() + " characters.") ;
     
      
      
      System.out.print( "\n Your name in reverse order: "); 
      
      int character_index  =  full_name.length() ;

      while (  character_index  >  0  )
      {
         character_index  --  ;
         System.out.print( full_name.charAt( character_index ) ) ;
         
      } 
     int integer_index;
      System.out.print("\n  prints your full name also as hexadecimal character codes");
      for  ( integer_index = 0; integer_index < full_name.length();integer_index ++ )
      {
    	  System.out.printf( " %X", (int) full_name.charAt( integer_index ) ) ;
     
    	  
      }
      StringBuffer full_name_buffer = new StringBuffer( full_name ) ;
      
      while( full_name_buffer.length() > 0) {
      int random_character_index =  (int) ( Math.random() * full_name_buffer.length() ) ;
      char removed_character = full_name_buffer.charAt( random_character_index ) ;
      full_name_buffer.deleteCharAt( random_character_index ) ;
      System.out.print( "\n " + removed_character + " was removed from "
      + full_name_buffer ) ;
      }
      
   }
   
   
   
   }

