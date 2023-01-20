import java.util.Scanner;
import java.util.ArrayList;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primeList = new ArrayList<>();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for (int i = 2 ; i < n ; i++) {
            boolean prime = true;
            for (int j = 2 ; j < i ; j++) {
                if ((i%j) == 0) {
                    prime = false;
                    break;
                }
            }
        if (prime == true) primeList.add(i);
        }
        sc.close();
        for (int i : primeList) {
            System.out.println(i);
        }
    }
}
