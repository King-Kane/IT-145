import java.util.Scanner;
import java.lang.Double;

public class Paint1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        final double squareFeetPerGallons = 350.0;
        boolean isValidHeight = true;           //to control do-while
        boolean isValidWidth = true;            //to control do-while
        String wallHeightAsString;              //String variable for parsing
        String wallWidthAsString;               //String variable for parsing
        double cansPaintNeeded = 0.0;
        
        do {
        	isValidHeight = true;
            try {
                System.out.println("Enter wall height (feet): ");    // Prompt user to input wall's height
                wallHeightAsString = scnr.nextLine();                //Stores input as String for parsing to convert to double later  
                wallHeight = Double.parseDouble(wallHeightAsString); //Convert user input to double, exception thrown if conversion doesn't occur
           
                if (wallHeight <= 0)                                 //Throws exception if expression evaluates to True
                    throw new Exception("Height has to be greater than 0.");              
            }
            
            catch (Exception excpt) {
                System.out.println("Invalid input format. " + excpt.getMessage());
                isValidHeight = false;
            }
        } while (!isValidHeight);
        
        do {
        	isValidWidth = true;
            try {
                System.out.println("Enter wall width (feet): ");      // Prompt user to input wall's width
                wallWidthAsString = scnr.nextLine();                  //Stores input as String for parsing to convert to double later  
                wallWidth = Double.parseDouble(wallWidthAsString);    //Convert user input to double, exception thrown if conversion doesn't occur
                
                if(wallWidth <= 0)                                    //Throws exception if expression evaluates to True
                    throw new Exception("Width has to be greater than 0.");               
            }
            
            catch (Exception excpt) {
                System.out.println("Invalid input format. " + excpt.getMessage());
                isValidWidth = false;
            }
        } while(!isValidWidth);
        
        wallArea = wallHeight * wallWidth;                // Calculate and output wall area
        System.out.println("Wall area: " + wallArea + " square feet");       
                                                                            
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;   // Calculate and output the amount of paint (in gallons) needed to paint the wall
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        cansPaintNeeded = Math.ceil(gallonsPaintNeeded);
        
        System.out.println("Cans needed: " + cansPaintNeeded + " can(s)");     
        
        scnr.close();
    }
}