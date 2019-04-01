package OOP.QuadraticEquation;

public class PTB2 {
    private double a;
    private double b;
    private double c;

    public PTB2 ( double a , double b , double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA () {
        return a;
    }

    public void setA ( double a ) {
        this.a = a;
    }

    public double getB () {
        return b;
    }

    public void setB ( double b ) {
        this.b = b;
    }

    public double getC () {
        return c;
    }

    public void setC ( double c ) {
        this.c = c;
    }

    public double getDiscriminant () {
        return this.b * this.b - (4 * this.a * this.c);
    }

    public String getRoot1 () {
        return "Root 1: " + (-this.b + (Math.pow ( this.getDiscriminant () , 0.5 )) / (2 * this.a));
    }

    public void getRoot2 () {
        System.out.println ( "Root 2: " + (-this.b + (Math.pow ( this.getDiscriminant () , 0.5 )) / (2 * this.a)) );
    }


}
