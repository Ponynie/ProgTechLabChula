import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        Scanner InputOb = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = InputOb.nextLine();
        System.out.println("Enter age:");
        int age = InputOb.nextInt();
        int year = 2022 - age;
        System.out.println(name + " was born in " + year + ".");
        InputOb.close();
    }
}
