package OOP.Point;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    public Point2D ( float x , float y ) {
        this.x = x;
        this.y = y;
    }

    public Point2D () {
    }

    public float getX () {
        return x;
    }

    public void setX ( float x ) {
        this.x = x;
    }

    public float getY () {
        return y;
    }

    public void setY ( float y ) {
        this.y = y;
    }

    public void setXY ( float x , float y ) {
        this.x = x;
        this.y = y;
    }

    public void getXY () {
        float[] array = { this.x , this.y };
    }

    public String toString () {
        return "Array: " + "(" + this.x + "," + this.y + ")";
    }

    public static void main ( String[] args ) {
        Point2D point2D = new Point2D ();
        System.out.println ( point2D );

    }
}
