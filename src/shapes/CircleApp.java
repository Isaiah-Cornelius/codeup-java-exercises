package shapes;

import util.Input;
import shapes.Circle;

public class CircleApp {
    private static int numberOfCircles = 0;
    public static void makeACircle(){
        System.out.println("Let's make a circle!");
        double radius = Input.getDouble("What's the radius of this circle?");
        Circle thisCircle = new Circle(radius);
        System.out.println("The area of this circle is " + thisCircle.getArea());
        System.out.println("The circumference of this circle is " + thisCircle.getCircumference());
        numberOfCircles++;
        boolean anotherCircle = Input.yesNo("Would you like to make another circle? ");
        if (anotherCircle == true){
            System.out.println("Great!");
            makeACircle();
        } else {
            System.out.println("Fine, I didn't want to make more circles anyway...");
            System.out.println("You created " + numberOfCircles + " circles!");
            System.out.println("Goodbye!");
        }
    }

    public static void main(String[] args) {
        makeACircle();
    }
}
