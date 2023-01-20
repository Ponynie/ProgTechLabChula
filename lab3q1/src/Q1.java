import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        System.out.println("Student 1: Enter ID, birthday (day month year respectively), name") ;
        String Id_1 = InputScanner.next() ;
        int day_1 = InputScanner.nextInt() ; 
        int month_1 = InputScanner.nextInt() ;
        int year_1 = InputScanner.nextInt() ;
        String name_1 = InputScanner.nextLine() ;
        System.out.println("Student 2: Enter ID, name") ;
        String Id_2 = InputScanner.next() ;
        String name_2 = InputScanner.nextLine() ;
        Student student1 = new Student(name_1 , Id_1 , day_1 , month_1 , year_1) ;
        Student student2 = new Student(name_2 , Id_2) ;
        System.out.println("Student 1: " + student1.getID() + " " + student1.getName() + " " + student1.getAge()) ;
        System.out.println("Student 2: " + student2.getID() + " " + student2.getName() + " " + student2.getAge()) ;
        if (student1.equals(student2)) {
            System.out.println("same") ;
        }
        else {
            System.out.println("not same") ;
        }
        System.out.println("Enter birthday for Student 2 (day month year respectively)") ;
        int day_2 = InputScanner.nextInt() ; 
        int month_2 = InputScanner.nextInt() ;
        int year_2 = InputScanner.nextInt() ;
        InputScanner.close() ;
        student2.setBD(day_2, month_2, year_2);
        System.out.println("Student 1: " + student1.getID() + " " + student1.getName() + " " + student1.getAge()) ;
        System.out.println("Student 2: " + student2.getID() + " " + student2.getName() + " " + student2.getAge()) ;
        if (student1.equals(student2)) {
            System.out.println("same") ;
        }
        else {
            System.out.println("not same") ;
        }
    }
}
