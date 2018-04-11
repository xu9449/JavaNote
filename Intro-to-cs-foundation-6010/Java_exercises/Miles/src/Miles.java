import  java.util.* ;

class Miles
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;
      
      char character_from_keyboard;
      float  distance_in_miles ;
      float  distance_in_kilometers ;
      float  weight_in_pounds ;
      float  weight_in_kilograms;
      boolean user_wants_to_quit = false ;
      System.out.print("\n This program prints conversion tables." + "\n Type a letter to select a conversion table" 
      + "\n  m miles to kilometers" + "\n  k kilometers to miles"
    		  + "\n  p pounds to kilograms"
    		  + "\n  x exit the program");

      character_from_keyboard = keyboard.nextLine().charAt(0);
      
     
     
    	  switch( character_from_keyboard )
      {
      case 'm':
      case 'M':
      System.out.print( "\n This program converts miles to kilometers." 
                     +  "\n Please, give a distance in miles:  "  ) ;

      distance_in_miles  =  keyboard.nextFloat() ;
    	  distance_in_kilometers  =  1.6093F * distance_in_miles ;

    	  System.out.print( "\n The distance you typed is"  +  distance_in_miles  
    			  +  " \n We transfer it into kilometers is" +  distance_in_kilometers   ) ;
    	  break;
      case 'k':
      case 'K':
    	  System.out.print( "\n This program converts kilometers to miles." 
                  +  "\n Please, give a distance in kilometers:  "  ) ;
    	 
    	  distance_in_kilometers  =  keyboard.nextFloat() ;
    	  distance_in_miles = distance_in_kilometers/1.6093F;
    	  
    	  System.out.print( "\n The distance you typed is"  +  distance_in_kilometers   
    			  +  " \n We transfer it into kilometers is" + distance_in_miles   ) ;
    	  break;
      case 'p':
      case 'P':
    	  System.out.print( "\n This program converts pounds to kilograms." 
                  +  "\n Please, give a weight in pounds:  "  ) ;
    	  weight_in_pounds  =  keyboard.nextFloat() ;
    	  weight_in_kilograms  =  weight_in_pounds * 0.4536F ;
    	  
    	  System.out.print( "\n The weight you typed is"  +  weight_in_pounds   
    			  +  " \n We transfer it into kilograms is" + weight_in_kilograms   ) ;
    	  break;
      case 'x':
      case 'X':
    	  user_wants_to_quit =true;
    	  while (user_wants_to_quit = true)
          {
        	  System.out.print("\n Have a nice day!");
          break;// forgot to type break in the while loop, it keeps bring out Have a nice day!
          }
          
      }
      
      
}
}
