import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c :");
        int a = sc.nextInt();
        int  b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        for (int i = a ; i <= b ; i++) {
            for (int j = i ; j <= c*i ; j++) {
                sum += ((i*i) + j);
            }
        }
        System.out.println("Answer = " + sum);
        sc.close();
    }
}
