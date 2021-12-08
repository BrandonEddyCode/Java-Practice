// Importing the Random library
import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

    /* Repeat while roll isn't 5
    This code will loop until a 5 is rolled and will  stop (Won't print a 5) 
    if you the set value of X above the limit of the dice you will fall into an infinite loop and die (dieRoll != x)
    */
    while (dieRoll != 5) {
      System.out.println(dieRoll);
      dieRoll = randomGenerator.nextInt(6 + 1);
    }
    
  }
  
}