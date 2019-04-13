package testDefault;

public class Main {
    public static void main ( String[] args ) {
        Test1 t1 = new Test1 ();
        t1.say();
    }

}

class Test1 implements ABC,Test{

    @Override
    public void say () {
        ABC.super.say ();
    }

    @Override
    public void run1 () {

    }

    @Override
    public void run () {

    }
}
