package JavaCollections.StudentManager;

import java.util.*;

public class StudentManager extends Student{
    public static Scanner scanner = new Scanner ( System.in );
    ArrayList<Student> studentList = new ArrayList<> ();
    int dem = 1;

    public void addStudent ( Student student ) {
        student.setId ( dem );
        System.out.println ( "Enter Info of Student has ID: " + student.getId () );
        System.out.print ( "Enter name: " );
        student.setName ( scanner.nextLine () );

        System.out.print ( "Enter address: " );
        student.setAddr ( scanner.nextLine () );
        do {
            System.out.print ( "Enter GPA 0 to 10:  ");
            student.setGpa ( scanner.nextDouble () );
        }while(student.getGpa ()<0 || student.getGpa ()> 10);
            scanner.nextLine ();
            studentList.add ( student );

    }

    public void editStudent () {
        System.out.print ( "Enter Student Id to edit: " );
        int idEdit = scanner.nextInt ();
        scanner.nextLine ();
        for ( Student student : studentList ) {
            if ( idEdit == student.getId () ) {
                System.out.print ( "Enter change name: " );
                student.setName ( scanner.nextLine () );

                System.out.print ( "Enter change address: " );
                student.setAddr ( scanner.nextLine () );

                System.out.print ( "Enter change GPA: " );
                student.setGpa ( scanner.nextDouble () );
                if(student.getGpa () >0 || student.getGpa () <10){
                    System.out.print ("GPA Enter 0 to 10, enter again: ");
                    scanner.nextDouble ();
                }
                scanner.nextLine ();
            }
        }
    }

    public void deleteStudent () {
        System.out.print ( "Enter Student Id to delete: " );
        int idDelete = scanner.nextInt ();
        for ( Student student : studentList ) {
            if ( idDelete == student.getId () ) {
                studentList.remove ( idDelete );
            }
        }
    }

    public void show () {
        System.out.println ( "\n---UPDATE STUTENT---" );
        for ( Student student : studentList ) {
            System.out.println ( "ID: " + student.getId ()
                    + " -- Name: " + student.getName ()
                    + " -- Address: " + student.getAddr ()
                    + " -- GPA: " + student.getGpa () );
        }
    }

    public void sortByName () {
        Collections.sort ( studentList , new Comparator<Student> () {
            @Override
            public int compare ( Student o1 , Student o2 ) {
                return (int) (o1.getGpa () - o2.getGpa ());
            }
        } );
        for(Student student :studentList){
                System.out.println ( ("ID: " + student.getId () + " / Name: " + student.getName () + " / " + student.getGpa ()) );
            }
        }

        public void sortbyGpa () {
            Collections.sort ( studentList , new Comparator<Student> () {
                @Override
                public int compare ( Student o1 , Student o2 ) {
                    return o1.getName ().compareTo ( o2.getName () );
                }
            } );
            for ( Student student : studentList ) {
                System.out.println ( ("ID: " + student.getId () + " / Name: " + student.getName () + " / " + student.getGpa ()) );
            }
        }
    }

