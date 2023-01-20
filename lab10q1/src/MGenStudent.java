public class MGenStudent extends MGenCard {
    //Field-----------------------------------------------------------------------
    public static final int discount = 20;
    //Contructor------------------------------------------------------------------
    public MGenStudent(String name) {
        super(name);
    }
    //Method----------------------------------------------------------------------
    public void buyTicket(Cinema c , int amount) {
        super.buyTicket(c, amount);
        double discountPrice =  (c.getTicketPrice() * amount) * (discount/100.0);
        System.out.println("You got " + discountPrice + " discount");
    }
}

