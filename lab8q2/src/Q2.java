import java.util.Random;
public class Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array_1 = new int[10][5];
        int[][] array_2 = new int[10][5];
        int[][] array_3 = new int[5][3];
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[0].length; j++) {
                array_1[i][j] = rand.nextInt(201) - 100 ;
            }
        }
        for (int i = 0; i < array_2.length; i++) {
            for (int j = 0; j < array_2[0].length; j++) {
                array_2[i][j] = rand.nextInt(201) - 100 ;
            }
        }
        for (int i = 0; i < array_3.length; i++) {
            for (int j = 0; j < array_3[0].length; j++) {
                array_3[i][j] = rand.nextInt(201) - 100 ;
            }
        }
        Mtx A = new Mtx(array_1);
        Mtx B = new Mtx(array_2);
        Mtx C = new Mtx(array_3);
        System.out.println("A = ");
        A.display();
        System.out.println("B = ");
        B.display();
        System.out.println("C = ");
        C.display();
        if (A.equalSize(B)) {
            Mtx result1 = A.add(B);
            System.out.println("A+B = ");
            result1.display();
        }
        else {
            System.out.println("A and B are not the same size.");
        }
        Mtx result2 = B.mul(2);
        System.out.println("2*B = ");
        result2.display();
        if (A.compatible(B)) {
            Mtx result3 = A.mul(B);
            System.out.println("A*B = ");
            result3.display();
        }
        else {
            System.out.println("A and B are not compatible");
        }
        if (A.compatible(C)) {
            Mtx result4 = A.mul(C);
            System.out.println("A*C = ");
            result4.display();
        }
        else {
            System.out.println("A and C are not compatible");
        }
    }
}
