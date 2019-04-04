package OOP.Shape;

public class Circle extends Shape implements Resizeable {
    final double PI = 3.14;
    double radius;
    double percent = 1;

    public Circle () {
        this.radius = 1.0;
        this.setColor ( "yellow" );
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius ( double radius ) {
        this.radius = radius;
    }

    public Circle ( double radius ) {
        this.radius = radius;
    }

    public Circle ( double radius , String color , boolean filled ) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getArea () {
        return PI * 2 * this.radius * this.percent;
    }

    public void getPerimeter () {
        double perimeter = PI * radius * radius;
    }

    public String toString () {
        return "A Circle with radius= " + this.radius + ", which is a subclass of " + super.toString ();
    }



    public static void main ( String[] args ) {
        Circle circle = new Circle ();
        System.out.println ( circle.getArea () );
        System.out.println ( circle.toString () );
    }

    @Override
    public void resize ( double percent ) {
        this.percent = percent;
    }

}
