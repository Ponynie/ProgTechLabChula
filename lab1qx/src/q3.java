import java.util.Scanner ; 
public class q3 {
    public static void main(String[] args) {
        Scanner InputOb = new Scanner(System.in);
        System.out.println("Enter a number:");
        float First = InputOb.nextFloat();
        System.out.println("Enter another number:");
        float Second = InputOb.nextFloat();
        float Sum = First + Second;
        float Product = First * Second;
        float Ratio = Product / Sum;
        System.out.println("The ratio between their product and their sum is " + Ratio);
        InputOb.close();
    }
}