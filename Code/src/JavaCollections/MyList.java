package JavaCollections;

public interface MyList<E> extends java.lang.Iterable<E> {
    public void add(E e); //thêm phần tử vào mảng

    public void add(int index, E e); //thêm phần tử vào vị trí index

    public void clear(); //remove all element of list

    public boolean contains(E e); //boolean - trả về true nếu mảng có yếu tố đc chỉ định

    public E get(int index); //trả về element của phần tử vị trí index

    public int indexOf(E e); //trả về phần tử đầu tiên

    public boolean isEmpty(); //trả về true nếu mảng trống

    public int lastIndexOf(E e);// trả về phần tử cuối của mảng

    public boolean remove(E e); //remove the element of this list

    public E remove(int index); //xóa element của index đc trỏ

    public Object set(int index, E e);

    public int size();
}
