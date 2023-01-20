import java.util.ArrayList;
public class Order {
    //Field-----------------------------------------------------------------------
    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p = new ArrayList<Pizza>();
    //Contructor------------------------------------------------------------------
    public Order(Customer customer) {
        cntOrder++;
        this.c = customer;
        this.id = cntOrder;
    }
    //Method----------------------------------------------------------------------
    public void addPizza(Pizza pizza) {
        p.add(pizza);
    }
    public String getOrderDetail() {
        String detail = "Order id : " + id + "\n" + c.toString() + "\n";
        for (Pizza pizza : p) {
            detail = detail + pizza.toString() + "\n";
        }
        detail = detail + "Total pieces : " + p.size() + "\n" + "Total cost : " + calculatePayment();
        return detail;
    }
    public double calculatePayment() {
        double totalPrice = 0;
        for (Pizza pizza : p) {
            totalPrice += pizza.getPrice();
        }
        if (c instanceof GoldCustomer) {
            totalPrice = totalPrice * (1 - (((GoldCustomer) c).getDiscount()/100));
        }
        return totalPrice;
    }
}
