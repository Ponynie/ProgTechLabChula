public class Cosine extends Taylor{
    //Constructor--------------------------------------------
    public Cosine(int k, double x) {
        super(k,x);
    }
    //Method-------------------------------------------------
    public double getApprox() {
        double result = 0;
        for (int n = 0 ; n <= getIteration() ; n++) {
            result = result + (Math.pow(-1,n) * Math.pow(getValue(),2*n)/factorial(2*n)) ;
        }
        return result;
    }
    public void printValue() {
        double realValue = Math.cos(getValue());
        double aproxValue = getApprox();
        System.out.println("Value from Math.cos() is " + String.valueOf(realValue) + ".");
        System.out.println("Approximated value is " + String.valueOf(aproxValue) + ".");
    }
}
