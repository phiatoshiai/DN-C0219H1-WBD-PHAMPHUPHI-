package OOP.Shape;

public class Triangle extends Shape implements Resizeable{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    double percent = 1;

    public Triangle () {
    }

    public Triangle ( double side1 , double side2 , double side3 ) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1 () {
        return side1;
    }

    public void setSide1 ( double side1 ) {
        this.side1 = side1;
    }

    public double getSide2 () {
        return side2;
    }

    public void setSide2 ( double side2 ) {
        this.side2 = side2;
    }

    public double getSide3 () {
        return side3;
    }

    public void setSide3 ( double side3 ) {
        this.side3 = side3;
    }

    public double getArea () {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return (Math.sqrt ( p * (p - this.side1) * (p - this.side2) * (p - this.side3) ))*this.percent;
    }

    public double getPerimeter () {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString () {
        return "Area: " + getArea ()
                + "\n"
                + "Perimeter: " + getPerimeter ();
    }

    public static void main ( String[] args ) {
        Triangle triangle = new Triangle ( 3 , 4 , 5 );
        System.out.println ( triangle );
    }

    @Override
    public void resize ( double percent ) {
        this.percent = percent;
    }
}
