import java.util.*;
import java.util.concurrent.TimeUnit;


public class HighLow {

    public static void rollOutString(String s){
        int i;
        String[] stringArray = s.split(" ");
        for (i = 0; i < stringArray.length; i++){
            if (i == stringArray.length -1){
                System.out.printf("%s", stringArray[i]);
                System.out.println();
                break;
            }
            System.out.printf("%s ", stringArray[i]);
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void playAgain(){
        Scanner sc = new Scanner(System.in);
        rollOutString("Would you like to play again? y/n : ");
        String userPlayAgain = sc.next();
        if (userPlayAgain.equals("y")) {
            rollOutString("Great!!!! Let's play again!!!!");
            playGuessingGame();
        } else {
            rollOutString("Aww... ");
            rollOutString("Ok, but I have another number in mind if you ever want to guess again!");
            rollOutString("See ya!");
        }
    }

    public static void playGuessingGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println("************ WELCOME TO THE GUESSING GAME ************");
        System.out.println("******************************************************");
        System.out.println("******************************************************");

        int guessCount = 6;
        rollOutString("I'm thinking of a number between -1 and 101...");
        System.out.println("******************************************************");
        rollOutString("Can you guess my number with " + guessCount + " guesses?");
//        System.out.print("How many guesses do you need?");
        int magicNumber = (int) Math.floor(Math.random() * (101));
        int i =1;
        String winner = "";
        do {
            System.out.println("******************************************************");
            System.out.println("******************************************************");
            rollOutString("You have " + (guessCount - i + 1)+ " guesses remaining!");
            System.out.print("Guess #" + i + ": ");
            int userGuess = sc.nextInt();

            if (userGuess < 101 && userGuess > -1){
                if (userGuess == magicNumber){
                    rollOutString("You got it! And in only " + i + " guesses!");
                    winner = "winner";
                    playAgain();
                    break;
                } else if (userGuess < magicNumber){
                    rollOutString("My number is HIGHER than that...");
                } else {
                    rollOutString("My number is LOWER than that...");
                }
                i++;
            } else {
                System.out.println("You can't pick that, try again :");
            }
        } while (i <= guessCount);
        if (!winner.equals("winner")){
            System.out.println("******************************************************");
            rollOutString("You're out of guesses! My number was " + magicNumber + "!");
            playAgain();
        }
    }

    public static void main(String [] args){

        playGuessingGame();

    }
}

