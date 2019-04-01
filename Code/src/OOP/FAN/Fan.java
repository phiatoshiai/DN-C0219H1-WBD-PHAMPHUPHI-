package OOP.FAN;

public class Fan {
    int slow = 1;
    int medium = 2;
    int fast = 3;

    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan () {

    }

    public static void main ( String[] args ) {
        Fan fan1 = new Fan ();
        fan1.on = true;
        fan1.speed = fan1.fast;
        fan1.radius = 10;
        fan1.color = "yellow";
        System.out.println ( fan1.toSting () );

        Fan fan2 = new Fan ();
        fan2.on = false;
        fan2.speed = fan2.medium;
        fan2.radius = 5;
        fan2.color = "blue";
        System.out.println ( fan2.toSting () );
    }

    public int getSpeed () {
        return speed;
    }

    public void setSpeed ( int speed ) {
        this.speed = speed;
    }

    public boolean isOn () {
        return on;
    }

    public void setOn ( boolean on ) {
        this.on = on;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius ( double radius ) {
        this.radius = radius;
    }

    public String getColor () {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    public String toSting () {
        if ( this.on ) {
            return "Fan is On " + " Tốc độ: " + this.speed + " Màu: " + this.color + " Bán kính: " + this.radius;
        } else {
            return "Fan is On " + " Tốc độ: " + this.speed + " Màu: " + this.color + " Bán kính: " + this.radius;
        }
    }
}
