import java.util.*;

class CootiePlayer
{

   Scanner keyboard = new Scanner(System.in);
  
   //Variables
   private String [] messages = 
   {"Yes",
   "No",
   "Maybe",
   "Ask again later",
   "I can't say",
   "Not a chance!",
   "Possibly",
   "Where there's a will, there's a way",};
   String color;
   int choiceOne;
   int choiceTwo;
   private int finalChoice;
  
   public int makeChoice()
      {           
         //Get color choice from user
         System.out.println("Choose a color (Red, Yellow, Blue, Green): ");
         color = keyboard.next();
         choiceOne = color.length();
         
         while (!color.equalsIgnoreCase("Red") && !color.equalsIgnoreCase("Yellow") 
            && !color.equalsIgnoreCase("Blue") && !color.equalsIgnoreCase("Green"))
            {
               System.out.println("Sorry, that is not an option");
               System.out.println("Choose a color (Red, Yellow, Blue, Green): ");
               color = keyboard.next();
               choiceOne = color.length();
            }
         
         //Get number choice from user
         if (choiceOne % 2 == 0)
            {
               System.out.println("Choose a number (1, 2, 5, 6): ");
               choiceTwo = keyboard.nextInt();
               
               while (choiceTwo != 1 && choiceTwo != 2 && choiceTwo !=5 && choiceTwo != 6)
               {
                  System.out.println("Sorry, that is not an option");
                  System.out.println("Choose a number (1, 2, 5, 6): ");
                  choiceTwo = keyboard.nextInt();
               }
            }
         else
            {
               System.out.println("Choose a number (3, 4, 7, 8): ");
               choiceTwo = keyboard.nextInt();
               
               while (choiceTwo != 3 && choiceTwo != 4 && choiceTwo != 7 && choiceTwo != 8)
               {
                  System.out.println("Sorry, that is not an option");
                  System.out.println("Choose a number (3, 4, 7, 8): ");
                  choiceTwo = keyboard.nextInt();
               }
            }
            
         //Do the math to determine the final choice
         finalChoice = choiceOne + choiceTwo;
         finalChoice = finalChoice % messages.length;
         return finalChoice;
         
      } //End Method
      
   //print coinciding message
   void printMessage()
   {
      System.out.println("Cootie says: " + messages [finalChoice]);
   }
  
} //End class