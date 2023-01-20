public abstract class Taylor {
    //Field----------------------------------------------------------
    private int k;
    private double x;
    //Constructor----------------------------------------------------
    public Taylor(int k , double x) {
        this.x = x;
        this.k = k;
    }
    //Method---------------------------------------------------------
    public int factorial(int n) {
        int result = 1;
        for (int i = 1 ; i <= n ; i++) {
            result = result * i;
        }
        return result;
    }
    public int getIteration() {
        return k;
    }
    public double getValue() {
        return x;
    }
    //Abstract Method-------------------------------------------------
    public abstract void printValue();
    public abstract double getApprox();
}
