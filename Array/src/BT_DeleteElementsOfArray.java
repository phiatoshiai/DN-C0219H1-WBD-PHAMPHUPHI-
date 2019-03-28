import java.util.Scanner;

public class BT_DeleteElementsOfArray {
    public static Scanner scanner = new Scanner ( System.in );

    public static void main ( String[] args ) {
        int[] array = null;
        array = input ( array );
        delEle ( array );
    }

    public static int[] input ( int[] array ) {
        System.out.print ( "Enter size of Array: " );
        int size = scanner.nextInt ();
        array = new int[ size ];
        System.out.println ( "Enter Elements of Array" );
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.printf ( "a[%d]" , i );
            array[ i ] = scanner.nextInt ();
        }
        return array;
    }

    public static void delEle ( int[] array ) {

        System.out.print ( "Enter element to Delete: " );
        int eleTodel = scanner.nextInt ();
        int index = 0;
        for ( int i = 0 ; i < array.length ; i++ ) {
            if ( array[ i ] == eleTodel ) {
                index = i;
                System.out.printf ( "The location of the number to search has index: " + index + " and array[%d]" , i );
                System.out.println ();
            }
        }
        for ( int u = index ; u < array.length - 1 ; u++ ) {
            array[ u ] = array[ u + 1 ];
        }
        System.out.println ( "Show array after delete the element" );
        show ( array );
    }

    public static void show ( int[] array ) {
        for ( int k = 0 ; k < array.length ; k++ ) {
            System.out.println ( array[ k ] + "\t" );
        }
    }
}
