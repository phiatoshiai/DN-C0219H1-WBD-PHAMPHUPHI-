package OOP.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner ( System.in );
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        Customer customer = new Customer (  );
        Item item = new Item ();
        GroceryBill groceryBill = new GroceryBill(customer);
        List<Item> listItem = new ArrayList<Item> (  );

        int condition=0;
        do {
            switch (inputMenu ()){
                case 1:
                    System.out.print ("Mời nhập sách: ");
                    scanner.nextLine();
                    String sach = scanner.nextLine();
                    listItem.add ( new Item (sach,2,1));
                    inputMenu ();
                    scanner.nextLine ();
                    break;

                case 2:
                    for(Item abc: listItem){
                        System.out.println (abc.getNameItem ());
                    }
                    break;
            }
        } while (condition == 3);









    }

    public static int inputMenu (){
        int x;
        do {
            System.out.println ( "---- NHÀ SÁCH ABC ----" );
            System.out.println ( "1. Nhập thông tin khách hàng" );
            System.out.println ( "2. Nhập thông tin sách" );
            System.out.println ( "3. Bán sách" );
            System.out.println ( "4. Cập nhật số lượng sách" );
            System.out.println ( "5. In ra danh sách sách" );
            System.out.println ( "6. Thoát chương trình");
            System.out.print ("Mời nhập lựa chọn 1-5: ");
            x  = scanner.nextInt();
            if(x<0||x>6){
                System.out.println ("Mời nhập lại");
            }
        } while(x < 0 || x >6);
        return x;
    }

}

