package JavaCollections.Employee;

public class Developer extends Employee {
    private double workOverTime;
    private double basicSalary = 10;
    public Developer(int id , String name , int age , String phone , String email, double workOverTime){
        super(id,name,age,phone,email);
        this.workOverTime = workOverTime;
    }

    @Override
    public double getBasicSalary () {
        return basicSalary;
    }

    public double getWorkOverTime () {
        return workOverTime;
    }

    public void setWorkOverTime ( double workOverTime ) {
        this.workOverTime = workOverTime;
    }

    public Developer () {
    }

    @Override
    public double calSalary () {
        return (this.basicSalary+this.workOverTime)*200000;
    }
}
