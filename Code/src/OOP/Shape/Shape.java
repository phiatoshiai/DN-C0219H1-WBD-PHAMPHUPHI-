package OOP.Shape;

public class Shape {
    String color;
    boolean filled;

    public Shape () {
        this.color = "green";
        this.filled = true;
    }

    public Shape ( String color , boolean filled ) {
        this.color = color;
        this.filled = filled;
    }

    //Getter Setter Color
    public String getColor () {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    //Getter Setter Filled
    public boolean isFilled () {
        return filled;
    }

    public void setFilled ( boolean filled ) {
        this.filled = filled;
    }


    @Override
    public String toString () {
        return "A Shape with color of " + this.color + " and " + (isFilled () ? "filled" : "not filled");
    }
}
