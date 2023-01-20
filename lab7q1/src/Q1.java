import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int primeList[] = new int[n];
        primeList[0] = 2;
        int lowerLim = 2;
        for (int i = 1; i < n; i++) {
            for (int j = lowerLim + 1 ;; j++) {
                boolean prime = true;
                for (int k = 2 ; k < j ; k++ ) {
                    if ((j%k) == 0) {
                        prime = false;
                        break;
                    }
                }
            if (prime == true) {
                lowerLim = j;
                break;
            }
            }
        primeList[i] = lowerLim;
        }
        sc.close();
        for (int i : primeList) {
            System.out.println(i);
        }
    }
}