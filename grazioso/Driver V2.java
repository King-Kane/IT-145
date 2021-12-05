import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that displays menu options to intake new monkeys and dogs, reserve animals, and print lists of animals
 * @author Jeremiah Kane
 * @version 1.0
 */
public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    /**
     * Displays menu options that determines if input selection is valid on a loop and then redirects to 
     * appropriate method once valid input is taken.
     * @param args none
     */
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();
        char input = 0;
        int input1 = Character.getNumericValue(input);
        boolean isValidSelection = true;        // To control do-while loop
      
        displayMenu();                         //Starts Menu//
        do { 
        	isValidSelection = true;
		    try {               
		        input = scnr.nextLine().charAt(0);   //Takes users input for menu selection
		            
	            if(input == 'q') {                   //Quits Menu
	            	System.out.print("good bye");
	                System.exit(0);
	            }
	            else {
	            	input1 = Character.getNumericValue(input);;	      //Changes input from Char to Int
	            }
	       
		        if (input1 < 1 || input1 > 6)                        //Throws exception if expression evaluates to True
		        	throw new Exception("Invalid Entry. Please try again");		
		    }
		     
		    catch (Exception excpt){
		        System.out.println(excpt.getMessage());
		        isValidSelection = false;
		        }
        } while(!isValidSelection); 
    
        switch(input1){
			case 1:
				intakeNewDog(scnr);
				break;
			case 2:
				intakeNewMonkey(scnr);
				break;
			case 3:
				reserveAnimal(scnr);
				break;
			case 4:
				printDogs();
				break;
			case 5:
				printMonkey();
				break;
			case 6:
				printAnimals();
				break;
        }
    }

    /**
     * prints the menu options when called in main
     */
    public static void displayMenu() {                        
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    /**
     * Adds dogs to a list for testing purposes 
     */
    public static void initializeDogList() {                  
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", true, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    /**
     * Adds monkeys to a list for testing purposes
     */
    public static void initializeMonkeyList() {              
    	Monkey monkey1 = new Monkey("Johnny", "Macaque", "5.9", "8.9", "20.6", "male", "1", "16.3", "08-10-2019", "Canada", "Phase I", true, "Canada");
    	Monkey monkey2 = new Monkey("Breck", "Capuchin", "5.1", "11.2", "21.7", "female", "1", "17.1", "06-04-2020", "Mexico", "in service", false, "Mexico");
    	Monkey monkey3 = new Monkey("Earl", "Tamarin", "5.7", "7.7", "19.3", "male", "3", "17.2", "12-05-2021", "United States", "intake", false, "United States");

    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }

    /**
     * Intakes new dog information from user input and stores in in dogList
     * @param scanner takes input from user to store in variables 
     */
    public static void intakeNewDog(Scanner scanner) {       
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;                                                   //returns to menu//
            }
        }
        
        System.out.println("What is the dog's breed?");                   //Prompt user for dogs breed
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");                  //Prompt user for dogs gender
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");                     //Prompt user for dogs age
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");                  //Prompt user for dogs weight
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");        //Prompt user for dogs acquisition date
        String acqDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");     //Prompt user for dogs acquisition country
        String acqCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");         //Prompt user for dogs training status
        String ts = scanner.nextLine();
        System.out.println("Is the dog reserved?");                       //Prompt user for dogs reservation status
        boolean res = scanner.nextBoolean();scanner.nextLine();
        System.out.println("What is the dog's in Service Country?");      //Prompt user for dogs service country
        String isc = scanner.nextLine();
        Dog newdog = new Dog(name,breed,gender,age,weight,acqDate,acqCountry,ts,res,isc);
        dogList.add(newdog);
    }

    /**
     * Intakes new Monkey information from user input and stores in in monkeyList
     * @param scanner takes input from user to store in variables
     */
    public static void intakeNewMonkey(Scanner scanner) {    
    	System.out.println("What is the monkey's name?");
    	String name = scanner.nextLine();
    	for(Monkey monkey: monkeyList) {
    		if(monkey.getName().equalsIgnoreCase(name)) {
    			System.out.println("\n\nThis monkey is already in our system\n\n");
    	return;                                              //returns to menu
    		}
    	}
    	System.out.println("What is the monkey's species?");
    	String species = scanner.nextLine();
    	
    	for(@SuppressWarnings("unused") Monkey monkey: monkeyList) {                // Checks if monkey species is allowed
    		if(!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && !(species.equalsIgnoreCase("Macaque")) && !(species.equalsIgnoreCase("Marmoset")) && !(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))){
    			System.out.println("\n\nThis monkey's species is not allowed\n\n"); 
    	return;
    	}
    	System.out.println("What is the monkey's tail length?");                   //Prompt user for monkey's tail length
    	String tailLength = scanner.nextLine();
    	System.out.println("What is the monkey's height?");                        //Prompt user for monkey's height
    	String height = scanner.nextLine();
    	System.out.println("What is the monkey's body length?");                   //Prompt user for monkey's body length
    	String bodyLength = scanner.nextLine();
    	System.out.println("What is the monkey's gender?");                        //Prompt user for monkey's gender
    	String gender = scanner.nextLine();
    	System.out.println("What is the monkey's age?");                           //Prompt user for monkey's age
    	String age = scanner.nextLine();
    	System.out.println("What is the monkey's weight?");                        //Prompt user for monkey's weight
    	String weight = scanner.nextLine();
    	System.out.println("What is the monkey's acquisition date?");              //Prompt user for monkey's acquisition date
    	String acqDate = scanner.nextLine();
    	System.out.println("What is the monkey's acquisition country?");           //Prompt user for monkey's acquisition country
    	String acqCountry = scanner.nextLine();
    	System.out.println("What is the monkey's training status?");               //Prompt user for monkey's training status
    	String ts = scanner.nextLine();
    	System.out.println("Is the monkey reserved?");                             //Prompt user for monkey's reservation status
    	boolean res = scanner.nextBoolean();scanner.nextLine();
    	System.out.println("What is the monkey's in Service Country?");            //Prompt user for monkey's service country
    	String isc = scanner.nextLine();
    	Monkey newMonkey=new Monkey(name,species,tailLength,height,bodyLength,gender,age,weight,acqDate,acqCountry,ts,res,isc);
    	monkeyList.add(newMonkey);
    	}
    }
    
       /**
        * Reserves animals by promoting user for animal type and checks reserved status to see who's available   
        * @param scanner takes user input for animal type
        */
        public static void reserveAnimal(Scanner scanner) {
        	boolean isValidSelection = true;
        	
            
            do {
            	
            	
            	
            	try {
            		System.out.println("Enter animal type: Monkey or Dog");
                    String type = scanner.nextLine();
            		isValidSelection = true;
            		
		            if (type.equals("Monkey") || type.equals("monkey")) {
		            	System.out.println("Name - " + "Training Status - " + "Acquisition Country - " + " Reservation Status");
		                
		            	for (int i = 0; i < monkeyList.size(); i++) {
		                    if (!monkeyList.get(i).getReserved())
		                    System.out.println(monkeyList.get(i));
		            	}
		                System.out.println("Enter name: ");
			            String name = scanner.nextLine();
			            for (Monkey obj: monkeyList) {
			                if (obj.getName().equals(name)) {
			                    obj.setReserved(true);
			                    System.out.println("Name - " + "Training Status - " + "Acquisition Country - " + " Reservation Status");
			                    System.out.println(obj);
			                    return;
			                    }
			                else
			                	throw new Exception("Invalid Entry. Please try again");
			                }        
		            }
            	
		            else if (type.equals("Dog") || type.equals("dog")) {
		            	System.out.println("Name - " + "Training Status - " + "Acquisition Country - " + " Reservation Status");
		                for (int i = 0; i < dogList.size(); ++i) {
		                    if (!dogList.get(i).getReserved())
		                        System.out.println(dogList.get(i)); 
		                }
		                System.out.println("Enter name: ");
		                String name = scanner.nextLine();
		                for (Dog obj: dogList) {
		                    if (obj.getName().equals(name)) {
		                        obj.setReserved(true);
		                        System.out.println("Name - " + "Training Status - " + "Acquisition Country - " + " Reservation Status");
		                        System.out.println(obj);
		                        return;
		                    }
		                    else
			                	throw new Exception("Invalid Entry. Please try again");
		                }
		            }
		            else  
		            	throw new Exception("Invalid Entry. Please try again");
            	}
                catch (Exception excpt){
	    		      System.out.println(excpt.getMessage());
	    		      isValidSelection = false;
	    		      
                }
            } while(!isValidSelection);
        }
                   
                 
            
         
        
        /**
         * prints list of all dogs in dogList
         */
        public static void printDogs() {     
        	System.out.println("Dogs: ");
        	System.out.println("Name - " + "Training Status - " + "Acquisition Country - " + " Reservation Status");
        	for (Dog name: dogList) {
        		System.out.print(name);
        	}
        } 
        
        /**
         * prints list of all monkeys in monkeyList
         */
        public static void printMonkey() {   
        	System.out.println("Monkey's: ");
        	System.out.println("Name - " + "Training Status - " + "Acquisition Country - " + " Reservation Status");
        	for (Monkey name: monkeyList) {
        		System.out.print(name);
        	}
        }
        
        /**
         * prints list of that are not reserved and In Service
         */
        public static void printAnimals() {  
        	System.out.println("Name - " + "Training Status - " + "Acquisition Country - " + " Reservation Status");
        	for (int i = 0; i < dogList.size(); ++i) {
                if (!dogList.get(i).getReserved() && dogList.get(i).getTrainingStatus() == "in Service")
                    System.out.println(dogList.get(i));
        	}
                
        	for (int i = 0; i < monkeyList.size(); ++i) {
                if (!monkeyList.get(i).getReserved() && monkeyList.get(i).getTrainingStatus() == "in Service")
                System.out.println(monkeyList.get(i));
        	}
        }
}

