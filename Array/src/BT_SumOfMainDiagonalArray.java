import java.util.Scanner;

public class BT_SumOfMainDiagonalArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float[][] array = null;
        array = input(array);
        show(array);
        sumDiagonal(array);
    }

    public static float[][] input(float[][] array) {
        System.out.println("--- 2-DIMENSIONAL ARRAY ---");
        System.out.print("Enter size of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("Enter size of columns: ");
        int cols = sc.nextInt();
        System.out.println();

        array = new float[rows][cols];
        System.out.print("Enter Elements: \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                array[i][j] = sc.nextFloat();
            }
        }
        return array;
    }

    public static void show(float[][] array) {
        for (float[] x : array) {
            for (float y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }

    public static void sumDiagonal(float[][] array) {
        float sum1 = 0;
        float sum2 = 0;
        int t = array.length;
        System.out.println("--- SUM OF MAIN DIAGONAL ARRAY ---");
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][i];
        }
        System.out.print("Sum of the first main diagonal array " + sum1 + "\n");

        for (int i = 0; i < array.length; i++) {
                sum2 += array[i][t-1];
                t--;
        }
        System.out.print("Sum of the second main diagonal array " + sum2);
    }
}
