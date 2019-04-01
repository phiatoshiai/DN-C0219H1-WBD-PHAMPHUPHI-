package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class TH_ReverseElementOfArray {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int size;
        do {
            System.out.print ( "Enter a size:" );
            size = scanner.nextInt ();
            if ( size > 20 )
                System.out.println ( "Size does not exceed 20" );
        } while (size > 20);

        Integer[] a = new Integer[ size ];
        int i = 0;
        while (i < a.length) {
            System.out.print ( "Enter element " + (i + 1) + ": " );
            a[ i ] = scanner.nextInt ();
            i++;
        }

        System.out.println ( Arrays.asList ( a ) );
        Collections.reverse ( Arrays.asList ( a ) );
        System.out.println ( Arrays.asList ( a ) );
    }
}
