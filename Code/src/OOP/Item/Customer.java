package OOP.Item;

public class Customer {
    private String nameCus;
    private String address;
    private int phonenumber;
    private int id;

    public Customer () {
    }

    public String getNameCus () {
        return nameCus;
    }

    public void setNameCus ( String nameCus ) {
        this.nameCus = nameCus;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public int getPhonenumber () {
        return phonenumber;
    }

    public void setPhonenumber ( int phonenumber ) {
        this.phonenumber = phonenumber;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public Customer ( String name , String address , int phonenumber , int id ) {
        this.nameCus = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.id = id;
    }
}
