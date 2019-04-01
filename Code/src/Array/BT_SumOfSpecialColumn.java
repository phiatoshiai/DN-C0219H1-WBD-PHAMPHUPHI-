package Array;

import java.util.Scanner;

public class BT_SumOfSpecialColumn {
    public static Scanner sc = new Scanner ( System.in );

    public static void main ( String[] args ) {
        float[][] array = null;
        array = input ( array );
        show ( array );
        sum ( array );
    }

    public static float[][] input ( float[][] array ) {
        System.out.println ( "--- 2-DIMENSIONAL ARRAY ---" );
        System.out.print ( "Enter size of rows: " );
        int rows = sc.nextInt ();
        System.out.println ();
        System.out.print ( "Enter size of columns: " );
        int cols = sc.nextInt ();
        System.out.println ();

        array = new float[ rows ][ cols ];
        System.out.print ( "Enter Elements: \n" );
        for ( int i = 0 ; i < rows ; i++ ) {
            for ( int j = 0 ; j < cols ; j++ ) {
                System.out.printf ( "a[%d][%d] = " , i , j );
                array[ i ][ j ] = sc.nextFloat ();
            }
        }
        return array;
    }

    public static void show ( float[][] array ) {
        for ( float[] x : array ) {
            for ( float y : x ) {
                System.out.print ( y + "\t" );
            }
            System.out.println ();
        }
    }

    public static void sum ( float[][] array ) {
        float sum = 0;
        System.out.println ( "Array has columns: " + array.length );
        System.out.print ( "Chose the column to total: " );
        int s = sc.nextInt ();
        System.out.println ();
        for ( int i = 0 ; i < s ; i++ ) {
            sum += array[ i ][ s - 1 ];
        }
        System.out.print ( "Sum of the column is: " + sum );
    }


}
