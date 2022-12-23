import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /**Math.random() generates a random number between 1 and 10.
        *The number is then multiplied by 100 and is added by 1 incase the random number ends up being zero.
        *(int) is used to cast the number generated after to an integer to drop any fractional part.
        **/
        int randomNumber = (int) (Math.random() * 100) + 1;
        //
        boolean won=false;
        
        //Print statements for Game rules.
        System.out.println("I HAVE CHOOSEN A RANDOM NUMBER BETWEEN [1,100]");
        System.out.println("TRY TO GUESS IT.)");

        /** Checking for random number.
         * System.out.println(randomNumber);
         * */

        //Scanner for user input throught the CLI (Terminal)
        Scanner scanner = new Scanner(System.in);

        //For loop for game conditions.
        for (int i=10; i>0; i--){
            System.out.println("YOU HAVE " + i + " GUESS(ES) LEFT. PICK A NUMBER.");
            
            int guess = scanner.nextInt();

            System.out.println("YOUR GUESS WAS: " + guess);

            if (randomNumber < guess) {
                System.out.println("IT IS SMALLER THAN " + guess + ".");
            }

            else if (randomNumber > guess) {
                System.out.println("IT IS GREATER THAN " + guess + ".");
            }

            else  {
                won = true;
                break;
            }
        }

        //Game over conditions.
        if (won) {
            System.out.println("CONGRATULATIONS, YOU WON!!!! :)");
        } else {
            System.out.println("GAME OVER, YOU LOST!!!! :(");
            System.out.println("THE NUMBER WAS " + randomNumber);
        }

    }
}
 