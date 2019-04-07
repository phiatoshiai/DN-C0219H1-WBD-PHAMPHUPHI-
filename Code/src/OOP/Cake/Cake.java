package OOP.Cake;

public class Cake {
    protected String name;
    protected double rate;

    public Cake(String name, double rate){
        this.name = name;
        this.rate = rate;
    }

    public double calcPrice(){
        return -1;
    }

    @Override
    public  String toString(){
        return name + "\t" + rate;
    }
}
