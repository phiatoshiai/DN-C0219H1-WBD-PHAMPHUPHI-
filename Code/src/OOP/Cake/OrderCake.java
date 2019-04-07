package OOP.Cake;

public class OrderCake extends Cake{
    private double weight;

    public OrderCake ( String name , double rate, double weight ) {
        super ( name , rate );
        this.weight = weight;
    }

    @Override
    public double calcPrice () {
        return this.rate*this.weight;
    }

    @Override
    public String toString(){
        return this.name + " có khối lượng " + this.weight + " và Rate: " + this.rate;
    }
}
