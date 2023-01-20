import java.util.ArrayList;
public class BusTester {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(new Hybrid(45, 1.2, 700, 150, 1));
        arr.add(new CNGBus(50 , 1, 200 , 2));
        for (Object o : arr) {
            System.out.println("ID: " + String.valueOf(((Bus) o).getID()));
            System.out.println("Emission Tier: " + String.valueOf(((LiquidFuel) o).getEmissionTier()));
            System.out.println("Accel: " + String.valueOf(((Bus) o).getAccel()));
        }
    }
}
