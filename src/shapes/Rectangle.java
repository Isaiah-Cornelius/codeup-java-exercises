package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public void rectangle(){}

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        System.out.print("From Rectangle: Rectangle Area: ");
        return (this.length * this.width);
    }

    public int returnSuperGetArea(){
        return 0;
    }

    public int returnSuperGetPerimeter(){
        return 0;
    }

    public int getPerimeter(){
        System.out.print("From Rectangle: Rectangle Perimeter: ");
        return (2 * this.width) + (2 * this.length);
    }
}
