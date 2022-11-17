package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    public int getArea(){
        System.out.print("From Square: Square Area: ");
        return (side * side);
    }

    public int returnSuperGetArea(){
        return super.getArea();
    }

    public int getPerimeter(){
        System.out.print("From Square: Square Perimeter: ");
        return (4 * side);
    }

    public int returnSuperGetPerimeter(){
        return super.getPerimeter();
    }
}
