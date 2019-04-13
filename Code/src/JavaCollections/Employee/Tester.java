package JavaCollections.Employee;

public class Tester extends Employee{
    private double findError;
    private double basicSalary =9;
    public Tester ( int id , String name , int age , String phone , String email, double findError) {
        super ( id , name , age , phone , email );
        this.findError = findError;
    }

    public double getFindError () {
        return findError;
    }

    @Override
    public double getBasicSalary () {
        return basicSalary;
    }

    public void setFindError ( double findError ) {
        this.findError = findError;
    }

    public Tester () {
    }

    @Override
    public double calSalary () {
        return (this.basicSalary+this.findError)*50000;
    }
}
