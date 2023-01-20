import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentList = new Student[3];
        Course[] courseList = new Course[5];
        System.out.println("Enter 3 student ID and name:");
        for (int i = 0 ; i < 3 ; i++) {
            String id = sc.next();
            String name = sc.nextLine();
            studentList[i] = new Student(name , id);
        }
        System.out.println("Enter 5 course ID, name and credit:");
        for (int i = 0 ; i < 5 ; i++) {
            String id = sc.next();
            String nameAndCredit = sc.nextLine().strip();
            String name = nameAndCredit.substring(0,nameAndCredit.length() - 1);
            String credit = nameAndCredit.substring(nameAndCredit.length() - 1);
            courseList[i] = new Course(name, id , credit);
        }
        for (Student student : studentList) {
            System.out.println(student.getName() + " grade report:");
            while (true) {
                String courseId = sc.next().strip();
                if (!courseId.equals("X")) {
                    String grade = sc.nextLine().strip();
                    boolean knownCourse = false;
                    for (Course i : courseList) {
                        if (courseId.equals(i.getCid())) {
                            knownCourse = true;
                            student.addGradeReport(i , grade);
                            break;
                        }
                    }
                    if (knownCourse == false) {System.out.println("Unknown course, Enter a new one.");}
                }
                else {
                    break;
                }
            }
        }
        for (Student student : studentList) {
            System.out.println("------ Transcript ------");
            System.out.println(" " + student.getID() + " " + student.getName());
            for (CourseGrade i : student.getTranscript()) {
                System.out.println(i.toString());
            }
            System.out.println(" GPA: " + student.calGPA());
        }
        sc.close();
    }
}
