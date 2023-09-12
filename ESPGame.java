


import java.util.Scanner;
import java.util.Random; // random to generate random color for ESPGame

public class ESPGame 
{
	 
	 
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();  
        
        int correctGuesses = 0;
        int round = 1;
        String userName, dueDate; 
        
        final String ProgrammerName = "Matthew Mucha"; 
        final String COLOR_RED = "Red";
        final String COLOR_GREEN = "Green";
        final String COLOR_BLUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";
        final String COLOR_BLACK = "Black";
        final String COLOR_PURPLE = "Purple";
   
        System.out.print("Enter your name and MC#: "); 
		userName = scanner.next();
	
		scanner.nextLine();
		
		String describe; 
		System.out.print("Describe yourself: "); 
		describe = scanner.next();
		
		scanner.nextLine(); // allows for inputs not to be skipped 
		
		System.out.print("Due Date:");
		dueDate = scanner.next(); ;
	
		scanner.nextLine();
		
        while (round <= 11) 
        {
            System.out.println("Round " + round + "\n");

            int randomColorIndex = random.nextInt(7); // Generate a random number between 0 and 6
            String selectedColor;

            switch (randomColorIndex) 
            {
                case 0: 
                	
                	selectedColor = COLOR_RED; 
                	break;
                case 1: 
                	
                	selectedColor = COLOR_GREEN; 
                	break;
                case 2: 
                	
                	selectedColor = COLOR_BLUE; 
                	break;
                case 3: 
                	
                	selectedColor = COLOR_ORANGE; 
                	break;
                case 4: 
                	
                	selectedColor = COLOR_YELLOW; 
                	break;
                case 5: 
                	
                	selectedColor = COLOR_BLACK; 
                	break;
                case 6: 
                	
                	selectedColor = COLOR_PURPLE; 
                	break;
                default: 
                	
                	selectedColor = "Unknown"; 
                	break;
            }

            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or Purple?");
            System.out.print("Enter your guess: \n");
            String userGuess = scanner.nextLine();

            
            System.out.println("\nI was thinking of " + selectedColor + ".");

            if (userGuess.equalsIgnoreCase(selectedColor)) 
            {  
                correctGuesses++;
            } 
            round++;
        }

        System.out.println("Game Over\n");
        System.out.println("You guessed " + correctGuesses + " Out of 11 colors correctly.");
        System.out.println("User Name: " +userName);
        System.out.println("User Description: " + describe); 
        System.out.println("Due Date: " + dueDate);
        
        System.out.println("Programmer: " + ProgrammerName);
        scanner.close();
    }
}