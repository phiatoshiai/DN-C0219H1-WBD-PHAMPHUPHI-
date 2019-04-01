package OOP.Rectangle;

import java.util.Scanner;

public class TestHCN {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter the width:" );
        double width = scanner.nextDouble ();
        System.out.print ( "Enter the height:" );
        double height = scanner.nextDouble ();
        HCN testHCN = new HCN ( width , height );
        System.out.println ( "Your Rectangle \n" + testHCN.display () );
        System.out.println ( "Perimeter of the Rectangle: " + testHCN.getPerimeter () );
        System.out.println ( "Area of the Rectangle: " + testHCN.getArea () );

    }
}

