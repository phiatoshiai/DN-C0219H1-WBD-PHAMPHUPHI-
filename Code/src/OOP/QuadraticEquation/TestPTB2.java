package OOP.QuadraticEquation;

import java.util.Scanner;

public class TestPTB2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter a: " );
        double a = scanner.nextDouble ();
        System.out.print ( "Enter b: " );
        double b = scanner.nextDouble ();
        System.out.print ( "Enter c: " );
        double c = scanner.nextDouble ();

        PTB2 testPTB2 = new PTB2 ( a , b , c );
        double t = testPTB2.getDiscriminant ();
        System.out.println ( "Delta= " + t );
        if ( t > 0 ) {
            System.out.println ( "Phương Trình có 2 nghiệm" );
            System.out.println ( testPTB2.getRoot1 () );
            testPTB2.getRoot2 ();
        } else if ( t == 0 ) {
            testPTB2.getRoot1 ();
        } else {
            System.out.println ( "Vô nghiệm" );
        }

    }

}
