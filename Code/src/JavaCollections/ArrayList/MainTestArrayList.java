package JavaCollections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainTestArrayList {
    public static void main ( String[] args ) {
        Persion p1 = new Persion ( 1 );
        Persion p2 = new Persion ( 2 );
        Persion p3 = new Persion ( 3 );

        //khai báo List
        List<Persion> listPersion = new ArrayList<Persion> (  );

        listPersion.add(p1);
        listPersion.add(p2);
        listPersion.add(p3);

        Persion p =   listPersion.get(0);
        System.out.println (p.getId ());

        for(int i=0; i<listPersion.size ();i++)
        {
            System.out.println (listPersion.get ( i ).getId ());
        }

        listPersion.remove ( 1 );
        System.out.println ("revmove");
        for(int i=0; i<listPersion.size ();i++)
        {
            System.out.println (listPersion.get ( i ).getId ());
        }

        System.out.println ("remove Obj");
        listPersion.remove ( new Persion (1) );
        for(int i=0; i<listPersion.size ();i++)
        {
            System.out.println (listPersion.get ( i ).getId ());
        }

    }

}
