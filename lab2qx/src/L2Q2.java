import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
        Scanner InpOp = new Scanner(System.in);
        GregorianCalendar Cdate = new GregorianCalendar();
        System.out.println("Current Date: " + Cdate.get(Calendar.DATE)+" "+Cdate.get(Calendar.MONTH)+", "+Cdate.get(Calendar.YEAR));
        System.out.println("Enter day:");
        int day = InpOp.nextInt();
        System.out.println("Enter month:");
        int month = InpOp.nextInt();
        System.out.println("Enter year:");
        int year = InpOp.nextInt();
        InpOp.close();
        GregorianCalendar Fdate = new GregorianCalendar(year, month-1, day);
        long mili_Time_Diff = Fdate.getTimeInMillis() - Cdate.getTimeInMillis();
        long day_Time_Diff = (mili_Time_Diff)/(1000*3600*24);
        System.out.println("Number of days: "+day_Time_Diff);
    }
}