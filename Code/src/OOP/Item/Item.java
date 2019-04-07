package OOP.Item;

public class Item {
    private String nameItem;
    private double price;
    private double discout;

    public Item () {
    }

    public Item ( String nameItem , double price , double discout ) {
        this.nameItem = nameItem;
        this.price = price;
        this.discout = discout;
    }

    public String getNameItem () {
        return nameItem;
    }

    public void setNameItem ( String nameItem ) {
        this.nameItem = nameItem;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }

    public double getDiscout () {
        return discout;
    }

    public void setDiscout ( double discout ) {
        this.discout = discout;
    }
}
