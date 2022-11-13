import java.util.Scanner;

public class MethodsExercises {

    //Q1
     public static int additionMethod(int x, int y){
        System.out.println(x+y);
        return x + y;
    }

    public static int subtractionMethod(int x, int y){
        System.out.println(x-y);
        return x - y;
    }

    public static int multiplicationMethod(int x, int y){

        int result = x;
        for (int i = y; i > 1; i--){
            result += x;
        }
        System.out.println(result);
        return result;
    }

    public static int recursionMultiplicationMethod(int x, int y){
        switch (y){
            case 0:
                return 0;
            case 1:
                return x;
            case 2:
                return x + x;
            default:
                return x + recursionMultiplicationMethod(x, y-1);
        }

    }

    public static double divisionMethod(double x, double y){
        System.out.println(x/y);
        return x / y;
    }

    public static int modulusMethod(int x, int y){
        System.out.println(x % y);
        return x % y;
    }

    //Q2 ask about recursion
    public static int getInteger(int min, int max){

        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("getInteger; Enter an integer between " + (min - 1) + " and " + (max + 1) + ": ");
            userNumber = scanner.nextInt();
        } while (userNumber < min || userNumber > max);

        return userNumber;
    }

    //Q3
    public static void getFactorial(){
         int min = 1;
         int max = 20;
         Scanner scanner = new Scanner(System.in);
         int userNumber;
         long userNumberFactorial = 1;
         String displayString = "";

         do {
             System.out.print("getFactorial; Enter an integer between " + (min - 1) + " and " + (max + 1) + ": ");
             userNumber = scanner.nextInt();
         } while (userNumber < min || userNumber > max);
         scanner.nextLine();

         displayString += userNumber + "! = ";

         for (int i = 1; i <= userNumber; i++){
             userNumberFactorial *= i;

             if (i == userNumber){
                 displayString += i + " = ";
                 break;
             }
             displayString += i + " x ";
         }
         displayString += userNumberFactorial;
         System.out.println(displayString);

         System.out.print("Continue? y/n : ");

         String userContinue = scanner.next();

         if (userContinue.equals("y")){
             getFactorial();
         }
    }

    public static void recursionGetFactorial() {
        int min = 1;
        int max = 20;
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        long userNumberFactorial;
        String displayString = "";

        do {
            System.out.print("getFactorial; Enter an integer between " + (min - 1) + " and " + (max + 1) + ": ");
            userNumber = scanner.nextInt();
        } while (userNumber < min || userNumber > max);
        scanner.nextLine();

        userNumberFactorial = makeRecursiveGetFactorial(userNumber);

        displayString += userNumber + "! = ";

        for (int i = 1; i <= userNumber; i++){
            if (i == userNumber){
                displayString += i + " = ";
                break;
            }
            displayString += i + " x ";
        }
        displayString += userNumberFactorial;
        System.out.println(displayString);

    }

    public static long makeRecursiveGetFactorial(int x){
         long returnValue = 1;
         switch (x){
             case 1:
                 break;
             default:
                 returnValue *= x * makeRecursiveGetFactorial(x-1);
         }
         return returnValue;
    }

    //Q4
    public static long rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sides on the dice? ");
        int numDiceSides = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Oooo some " + numDiceSides + " sided dice...");
        String userRollAnswer;
        do {
            System.out.print("Wanna roll em? y/n ");
            userRollAnswer = scanner.next();
            scanner.nextLine();
            System.out.println();
        } while (!userRollAnswer.equals("y"));
        System.out.println("I knew you'd say yes! Here goes!..");
        long dice1 = (long) Math.floor(Math.random() * (numDiceSides) +1);
        long dice2 = (long) Math.floor(Math.random() * (numDiceSides) +1);
        System.out.println("Dice 1 : " + dice1);
        System.out.println("Dice 2 : " + dice2);

        return dice1 + dice2;
    }



    public static void main(String [] args){
//        System.out.println(recursionMultiplicationMethod(4,5));

//        System.out.print(getInteger(1,10));

//        getFactorial();

//        recursionGetFactorial();

        System.out.print(rollDice());

    }
}
