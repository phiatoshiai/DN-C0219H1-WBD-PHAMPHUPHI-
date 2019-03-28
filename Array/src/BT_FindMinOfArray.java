import java.util.Scanner;

public class BT_FindMinOfArray {
    public static Scanner scanner = new Scanner ( System.in );

    public static void main ( String[] args ) {
        int array[] = null;
        System.out.println ( "---Enter Array---" );
        array = input ( array );
        findMin ( array );
        show ( array );
    }

    public static int[] input ( int[] array ) {
        System.out.print ( "Enter size of Array: " );
        int size = scanner.nextInt ();
        array = new int[ size ];
        System.out.print ( "Enter Elements: " );
        for ( int i = 0 ; i < size ; i++ ) {
            System.out.printf ( "a[%d]= " , i );
            array[ i ] = scanner.nextInt ();

        }
        return array;
    }

    public static void findMin ( int[] array ) {
        int min = array[ 0 ];
        for ( int i = 1 ; i < array.length ; i++ ) {
            if ( array[ i ] < min ) {
                min = array[ i ];
            }
        }
        System.out.println ( "Min of Array: " + min );
    }

    public static void show ( int[] array ) {
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.print ( "Array List: " + array[ i ] + "\t" );
        }
    }
}
