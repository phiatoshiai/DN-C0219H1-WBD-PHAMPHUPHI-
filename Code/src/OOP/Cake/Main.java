package OOP.Cake;

public class Main {
    public static void main ( String[] args ) {
        double sum = 0;
        double totalQuantity = 0;
        double sumQuantity = 0;
        Cake[] cakeList = new Cake[ 5 ];
        cakeList[ 0 ] = new OrderCake ( "Bánh Rán" , 3.1 , 2 );
        cakeList[ 1 ] = new OrderCake ( "Bánh My" , 4.1 , 5 );
        cakeList[ 2 ] = new OrderCake ( "Bánh Ruri" , 13.1 , 1 );
        cakeList[ 3 ] = new ReadyMadeCake ( "Bánh Rr" , 31.1 , 20 );
        cakeList[ 4 ] = new ReadyMadeCake ( "Bánh Ronaldo" , 2.1 , 21 );

        Cake highestPriceCake = cakeList[ 0 ];

        for ( Cake cake : cakeList ) {
            sum = sum + cake.calcPrice ();
            System.out.println ( cake.toString () );

            if ( cake instanceof ReadyMadeCake ) {
                totalQuantity = totalQuantity + cake.calcPrice ();
                sumQuantity = sumQuantity + ((ReadyMadeCake) cake).getQuantity ();
            }

            if ( cake.calcPrice () > highestPriceCake.calcPrice () ) {
                highestPriceCake = cake;
            }
        }

        System.out.println ( "Total of all Cake: " + sum );
        System.out.println ( "Total of all Ready made Cake: " + totalQuantity );
        System.out.println ( "Total quantity: " + sumQuantity );
        System.out.println ( highestPriceCake );

    }
}
