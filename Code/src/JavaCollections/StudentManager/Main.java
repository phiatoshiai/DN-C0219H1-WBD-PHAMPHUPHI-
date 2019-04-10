package JavaCollections.StudentManager;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        int choice = 0;

        while (choice != 6) {
            System.out.print("***************\n");
            System.out.print("STUDENT MANAGER\n");
            System.out.print("***************\n");
            System.out.print("1.) Addition \n");
            System.out.print("2.) Edit.\n");
            System.out.print("3.) Delete.\n");
            System.out.print("4.) Sort by GPA.\n");
            System.out.print("5.) Sort by Name.\n");
            System.out.print("6.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD NEW STUDENT");
                    studentManager.addStudent(new Student());
                    studentManager.dem++;
                    studentManager.show();
                    System.out.println("----------------------------------------------\n");
                    break;

                case 2:
                    System.out.println("EDIT STUDENT");
                    studentManager.editStudent();
                    studentManager.show();
                    System.out.println("----------------------------------------------\n");
                    break;

                case 3:
                    System.out.println("DELETE STUDENT");
                    studentManager.deleteStudent();
                    studentManager.show();
                    studentManager.dem--;
                    System.out.println("----------------------------------------------\n");
                    break;

                case 4:
                    System.out.println("\n SORT STUDENT BY GPA");
                    studentManager.sortbyGpa();
                    System.out.println("----------------------------------------------\n");
                    break;

                case 5:
                    System.out.println("\n SORT STUDENT BY NAME");
                    studentManager.sortByName();
                    System.out.println("----------------------------------------------\n");
                    break;

                default:
                    System.out.println("Design by: PHAM PHU PHI");
                    break;
            }
        }
    }
}
