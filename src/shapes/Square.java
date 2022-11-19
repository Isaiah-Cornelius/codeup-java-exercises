package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
        this.width= length;
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea() {
        return this.length * this.width;
    }

//    private int side;
//
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea(){
//        System.out.print("From Square: Square Area: ");
//        return (side * side);
//    }
//
//    public int returnSuperGetArea(){
//        return super.getArea();
//    }
//
//    public int getPerimeter(){
//        System.out.print("From Square: Square Perimeter: ");
//        return (4 * side);
//    }
//
//    public int returnSuperGetPerimeter(){
//        return super.getPerimeter();
//    }
}
