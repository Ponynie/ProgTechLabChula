import java.awt.Point;
public abstract class Quadrilateral { 
    //Field-----------------------------------------------------------------------------------
    private Point a, b, c, d; 
    //Constructor-----------------------------------------------------------------------------
    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) { 
        a = new Point(x1, y1); 
        b = new Point(x2, y2); 
        c = new Point(x3, y3); 
        d = new Point(x4, y4); 
    }
    //Method----------------------------------------------------------------------------------
    public double[] getSortedDist() {
        double[] dis = new double[6];
        dis[0] = a.distance(b);
        dis[1] = a.distance(c);
        dis[2] = a.distance(d);
        dis[3] = b.distance(c);
        dis[4] = b.distance(d);
        dis[5] = c.distance(d);
        for (int i = 1 ; i < dis.length ; i++) {
            for (int j = 0 ; j < dis.length - i ; j++) {
                if (dis[j] > dis[j+1]) {
                    double a = dis[j+1];
                    double b = dis[j];
                    dis[j] = a;
                    dis[j+1] = b;
                }
            }
        }
        return dis;
    }
    public String toString() {
        return a.toString() + "\n" + b.toString() + "\n" + c.toString() + "\n" + d.toString(); 
    }
    //Abstract Method----------------------------------------------------------------------------------
    public abstract double area();
}