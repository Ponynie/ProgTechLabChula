public class AccountRecord {
    //Field-----------------------------------------------------------
    private int acctNo; 
    private String name; 
    private double balance = 0;
    private int transCnt = 0; // นับว่า บัญชีนี้ทำรายการ transaction ไปกี่ครั้ง
    //Constructor-----------------------------------------------------
    public AccountRecord (int acctNo, String name, double balance) { 
        this.acctNo = acctNo; 
        this.name = name; 
        this.balance = balance; 
    }
    //Method------------------------------------------------------------
    public void combine(TransactionRecord t) {
        if (this.acctNo == t.getAcctNo()) {
            this.balance = this.balance + t.getAmountTransaction();
            this.transCnt++;
        }
    }
    public int getAcctNo()  {  return acctNo;   } 
    public String getName()  {  return name;  } 
    public double getBalance(){  return balance; } 
    public int getTransCnt() {    return transCnt; } 
}