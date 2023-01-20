public class Cinema {
    //Field-----------------------------------------------------------------------
    private String name;     // ชื่อโรงภาพยนตร์ 
    private int ticketPrice; // ราคาตั๋วหนัง 
    //Contructor------------------------------------------------------------------
    public Cinema (String name, int ticketPrice) { 
        this.name = name; 
        this.ticketPrice = ticketPrice; 
    } 
    //Method----------------------------------------------------------------------
    public String getName() { 
        return name; 
    } 
    public int getTicketPrice() { 
        return ticketPrice; 
    } 
}
