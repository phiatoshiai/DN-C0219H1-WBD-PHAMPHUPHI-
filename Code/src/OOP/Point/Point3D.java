package OOP.Point;

public class Point3D extends Point2D {

    float z = 0.0f;

    public Point3D () {

    }

    public Point3D ( float x , float y , float z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ () {
        return z;
    }

    public void setZ ( float z ) {
        this.z = z;
    }

    public void setXYZ ( float x , float y , float z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void getXYZ () {
        float[] array = { this.x , this.y , this.z };
    }

    public String toString () {
        return "Array: "
                + "("
                + this.x
                + ","
                + this.y
                + ","
                + this.z
                + ")";
    }

    public static void main ( String[] args ) {
        Point3D point3D = new Point3D ();
        System.out.println ( point3D );
    }
}