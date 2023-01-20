import java.util.Scanner;
import java.util.ArrayList; 
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList<String> facCodeList = new ArrayList<>();
        System.out.println("Enter course ID, name, credit: or X to stop");
        while (true) {
            String courseId = sc.next();
            if (!courseId.equals("X")) {
                String nameAndCredit = sc.nextLine().strip();
                String name = nameAndCredit.substring(0,nameAndCredit.length() - 1);
                String credit = nameAndCredit.substring(nameAndCredit.length() - 1);
                String facCode = courseId.substring(0,2);
                if (!facCodeList.contains(facCode)) facCodeList.add(facCode);
                courseList.add(new Course(name, courseId, credit));
            }
            else {
                break;
            }
        }
        sc.close();
        System.out.println(String.valueOf(Course.numberOfCourses()) + " courses");
        for (String i : facCodeList) {
            System.out.println(String.valueOf(Course.numberOfFacCourses(Integer.parseInt(i))) + " courses for " + i);
        }
    }
}