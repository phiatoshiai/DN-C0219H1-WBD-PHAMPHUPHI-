package JavaCollections.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    public static Scanner scanner = new Scanner ( System.in );

   Employee employee = new Employee ();
   Employee developer = new Developer ();
   Employee tester = new Tester ();
   ArrayList<Employee> employees = new ArrayList<> (  );

   int demDev = 1;
   int demTest = 1;

    public void addDev(){
        developer.setId ( demDev );
        System.out.println ( "Enter Info of Developer has ID: " + developer.getId () );
        System.out.print ( "Enter name: " );
        developer.setName ( scanner.nextLine () );
        do {
            System.out.print ( "Enter Age greater than 0:  ");
            developer.setAge ( scanner.nextInt () );
            scanner.nextLine ();
        }while(developer.getAge()<0);
        System.out.print ( "Enter email: " );
        developer.setEmail ( scanner.nextLine () );
        do {
            System.out.print ( "Enter Work Over Time greater than or equal to 0:  ");
            ((Developer)developer).setWorkOverTime(scanner.nextDouble ());
            scanner.nextLine ();
        }while(((Developer) developer).getWorkOverTime ()<0);
        employees.add ( developer );

    }

    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }
}
