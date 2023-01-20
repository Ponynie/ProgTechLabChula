import java.util.Scanner ; 
public class Q3 {
    public static void main(String[] args) {
        Scanner inOp = new Scanner(System.in) ; 
        System.out.println("Point A:") ;
        double x_1 = inOp.nextDouble() ;
        double y_1 = inOp.nextDouble() ;
        Point firstPoint = new Point(x_1, y_1) ;
        System.out.println("Point B:") ;
        double x_2 = inOp.nextDouble() ;
        double y_2 = inOp.nextDouble() ;
        Point secondPoint = new Point(x_2, y_2) ;
        System.out.println("A = " + firstPoint.toString() + " B = " + secondPoint.toString() + " Distance = " + firstPoint.distance(secondPoint)) ; 
        System.out.println("Move the points:") ;
        double dx = inOp.nextDouble() ;
        double dy = inOp.nextDouble() ;
        firstPoint.translate(dx, dy) ;
        secondPoint.translate(dx, dy);
        System.out.println("A = " + firstPoint.toString() + " B = " + secondPoint.toString() + " Distance = " + firstPoint.distance(secondPoint)) ;
        if (firstPoint.equals(secondPoint)) {
            System.out.println("A and B are at the same position.");
        }
        else {
            System.out.println("A and B are not at the same position.");
        }
        inOp.close();
    }
}
