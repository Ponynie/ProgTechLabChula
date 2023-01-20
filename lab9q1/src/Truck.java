public class Truck extends Car {
    //Field-----------------------------------------------------------------------
    private double M_weight , weight;
    //Contructor------------------------------------------------------------------
    public Truck(double gas , double efficiency , double M_weight , double weight) {
        super(gas , efficiency);
        if (weight > M_weight) {
            this.weight = M_weight;
            this.M_weight = M_weight;
        }
        else {
            this.weight = weight;
            this.M_weight = M_weight;
        }
    }
    public void drive(double distance) {
        double usedGasFromDistance = distance / getEfficiency();
        double usedGasFromWeight = 0;
        if (this.weight >= 1 && this.weight <= 10) {
            usedGasFromWeight = 0.1 * usedGasFromDistance;
        }
        else {
            if (this.weight >= 11 && this.weight <= 20) {
                usedGasFromWeight = 0.2 * usedGasFromDistance;
            }
            else {
                if (this.weight > 20) {
                    usedGasFromWeight = 0.3 * usedGasFromDistance;
                }
            }
        }
        double usedGas = usedGasFromWeight + usedGasFromDistance;
        if (usedGas > getGas()) {
            System.out.println("You cannot drive too far, please add gas");
        }
        else {
            setGas(getGas() - usedGas);
        }
    }
}
