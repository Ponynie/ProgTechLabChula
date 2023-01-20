import java.util.Scanner ; 
public class Q2 {
    public static void main(String[] args) {
        Scanner inOp = new Scanner(System.in);
        System.out.println("Enter firstname lastname age:");
        String info = inOp.nextLine();
        int spaceIndex_1 = info.indexOf(" ");
        int spaceIndex_2 = info.indexOf(" ",spaceIndex_1 + 2);
        String name = info.substring(0,spaceIndex_1).trim();
        String surName = info.substring(spaceIndex_1,spaceIndex_2).trim();
        String age = info.substring(spaceIndex_2).trim();
        inOp.close();
        System.out.println(surName + ", " + name + " is " + age + " years old.");
    }
}
