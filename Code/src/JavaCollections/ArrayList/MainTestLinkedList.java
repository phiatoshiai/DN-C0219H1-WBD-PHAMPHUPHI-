package JavaCollections.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class MainTestLinkedList {
    public static void main ( String[] args ) {
        Persion persion = new Persion ( 1 );


        List<Persion> linkedList = new LinkedList<> (  );
        linkedList.add(persion);
        for(Persion p: linkedList){
            System.out.println (p.getId ());
        }
    }
}
