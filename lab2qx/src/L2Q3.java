import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
        GregorianCalendar Cdate = new GregorianCalendar();
        Random randOP = new Random();
        Scanner inpOP = new Scanner(System.in);
        int year = randOP.nextInt(22) + 2000;
        int month = randOP.nextInt(12);
        int day = randOP.nextInt(28) + 1;
        GregorianCalendar Bdate = new GregorianCalendar(year, month, day);
        System.out.println("Current Date: " + Cdate.get(Calendar.DATE)+"-"+Cdate.get(Calendar.MONTH)+"-"+Cdate.get(Calendar.YEAR));
        System.out.println("Enter Your name"); 
        String name = inpOP.nextLine();
        inpOP.close();
        System.out.println("Birth date: " + Bdate.get(Calendar.DATE)+"-"+Bdate.get(Calendar.MONTH)+"-"+Bdate.get(Calendar.YEAR));
        long Age_Day = (Cdate.getTimeInMillis() - Bdate.getTimeInMillis())/(1000*3600*24);
        System.out.println(name+"Age in days: "+ Age_Day);
    }
}