public class BT_FindMaxOf2Array {
    public static void main ( String[] args ) {
        float[][] array = { { -1 , 2 , 1 , 3 , 1 } , { 5 , 1 , 9 , -5 , 1 } };
        float maxA = array[ 0 ][ 0 ];
        float minA = array[ 0 ][ 0 ];
        int x, y;
        for ( int row = 0 ; row < array.length ; row++ ) {
            for ( int col = 0 ; col < array[ row ].length ; col++ ) {
                if ( array[ row ][ col ] > maxA ) {
                    maxA = array[ row ][ col ];
                } else if ( array[ row ][ col ] < minA ) {
                    minA = array[ row ][ col ];
                }
            }
        }
        System.out.println ( maxA );
        System.out.println ( minA );
    }
}
