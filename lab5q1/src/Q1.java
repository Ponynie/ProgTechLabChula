import java.util.Scanner ;
public class Q1 {
    public static void main(String[] args) {
        Scanner inOp = new Scanner(System.in);
        System.out.println("Press 1 to sum three integers.");
        System.out.println("Press 2 to find roots of a quadratic equation.");
        System.out.println("Press 3 to find the area of a rectangle.");
        System.out.println("Press 4 to print A's.");
        byte choice = inOp.nextByte();
        switch (choice) {
            case 1 :
                System.out.println("Enter 3 integers:");
                int num1 = inOp.nextInt();
                int num2 = inOp.nextInt();
                int num3 = inOp.nextInt();
                int result = num1 + num2 + num3;
                System.out.println("Sum: " + result);
                break;
            case 2 :
                System.out.println("Enter a, b,c for ax^2+bx+c=0 :");
                double a = inOp.nextDouble();
                double b = inOp.nextDouble();
                double c = inOp.nextDouble();
                double discriminant = b*b - 4*a*c ;
                double root_1 = (-b + Math.sqrt(discriminant))/(2*a);
                double root_2 = (-b - Math.sqrt(discriminant))/(2*a);
                System.out.println("Two roots: " + root_1 + ", " + root_2);
                break;
            case 3 :
                System.out.println("Enter the length of 2 sides of the rectangle:");
                double side1 = inOp.nextDouble();
                double side2 = inOp.nextDouble();
                double area = side1 * side2 ;
                System.out.println("Area: " + area);
                break;
            case 4 :
                System.out.println("How many A’s?");
                int n = inOp.nextInt();
                String text = "A".repeat(n);
                System.out.println(text);
                break;
            default :
                System.out.println("Invalid choice");
        }
        inOp.close();
    }
}