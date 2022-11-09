import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter an integer: ");
        Integer userInt = scanner.nextInt();

        scanner.nextLine();

        System.out.println("You entered: " + userInt);

        System.out.println("Enter 3 words: ");
        String userWord1 = scanner.next();
        String userWord2 = scanner.next();
        String userWord3 = scanner.next();
        System.out.println("You entered: \n" + userWord1 + "\n" + userWord2 + "\n" + userWord3);

        scanner.nextLine();

        System.out.println("Enter a sentence :");
        String userSentence = scanner.nextLine();
        System.out.println("You entered \"" + userSentence + "\"");

        System.out.print("Enter room length: ");
        Float roomLength = Float.parseFloat(scanner.next());
        System.out.print("Enter room width: ");
        Float roomWidth = Float.parseFloat(scanner.next());
        System.out.print("Enter room height: ");
        Float roomHeight = Float.parseFloat(scanner.next());


        scanner.nextLine();

        System.out.println("Room Length: " + roomLength);
        System.out.println("Room Width: " + roomWidth);
        System.out.println("Room Height: " + roomHeight);

        System.out.println("Room Area = " + (roomLength * roomWidth));
        System.out.println("Room Perimeter = " + (roomLength * 2 + roomWidth * 2));
        System.out.println("Room Volume = " + (roomLength * roomWidth * roomHeight));

        //ToDo: save your age to a variable. create a scanner class. have the user guess your age. return whether or not the guessed age is the same as the age saved:
//        int age = 31;
//        System.out.print("Guess my age : ");
//        int userAgeGuess = scanner.nextInt();
//
//
//        System.out.println("You guessed : " + userAgeGuess);
//        if (age == userAgeGuess){
//            System.out.println("You got it!");
//        } else if (age < userAgeGuess){
//            System.out.println("I'm not that old...");
//        } else if (age > userAgeGuess){
//            System.out.println("I'm a bit older than that...");
//        }

//        float piFloat = (float) 3.14;
//        double piDouble = piFloat;
//
//        System.out.println(piFloat); // 3.14
//        System.out.println(piDouble); // 3.140000104904175
//        System.out.println(piDouble == piFloat); // true
//
//        piDouble = piDouble * 1000000000;
//        piFloat = piFloat   * 1000000000;
//
//        System.out.println(piFloat); // 3.14E9
//        System.out.println(piDouble); // 3.140000104904175E9
//        System.out.println(piDouble == piFloat); // false



    }
}
