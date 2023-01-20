public class Expo extends Taylor {
    //Constructor--------------------------------------------
    public Expo(int k, double x) {
        super(k,x);
    }
    //Method-------------------------------------------------
    public double getApprox() {
        double result = 0;
        for (int n = 0 ; n <= getIteration() ; n++) {
            result = result + ((Math.pow(getValue() , n)) / (factorial(n))) ;
        }
        return result;
    }
    public void printValue() {
        double realValue = Math.exp(getValue());
        double aproxValue = getApprox();
        System.out.println("Value from Math.exp() is " + String.valueOf(realValue) + ".");
        System.out.println("Approximated value is " + String.valueOf(aproxValue) + ".");
    }
}
