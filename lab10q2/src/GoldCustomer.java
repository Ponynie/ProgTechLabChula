public class GoldCustomer extends Customer{
    //Field-----------------------------------------------------------------------
    private double discount;
    //Contructor------------------------------------------------------------------
    public GoldCustomer(String name, String tel , int discount) {
        super(name, tel);
        this.discount = discount;
    }
    //Method----------------------------------------------------------------------
    public double getDiscount() {
        return this.discount;
    }
    public String toString() {
        return super.toString() + " discount : " + this.discount;
    }
}
