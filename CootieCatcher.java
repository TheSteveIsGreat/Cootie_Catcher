import java.util.*;

class CootieCatcher{

   public static void main (String[] args)
   {
      //Variables
      Scanner keyboard = new Scanner(System.in);
      CootiePlayer player = new CootiePlayer();
      String question = "";
      
      System.out.println("Cootie Catcher");
    
      while (!question.equalsIgnoreCase("Q"))
      {
         //Get question from user
         System.out.println("Ask your Cootie Catcher a question (Q to quit): ");
         question = keyboard.next();
         
         if (question.equalsIgnoreCase("Q"))
         {
            break;
         }
         
         //Play Cootie Catcher
         player.makeChoice();
         player.printMessage();
         
         //Flush the buffer
         keyboard.nextLine();    
      }
   
   } //End main
} //End class