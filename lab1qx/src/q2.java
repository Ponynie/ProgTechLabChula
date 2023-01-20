import java.util.Scanner ; 
public class q2 {
    public static void main(String[] args) {
        Scanner InputOb = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = InputOb.nextLine();
        System.out.println("Enter birth year:");
        int birthYear = InputOb.nextInt();
        int Age = 2565 - birthYear;
        System.out.println(name + " is " + Age + " years old.");
        InputOb.close();
    }
}
