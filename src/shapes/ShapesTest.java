package shapes;

public class ShapesTest {


//    private static Measurable myShape = new Rectangle(4,5);

    private static Measurable myShape = new Square(5);

    public static void main(String[] args) {

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        //#9 Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

        //Answer: Because rectangle is implementing measurable, it must include instructions for every method in measurable

        //#10 What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

        //Answer: The getLength and getWidth methods return the local implementation return value (square or rectangle) depending on the constructor used to create the instance.




//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.returnSuperGetArea());
//        System.out.println(box2.returnSuperGetPerimeter());
    }
}
