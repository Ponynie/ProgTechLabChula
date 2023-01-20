public class Point {
    private double x , y ;

    public Point(double x , double y) {
        this.x = x ; this.y = y ;
    }

    public double distance(Point P) {
        double distance = Math.sqrt((this.x - P.x)*(this.x - P.x) + (this.y - P.y)*(this.y - P.y)) ;
        return distance ; 
    }
    public void translate(double dx , double dy) {
        this.x = this.x + dx ;
        this.y = this.y + dy ;
    }
    public boolean equals(Point P) {
        boolean sameX = this.x == P.x ;
        boolean sameY = this.y == P.y ;
        boolean samePoint = sameX && sameY ;
        return samePoint ;
    }
    public String toString() {
        String text = "(" + String.valueOf(this.x) + "," + String.valueOf(this.y) + ")" ;
        return text;
    }
}
