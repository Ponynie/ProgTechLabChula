public class Kite extends Quadrilateral{
    //Constructor-----------------------------------------------------------------------------
    public Kite(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    //Method----------------------------------------------------------------------------------
    public double area() {
        double[] dis = getSortedDist();
        double[] diagonal = new double[2];
        int index = 0;
        int check = 1;
        for (int i = 0 ; i < 6 ; i++) {
            int count = 0;
            for (int j = 0 ; j < 6 ; j++) {
                if (dis[i] == dis[j]) {
                    count++;
                }
            }
            switch (count) {
                case 1: 
                    diagonal[index] = dis[i];
                    index++;
                    break;
                case 3:
                    if (check == 1 || check == 4) {
                        diagonal[index] = dis[i];
                        index++;
                    }
                    check++;
            }
        }
        return (diagonal[0] * diagonal[1])/2.00;
    }
}