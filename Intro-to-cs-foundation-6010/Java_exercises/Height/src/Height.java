import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Height {
	 public static void main( String[] not_in_use ) throws IOException
	   {
		 Scanner  keyboard  =  new  Scanner( System.in ) ;
	      InputStreamReader reader  =  new  InputStreamReader( System.in ) ;
	      BufferedReader input = new BufferedReader(reader);
	      int Int1 = 0;
	      int Int2 = 0;
	      

	     
	      
	      System.out.println( " This program makes calculations related to your height."
	    		  + "\n Type 1 to give your height in feet and inches or"
	    		  + "\n Type 2 to give your height in centimeters. " ) ;
	      int unit_selection = keyboard.nextInt() ;
	      if ( unit_selection == 1 )
	      {
	    	  System.out.print(
	    	          "\n This program is a Height Survey. Please, type in "
	    	        + "\n your height in feet'inches format : " ) ;
	    	      String s = input.readLine();
	    	      String[] ss = s.split("'");
	    	      try {
	    	    	  Int1 = Integer.parseInt(ss[0]);
	    	    	  Int2 = Integer.parseInt(ss[1]);
	    	      }catch(NumberFormatException e) {
	    	    	  e.printStackTrace();
	    	      }
	    	      System.out.println("Your height is" + s +"we transfer it into centimeters which is" + 30.48 * Int1 + 2.54 * Int2 + "centimeters");
	    	      
	      // Here you can make the calculations already done in the
	      // previous exercise.
	      }
	      else if ( unit_selection == 2 )
	      { 
	    	  System.out.print(
    	          "\n This program is a Height Survey. Please, type in "
    	        + "\n your height in centimeters format : " ) ;
	    	  int height_in_centimeters;
	    	  height_in_centimeters  =  keyboard.nextInt() ;
	    	  double feet = height_in_centimeters / 30.48;
	    	  double inches = (height_in_centimeters/2.54) - (feet*12);
	    	  
	    	 
	    	  System.out.println("\n your height is " + height_in_centimeters +"cm, we transfer it into feet and inches which is " + feet +" feet and " + inches + " inches." );
	          
	      // Here you can ask the height in centimeters and do the necessary
	      // calculations
	      }
	      else
	    	  System.out.print("Wrong unit selection.");
	   }
	} 
