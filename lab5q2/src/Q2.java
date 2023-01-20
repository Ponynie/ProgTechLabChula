import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner inOp = new Scanner(System.in);
        System.out.println("Enter course ID, course name, credit:");
        String id_1 = inOp.next();
        String name_11 = inOp.next();
        String name_12 = inOp.next();
        String credit_1 = inOp.next();
        String name_1 = name_11 + " " + name_12;
        Course firstSubject = new Course(name_1, id_1, credit_1);
        System.out.println("Enter course ID, course name:");
        String id_2 = inOp.next();
        String name_21 = inOp.next();
        String name_22 = inOp.next();
        String name_2 = name_21 + " " + name_22;
        Course secondSubject = new Course(name_2, id_2);
        if (firstSubject.equals(secondSubject)) {
            System.out.println("Same course");
            System.out.println("Enter course ID, course name, credit:");
            id_2 = inOp.next();
            name_21 = inOp.next();
            name_22 = inOp.next();
            String credit_2 = inOp.next();
            name_2 = name_21 + " " + name_22;
            secondSubject.setCid(id_2);
            secondSubject.setCname(name_2);
            secondSubject.setCredit(credit_2);
        }
        else {
            switch (firstSubject.compare(secondSubject)) {
                case 1:
                    System.out.println("Different course ID.");
                    break;
                case 2:
                    System.out.println("Different course name.");
                    break;
                case 3:
                    System.out.println("Different credit.");
                    break;
                case 4:
                    System.out.println("Different course name and credit.");
                    break;
                case 5:
                    System.out.println("Different course ID and credit.");
                    break;
                case 6:
                    System.out.println("Different course name and course ID.");
                    break;
                case 7:
                    System.out.println("Different course name, course ID and credit.");
                    break;
            }
        }
        System.out.println(firstSubject.getCid() + " " + firstSubject.getCname() + " " + firstSubject.getCredit());
        System.out.println(secondSubject.getCid() + " " + secondSubject.getCname() + " " + secondSubject.getCredit());
        System.out.println("Total credit: " + firstSubject.addCreditWith(secondSubject));
        inOp.close();
    }
}
