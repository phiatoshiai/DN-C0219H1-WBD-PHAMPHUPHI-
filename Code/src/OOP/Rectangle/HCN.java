package OOP.Rectangle;

import OOP.Shape.Colorable;
import OOP.Shape.Resizeable;
import OOP.Shape.Shape;

public class HCN extends Shape implements Resizeable, Colorable {
    double width;
    double height;
    double percent = 1;

    public HCN ( double width , double height ) {
        this.width = width;
        this.height = height;
    }
    public  HCN(){};

    public double getArea () {
        return this.width * this.height * this.percent;
    }

    public double getPerimeter () {
        return (this.width + this.height) * 2;
    }

    public String display () {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    @Override
    public void resize ( double percent ) {
        this.percent = percent;

    }

    @Override
    public void howToColor () {
        System.out.println ("Color all four sides.");
    }
}
