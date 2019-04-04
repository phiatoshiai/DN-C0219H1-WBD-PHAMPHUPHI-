package OOP.Shape;

import OOP.Rectangle.HCN;

import java.awt.*;

public class MainTestColorable extends HCN {
    public static void main ( String[] args ) {
        HCN[] square = new HCN[3];
        square[0] = new HCN(2,2);
        square[1] = new HCN(4,4);
        square[2] = new HCN(8,8);

        for(HCN elm : square){
            System.out.println (elm.getArea());
            if(elm instanceof Colorable){
                ((Colorable) elm).howToColor ();
            }else System.out.println ("not Colorable");
        }

    }





}
