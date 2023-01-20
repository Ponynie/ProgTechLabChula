public class Sine extends Taylor{
    //Constructor--------------------------------------------
    public Sine(int k, double x) {
        super(k,x);
    }
    //Method-------------------------------------------------
    public double getApprox() {
        double result = 0;
        for (int n = 0 ; n <= getIteration() ; n++) {
            result = result + (Math.pow(-1,n) * Math.pow(getValue(),2*n + 1)/factorial(2*n + 1)) ;
        }
        return result;
    }
    public void printValue() {
        double realValue = Math.sin(getValue());
        double aproxValue = getApprox();
        System.out.println("Value from Math.sine() is " + String.valueOf(realValue) + ".");
        System.out.println("Approximated value is " + String.valueOf(aproxValue) + ".");
    }
}

