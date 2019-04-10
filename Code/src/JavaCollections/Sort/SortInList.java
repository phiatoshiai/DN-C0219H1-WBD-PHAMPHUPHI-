package JavaCollections.Sort;

import JavaCollections.ArrayList.Persion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortInList {
    public static void main ( String[] args ) {
        List<String>  list = new ArrayList<> ();

        list.add ("a");
        list.add ("d");
        list.add ("c");

        Collections.sort(list);

        for(String s: list){
            System.out.println (s);
        }

    }
}
