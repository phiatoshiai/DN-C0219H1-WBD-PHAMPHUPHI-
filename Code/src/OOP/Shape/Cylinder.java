package OOP.Shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder () {
        this.height = 1;

    }

    public Cylinder ( double height , double radius ) {
        this.height = height;
        this.radius = radius;
    }

    public double getV () {
        return super.getArea () * this.height;
    }

    public String toString () {
        return "A Cylinder with radius= " + this.radius + ", which is a subclass of " + super.toString ();
    }

    public static void main ( String[] args ) {
        Cylinder cylinder = new Cylinder ();
        System.out.println ( "The tich: " + cylinder.getV () );
        System.out.println ( cylinder );
    }

}
