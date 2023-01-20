public class Car {
    //Field-----------------------------------------------------------------------
    private double gas , efficiency ;
    //Contructor------------------------------------------------------------------
    public Car(double gas , double efficiency) {
        this.gas = gas;
        this.efficiency = efficiency;
    }
    //Method----------------------------------------------------------------------
    public void drive(double distance) {
        double usedGas = distance / efficiency;
        if (usedGas > gas) {
            System.out.println("You cannot drive too far, please add gas");
        }
        else {
            this.gas = this.gas - usedGas;
        }
    }
    public void setGas(double amount) {
        this.gas = amount;
    }
    public double getGas() {
        return this.gas;
    }
    public double getEfficiency() {
        return this.efficiency;
    }
    public void addGas(double amount) {
        this.gas = this.gas + amount;
    }
}
