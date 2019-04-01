package Array;

import java.util.Scanner;

public class BT_FindCharAtAndCount {
    public static Scanner scanner = new Scanner ( System.in );

    public static void main ( String[] args ) {
        String str = null;
        int count = 0;
        str = input ( str );
        show ( str );
        lengthStr ( str );
        int strlength = str.length ();
        System.out.print ( "enter the character need to search: " );
        String findC = scanner.nextLine ();
        char temp = findC.charAt ( 0 );
        for ( int i = 0 ; i < strlength ; i++ ) {
            if ( temp == str.charAt ( i ) ) {
                count++;
            }
        }
        System.out.println ( "Character " + temp + " has count is: " + count );
    }

    public static String input ( String str ) {
        System.out.print ( "Enter String: " );
        str = scanner.nextLine ();
        return str;
    }

    public static void show ( String str ) {
        System.out.println ( "String hava just enter: " + str );
    }

    public static String lengthStr ( String str ) {
        System.out.println ( "Total characters in the string: " + str.length () );

        return str;
    }

}
