public class Customer {
    //Field-----------------------------------------------------------------------
    private String name, tel;
    //Contructor------------------------------------------------------------------
    public Customer(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    //Method----------------------------------------------------------------------
    public String getName() {
        return this.name;
    }
    public String getTel() {
        return this.tel;
    }
    public String toString() {
        return name + " tel : " + tel;
    }
}
