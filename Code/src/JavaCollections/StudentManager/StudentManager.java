package JavaCollections.StudentManager;

import java.util.*;

public class StudentManager extends Student {
    private Student student;
    public static Scanner scanner = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();
    Map<Integer, String> studentMap = new HashMap<Integer, String>();
    Map<Integer, String> studentMap1 = new HashMap<Integer, String>();
    int dem = 1;

    public void addStudent(Student student) {
        student.setId(dem);
        System.out.println("Enter Info of Student has ID: " + student.getId());
        System.out.print("Enter name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter address: ");
        student.setAddr(scanner.nextLine());

        System.out.print("Enter GPA: ");
        student.setGpa(scanner.nextDouble());
        scanner.nextLine();
        studentList.add(student);
    }

    public void editStudent() {
        System.out.print("Enter Student Id to edit: ");
        int idd = scanner.nextInt();
        scanner.nextLine();
        for (int x = 0; x < studentList.size(); x++) {
            if (idd == studentList.get(x).getId()) {

                System.out.print("Enter change name: ");
                studentList.get(x).setName(scanner.nextLine());

                System.out.print("Enter change address: ");
                studentList.get(x).setAddr(scanner.nextLine());

                System.out.print("Enter change GPA: ");
                studentList.get(x).setGpa(scanner.nextDouble());
                scanner.nextLine();
            }
        }
    }

    public void deleteStudent() {
        System.out.print("Enter Student Id to delete: ");
        int idd2 = scanner.nextInt();
        for (int x1 = 0; x1 < studentList.size(); x1++) {
            if (idd2 == studentList.get(x1).getId()) {
                studentList.remove(x1);
            }
        }
    }

    public void show() {
        System.out.println("\n---UPDATE STUTENT---");
        for (Student stu : studentList) {
            System.out.println("ID: " + stu.getId()
                    + " -- Name: " + stu.getName()
                    + " -- Address: " + stu.getAddr()
                    + " -- GPA: " + stu.getGpa());
        }
    }

    public void sortByName() {
        Collections.sort(studentList, new SortbyName());
        for (Student j : studentList) {
            System.out.println(("ID: " + j.getId() + " / Name: " + j.getName() + " / " + j.getGpa()));
        }
    }

    public void sortbyGpa() {
        Collections.sort(studentList, new SortbyGpa());
        for (Student i : studentList) {
            System.out.println(("ID: " + i.getId() + " / Name: " + i.getName() + " / " + i.getGpa()));
        }
    }
}
