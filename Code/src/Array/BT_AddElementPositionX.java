package Array;

import java.util.Scanner;

public class BT_AddElementPositionX {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        int size;
        int[] array;
        do {
            System.out.print ( "Enter size of array: " );
            size = input.nextInt ();
            if ( size > 20 ) {
                System.out.println ( "Size should not exceed 20" );
            }
        } while (size > 20);
        array = new int[ size ];


        //enter Pos
        int x;
        do {
            System.out.print ( "Enter X: " );
            x = input.nextInt ();
            if ( x < 1 ) {
                System.out.println ( "X not less than 1" );
            }
        } while (x < 1);


        //Enter Index
        int index;
        int length = array.length;
        do {
            System.out.print ( "Enter index from 0 to " + (length - 1) + ": " );
            index = input.nextInt ();
            if ( index <= 1 && index >= (length - 1) ) {
                System.out.println ( "Cannot insert element into array" );
            }
        } while (index <= 1 && index >= (length - 1));
        array[ index ] = x;

        //Print
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.print ( array[ i ] + "\t" );
        }
    }

}



