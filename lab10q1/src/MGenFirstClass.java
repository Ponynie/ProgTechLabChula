public class MGenFirstClass extends MGenCard{
    //Field-----------------------------------------------------------------------
    private int freeTicket = 2;
    //Contructor------------------------------------------------------------------
    public MGenFirstClass(String name) {
        super(name);
    }
    //Method----------------------------------------------------------------------
    public void getFreeTicket() {
        if (this.freeTicket == 2) {
            this.freeTicket = this.freeTicket - 2;
            System.out.println("You got 2 Cinema tickets");
        }
        else {
            System.out.println("You alreaday got the free tickets");
        }
        System.out.println(toString());
    }
    public String toString() {
        return super.toString() + "[free ticket : " + this.freeTicket + "]";
    }
}
