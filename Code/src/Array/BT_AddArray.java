package Array;

import java.util.Scanner;

public class BT_AddArray {
    public static Scanner scanner = new Scanner ( System.in );

    public static void main ( String[] args ) {
        float[] array1 = null;
        float[] array2 = null;
        System.out.println ( "---Enter Array 1---" );
        array1 = input ( array1 );
        System.out.println ( "---Enter Array 2---" );
        array2 = input ( array2 );
        float[] array3 = new float[ array1.length + array2.length ];
        for ( int i = 0 ; i < array1.length ; i++ ) {
            array3[ i ] = array1[ i ];
        }
        for ( int j = 0 ; j < array2.length ; j++ ) {
            array3[ j + array1.length ] = array2[ j ];
        }
        show ( array3 );

    }


    public static float[] input ( float[] array ) {
        System.out.print ( "Enter Size: " );
        int size = scanner.nextInt ();
        // khởi tạo arr
        array = new float[ size ];
        System.out.print ( "Enter Elements: \n" );
        for ( int i = 0 ; i < size ; i++ ) {
            System.out.printf ( "a[%d] = " , i );
            array[ i ] = scanner.nextInt ();
        }
        return array;
    }


    public static void show ( float[] array ) {
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.print ( array[ i ] + " " );
        }
    }

}
