import java.util.Scanner;

public class BT_SumOfSpecialColumn {
    public static Scanner scanner = new Scanner ( System.in );

    public static void main ( String[] args ) {
        float[][] array = null;
        array = inputMartrix (array);
    }

    public static void inputMartrix(float[][] array){
        System.out.print ("Enter elements of column: ");
        int c = scanner.nextInt ();
        System.out.print ("Enter elements of row: ");
        int r = scanner.nextInt ();
        System.out.println ("Enter elements for 2-dimensional array");
        for(int col = 0; col < array.length; col++){
            for(int row = 0; row < array[col].length; row++){
                array[col][row] = scanner.nextFloat ();
            }
        }
        for(int col = 0; col < array.length; col++){
            for(int row = col; row < array[col].length; row++){
                System.out.println (array[col][row]);
            }
        }



    }
}
