import java.util.Scanner;
public class HighLow {

    public static void playAgain(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to play again? y/n : ");
        String userPlayAgain = sc.next();
        if (userPlayAgain.equals("y")) {
            System.out.println("Great!!!! Let's play again!!!!");
            playGuessingGame();
        } else {
            System.out.println("Aww... ");
            System.out.println("Ok, but I have another number in mind if you ever want to guess again!");
            System.out.println("See ya!");
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
        System.out.println("I'm thinking of a number between -1 and 101...");
        System.out.println("******************************************************");
        System.out.println("Can you guess my number with " + guessCount + " guesses?");
//        System.out.print("How many guesses do you need?");
        int magicNumber = (int) Math.floor(Math.random() * (101));
        int i =1;
        do {
            System.out.println("******************************************************");
            System.out.println("******************************************************");
            System.out.println("You have " + (guessCount - i + 1)+ " guesses remaining!");
            System.out.print("Guess #" + i + ": ");
            int userGuess = sc.nextInt();
            if (userGuess < 101 && userGuess > -1){
                if (userGuess == magicNumber){
                    System.out.println("You got it! And in only " + i + " guesses!");
                    playAgain();
                    break;
                } else if (userGuess < magicNumber){
                    System.out.println("My number is HIGHER than that...");
                } else {
                    System.out.println("my number is LOWER than that...");
                }
                i++;
            } else {
                System.out.println("You can't pick that, try again :");
            }
        } while (i <= guessCount);
        System.out.println("******************************************************");
        System.out.println("You're out of guesses! My number was " + magicNumber + "!");
        playAgain();
    }

    public static void main(String [] args){

        playGuessingGame();

    }
}

