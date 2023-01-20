import java.util.Scanner ;
public class Q1 {
    public static void main(String[] args) {
        Scanner inOp = new Scanner(System.in);
        System.out.println("First point :");
        double firstPoint_x = inOp.nextDouble();
        double firstPoint_y = inOp.nextDouble();
        System.out.println("Second Point :");
        double secondPoint_x = inOp.nextDouble();
        double secondPoint_y = inOp.nextDouble();
        System.out.println("Third Point :");
        double thirdPoint_x = inOp.nextDouble();
        double thirdPoint_y = inOp.nextDouble();
        System.out.println("Fourth Point :");
        double fourthPoint_x = inOp.nextDouble();
        double fourthPoint_y = inOp.nextDouble();
        double centroid_x = (firstPoint_x + secondPoint_x + thirdPoint_x + fourthPoint_x)/4 ;
        double centroid_y = (firstPoint_y + secondPoint_y + thirdPoint_y + fourthPoint_y)/4 ;
        double distanceFirst = Math.sqrt((firstPoint_x - centroid_x)*(firstPoint_x - centroid_x) + (firstPoint_y - centroid_y)*(firstPoint_y - centroid_y));
        double distanceSecond = Math.sqrt((secondPoint_x - centroid_x)*(secondPoint_x - centroid_x) + (secondPoint_y - centroid_y)*(secondPoint_y - centroid_y));
        double distanceThird = Math.sqrt((thirdPoint_x - centroid_x)*(thirdPoint_x - centroid_x) + (thirdPoint_y - centroid_y)*(thirdPoint_y - centroid_y));
        double distanceFourth = Math.sqrt((fourthPoint_x - centroid_x)*(fourthPoint_x - centroid_x) + (fourthPoint_y - centroid_y)*(fourthPoint_y - centroid_y));
        double sumDistance = distanceFirst + distanceSecond + distanceThird + distanceFourth ;
        double shortestDistance = Math.min(distanceFirst, Math.min(distanceSecond, Math.min(distanceThird, distanceFourth)));
        double longestDistance = Math.max(distanceFirst, Math.max(distanceSecond, Math.max(distanceThird, distanceFourth)));
        System.out.println("The centroid is ( " + centroid_x + ", " + centroid_y + " ).");
        System.out.println("Sum of distance is " + sumDistance + ".");
        System.out.println("Shortest distance is " + shortestDistance + ".");
        System.out.println("Longest distance is " + longestDistance + ".");
        inOp.close();
    }
}
