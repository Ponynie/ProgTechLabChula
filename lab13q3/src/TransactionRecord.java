public class TransactionRecord {
    //Field--------------------------------------------
    private int acctNo;
    private double amountTransaction;
    //Contructor--------------------------------------
    public TransactionRecord(int acctNo, double amountTransaction) {
        this.acctNo = acctNo;
        this.amountTransaction = amountTransaction;
    }
    public int getAcctNo() {
        return this.acctNo;
    }
    public double getAmountTransaction() {
        return this.amountTransaction;
    }
    public void setAmountTransaction(double amountTransaction) {
        this.amountTransaction = amountTransaction;
    }
}
