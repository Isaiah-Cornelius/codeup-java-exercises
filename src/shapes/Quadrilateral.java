package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

protected double length;

protected double width;

public Quadrilateral(double length, double width){
    this.length = length;
    this.width = width;
}

//GETTERS
public double getLength(){
    return this.length;
}

public double getWidth() {
    return this.width;
}
// END GETTERS

// SETTERS
public abstract void setLength(double length);

public abstract void setWidth(double width);
//END SETTERS
}
