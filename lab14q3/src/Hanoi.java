import java.util.Scanner; 
public class Hanoi { 
    public static void main(String[] args) { 
        Scanner inp = new Scanner(System.in); 
        System.out.print("Enter number of disks : "); 
        int n = inp.nextInt(); 
        moveDisks(n, 'A', 'B', 'C'); // (จํานวนจาน, เสาต้นทาง, เสาพัก, เสาปลายทาง) 
        inp.close(); 
    } 
    public static void moveDisks(int n , char begin, char rest, char desigante) {
        if (n == 2) {
            System.out.println("Move 1 from " + begin + " to " + rest);
            System.out.println("Move 2 from " + begin + " to " + desigante);
            System.out.println("Move 1 from " + rest + " to " + desigante);
        }
        else if (n == 1) {
            System.out.println("Move 1 from " + begin + " to " + desigante);
        }
        else {
            moveDisks(n - 1, begin, desigante, rest);
            System.out.println("Move " + String.valueOf(n) + " from " + begin + " to " + desigante);
            moveDisks(n - 1, rest, begin, desigante);
        }
    }
}