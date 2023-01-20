public class PizzaSpecial extends Pizza {
    //Field-----------------------------------------------------------------------
    private String special;
    //Contructor------------------------------------------------------------------
    public PizzaSpecial(String name , double price , String special) {
        super(name , price);
        this.special = special;
    }
    //Method----------------------------------------------------------------------
    public String getSpecial() {
        return this.special;
    }
    public String toString() {
        return super.toString() + " special : " + this.special;
    }
}
