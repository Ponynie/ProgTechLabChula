public class Pizza {
    //Field-----------------------------------------------------------------------
    private String name;
    private double price;
    //Contructor------------------------------------------------------------------
    public Pizza(String name , double price) {
        this.name = name;
        this.price = price;
    }
    //Method----------------------------------------------------------------------
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String toString() {
        return name + " price : " + String.valueOf(price);
    }
}
