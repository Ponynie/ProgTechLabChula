import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student 1: Enter ID, name ");
        String id_1 = sc.next();
        String name_1 = sc.nextLine();
        System.out.println("Student 2: Enter ID, name ");
        String id_2 = sc.next();
        String name_2 = sc.nextLine();
        Student student_1 = new Student(name_1 , id_1);
        Student student_2 = new Student(name_2 , id_2);
        String year , level , faculty;
        if (student_1.sameYear(student_2)) {
            year = "Same year";
        }
        else {
            year = "Different year";
        }
        if (student_1.sameLevel(student_2)) {
            level = "same level";
        }
        else {
            level = "different level";
        }
        if (student_1.sameFaculty(student_2)) {
            faculty = "same faculty";
        }
        else {
            faculty = "different faculty";
        }
        System.out.println(year + ", " + level + ", " + faculty);
        sc.close();
    }
}
