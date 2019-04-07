package OOP.Cake;

public class ReadyMadeCake extends Cake {
    private int quantity;
    public ReadyMadeCake ( String name , double rate, int quantity ) {
        super ( name , rate );
        this.quantity = quantity;
    }

    public int getQuantity () {
        return quantity;
    }

    @Override
    public double calcPrice () {
        return  this.rate * this.quantity;
    }

    @Override
    public String toString(){
        return this.name + " có số lượng " + this.quantity + " và Rate: " + this.rate;
    }
}
