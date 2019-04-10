package JavaCollections.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTestComparable {
    public static void main ( String[] args ) {
        List<Person> list = new ArrayList<> (  );
        list.add(new Person ( 1,"Nguyen Van A" ));
        list.add(new Person ( 2,"Nguyen Van B" ));
        list.add(new Person ( 3,"Nguyen Van C" ));
        list.add(new Person ( 4,"Nguyen Van D" ));

        System.out.println ("truoc sap xep");
        for(Person p:list){
            System.out.println (p.getId ());
        }

        System.out.println ("sau sort");
        for(Person t:list){
            Collections.sort ( list , new Comparator<Person> () {
                @Override
                public int compare ( Person o1 , Person o2 ) {
                    return 0;
                }
            });
        }

    }
}
