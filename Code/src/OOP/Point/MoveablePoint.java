package OOP.Point;

public class MoveablePoint extends Point2D {

    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint () {
    }

    public MoveablePoint ( float x , float y , float xSpeed , float ySpeed ) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint ( float xSpeed , float ySpeed ) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed () {
        return xSpeed;
    }

    public void setxSpeed ( float xSpeed ) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed () {
        return ySpeed;
    }

    public void setySpeed ( float ySpeed ) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed ( float xSpeed , float ySpeed ) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed () {
        float[] speed = { xSpeed , ySpeed };
        return speed;
    }

    public String toString () {
        return "Array"
                + "(" + this.x
                + "," + this.y
                + "),"
                + "speed= "
                + "(" + this.xSpeed
                + "," + this.ySpeed
                + ")"
                + "\n";
    }

    public MoveablePoint move () {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }

    public static void main ( String[] args ) {
        MoveablePoint moveablePoint = new MoveablePoint ( 2 , 2 , 0 , 0 );
        for ( int i = 0 ; i < 100 ; i++ ) {
            moveablePoint.move ();
            System.out.println ( moveablePoint );
        }
    }
}
