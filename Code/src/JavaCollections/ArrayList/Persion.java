package JavaCollections.ArrayList;

public class Persion {
    private int id;

    public Persion () {
    }

    public Persion ( int id ) {
        this.id = id;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        return (obj instanceof Persion) ? (((Persion) obj).getId () == this.id) : false;
    }
}
