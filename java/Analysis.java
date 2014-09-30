//fig.4.11: analysis.java
//Analysis of examination results.

import javax.swing.JOptionPane;

public class Analysis {

   public static void main( String args[] )
   {
       //initializing variables in declarations
       int passes = 0;
       int  failures = 0; 
       int studentCounter = 1;
       int result = 0; 
       
       String input;
       String output;
       
       while ( studentCounter <= 10 ) {
    	   
    	   input = JOptionPane.showInputDialog("Enter result ( 1 = pass, 2 = fail )");
    	   
    	   if ( 1 == result)
    		   passes = passes + 1;
    	   else
    		   failures = failures + 1;
    	   
    	   studentCounter = studentCounter + 1;
       }//end while
       
       output = "Passed: " + passes + "\nFailed: " + failures;
       
       if ( passes > 8 )
    	   output =  output + "\nRaise Tuition";
       
       JOptionPane.showMessageDialog(null, output, 
    		   "Analysis of Examination Results",
    		   JOptionPane.INFORMATION_MESSAGE);       
       
       System.exit( 0 );
   }//end main
}
