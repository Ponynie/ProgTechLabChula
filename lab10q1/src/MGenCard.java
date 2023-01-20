public class MGenCard {
    //Field-----------------------------------------------------------------------
    public static int memberFee = 150;  // ค่าสมัครสมาชิก บัตรทุกแบบมีค่าสมัครเท่ากันหมดคือ 150 
    public static int cnt = 0;         // นับจํานวนบัตรสมาชิกที่สร้างขึ้นมา และใช้กําหนดหมายเลขบัตรสมาชิก 
    private int number;                 // หมายเลขบัตรสมาชิก 
    private String name;                // ชื่อสมาชิก 
    private int point;                    // แต้มสะสม เพื่อใช้ในการแลกตั๋วฟรี 
    //Contructor------------------------------------------------------------------
    public MGenCard(String name) { 
        cnt++; 
        this.number = cnt; 
        this.name = name; 
    } 
    //Method----------------------------------------------------------------------
    public void usePoint() {  
    // ให้ใช้แต้ม 20 แต้มแลกตั๋วฟรีได้ครั้งละ 1 ใบเท่านั้น แล้วแสดงข้อความว่า You got a free Cinema ticket         
        if (point >= 20) { 
            System.out.println("You got a free Cinema ticket"); 
            point -= 20; 
        } 
        // แต่ถ้าแต้มไม่พอแลก ให้แสดงข้อความว่า You don't have enough points 
        else  
            System.out.println("You don't have enough points"); 
        // ก่อนจบ method ให้เรียก toString() เพื่อสั่งพิมพ์ค่า ณ ปัจจุบัน 
        System.out.println(toString()); 
    }
    public void buyTicket(Cinema c , int amount) {
        int totalPrice = c.getTicketPrice() * amount;
        int pointGained = (int) totalPrice / 50;
        this.point = this.point + pointGained;
        System.out.println(c.getName() + "Total amount : " + totalPrice);
        System.out.println(toString());
    }
    public String toString() {
        return getClass().getName() + "[number : " + number + ", name : " + name + ",point : " + point + "]";
    }
}