public class Hybrid extends Bus implements LiquidFuel , Electric {
    //Field----------------------------------------------
    private double voltage , range;
    private int emissionTier;
    //Constructor----------------------------------------
    public Hybrid(int capacity, double cost, double voltage, double range, int emissionTier) {
        super(capacity , cost);
        if (voltage < Electric.LOW_VOLTAGE) this.voltage = Electric.LOW_VOLTAGE;
        else if (voltage > Electric.HIGH_VOLTAGE) this.voltage = Electric.HIGH_VOLTAGE;
        else this.voltage = voltage;
        this.emissionTier = emissionTier;
        this.range = range;
    }
    //Method---------------------------------------
    public double getAccel() {
        return 4;
    }
    public double getRange() {
        return this.range;
    }
    public int getEmissionTier() {
        return this.emissionTier;
    }
    public double getVoltage() {
        return this.voltage;
    }
}
