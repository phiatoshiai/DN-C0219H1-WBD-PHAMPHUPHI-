package OOP.Shape;
import OOP.Rectangle.HCN;

public class MainTestResize {
    public static void main ( String[] args ) {
        Triangle triangle = new Triangle (  );
        triangle.resize (Math.random ()*100);
        HCN rectangle = new HCN (  );
        rectangle.resize (Math.random ()*100);
        Circle circle = new Circle (  );
        circle.resize (Math.random ()*100);


        Resizeable[] mainTestResizes = new Resizeable[3];
        mainTestResizes[0] = triangle;
        mainTestResizes[1] = rectangle;
        mainTestResizes[2] = circle;

        for(Resizeable elm : mainTestResizes){
            System.out.println (((Shape) elm).getArea ());
        }

    }

}
