
package juego1;

import java.util.Scanner;


public class GuessGame {
/*
Let's play a little game:
We are going to generate a random number between 1 and 100.
You must ask the user for numbers that are between these two numbers 
(you have to control them). If the user fails you must tell him if the number he
entered is greater or less than the one he must guess.
The game ends when the user guesses correctly, there is no limit on attempts.
*/


  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int max = 100;
        int min = 1;
        
        int numberGuess = (int)(Math.random()* (max - min +1)+min);
        
        int numberUser;
        
         System.out.println("I'm thinking of a number between 1 and 100.");
                System.out.println("Can you guess it? ;)");
        
        boolean end = false;
        while (!end){
          do {
                while (!sc.hasNextInt()) { 
                    System.out.println("Please enter a valid number between 1 and 100.");
                    sc.next(); 
                }
                numberUser = sc.nextInt();

                if (numberUser < min || numberUser > max) {
                    System.out.println("Your guess is out of range! Please enter a number between 1 and 100.");
                }
            } while (numberUser < min || numberUser > max);

            if (numberUser < numberGuess) {
                System.out.println("The correct number is greater.");
            } else if (numberUser > numberGuess) {
                System.out.println("The correct number is less.");
            } else {
                System.out.println("You got it right! The number is " + numberGuess + "! c: ");
                end = true;
            }
        }
    }  
        
        
}
            
           /*First attempt 😐
           do {
            System.out.println("I'm thinking in a number between 1 and 100.");    
            System.out.println("Can you guess it? ;)");
            
            while (!sc.hasNextInt()){
                System.out.println("Please enter a valid number between 1 and 100");
                sc.next();
            
            }
            numberUser = sc.nextInt();
                if (!(numberUser >= min && numberUser <= max)) {
                    System.out.println("You have to write a number between 1 and 100.");
                }
            } while (!(numberUser>= min && numberUser >= max));{
        
            if (numberUser<numberGuess) {
                System.out.println("The correct number is greater ");
            } else if (numberUser > numberGuess) {
                System.out.println("The correct number is less");
            }else {
                System.out.println("You got it right! The number is "+ numberGuess + " c:");
                end = true; 
            }
                
            
            }

            
            
        }
*/

    
    
