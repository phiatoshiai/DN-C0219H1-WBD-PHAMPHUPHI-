package OOP.Shape;
import java.util.Arrays;

public class TestComparableCircle {
    public static void main ( String[] args ) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle ( 3.6 );
        circles[1] = new ComparableCircle (  );
        circles[2] = new ComparableCircle ( 2, "yellow",true );
        System.out.println ("Pre-Sort");
        for(ComparableCircle elm: circles){
            System.out.println (elm);
        }

        Arrays.sort(circles);

        System.out.println ("After Sort");
        for(ComparableCircle elm:circles){
            System.out.println (elm);
        }

    }
}
