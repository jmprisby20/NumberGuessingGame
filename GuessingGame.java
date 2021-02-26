// Jake Prisby
// 2/26/2021
// Number Guessing Game

// Imports
import java.util.Scanner;
import java.util.Random;

// Class
public class GuessingGame {

   // Main Method 
   public static void main ( String[] args ) {
      Scanner s = new Scanner( System.in ); // Scanner used for user input in console
      Random rnd = new Random(); // Random Object used to generate random number that player needs to guess
      int num = rnd.nextInt(20) + 1; // Generates a random number between 1 and 20
      int playerGuess; // Will store player input value
      int numOfGuesses = 0; // Stores the amount of guesses the player has had
      
      // Loop till player guesses correct number
      do {
         System.out.print("Guess a number from 1 to 20: ");
         playerGuess = s.nextInt(); // Used input is stored
         if ( playerGuess > 0 && playerGuess <= 20 ) {
            // Here the number is in range, check if the guess was above or below the correct number
            if ( playerGuess < num ) {
               // Here the player guessed a number lower than the correct number
               System.out.println("HINT: try a high number");
            } else if( playerGuess > num ) {
               // Here the player guessed a number higher than the correct number
               System.out.println("HINT: try a lower number");
            }
         } else {
            // Here the guess is not in range
            System.out.println("Number out of range!!!");
         }
         numOfGuesses++; // Increment the number of guesses that the player has had
      } while ( playerGuess != num );
      
      // Here the player Guessed the correct number
      System.out.println("Correct: You Win!");
      System.out.println("Total Guesses: " + numOfGuesses);
      
   }
}