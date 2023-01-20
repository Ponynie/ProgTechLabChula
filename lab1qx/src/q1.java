import java.util.Scanner ; 
public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter name:"); 
        Scanner InputOb = new Scanner(System.in);
        String Username = InputOb.nextLine();
        System.out.println("Enter age:");
        int Age = InputOb.nextInt();
        System.out.println(Username + " is " + Age + " years old.");
        InputOb.close();
    }
    
}