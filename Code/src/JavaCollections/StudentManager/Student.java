package JavaCollections.StudentManager;

import java.util.Comparator;

public class Student{
    private int id;
    private String name;
    private String addr;
    private double gpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student() {
    }

    public Student(int id, String name, String addr, double gpa) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.gpa = gpa;
    }

}



