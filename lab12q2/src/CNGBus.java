public class CNGBus extends Bus implements LiquidFuel{
    //Field----------------------------------------
    private double range;
    private int emissionTier;
    //Constructor----------------------------------
    public CNGBus(int capacity , double cost ,double range, int emissionTier) {
        super(capacity , cost);
        this.range = range;
        this.emissionTier = emissionTier;
    }
    //Method---------------------------------------
    public double getAccel() {
        return 3;
    }
    public double getRange() {
        return this.range;
    }
    public int getEmissionTier() {
        return this.emissionTier;
    }
}
