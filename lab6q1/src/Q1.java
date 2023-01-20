import java.util.Scanner;
public class Q1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course ID, credit and grade; or X to terminate");
        double sum_credit = 0 , sumproduct = 0 ;
        String sentence;
        do {
            sentence = sc.nextLine();
            if (sentence.equals("X")) {
                break;
            }
            else {
                double grade = 0;
                double credit = Double.parseDouble(sentence.substring(8,9));
                String grade_letter = sentence.substring(10);
                switch (grade_letter) {
                    case "A" : 
                        grade = 4.0; break;
                    case "B+": 
                        grade = 3.5; break;
                    case "B" : 
                        grade = 3.0; break;
                    case "C+": 
                        grade = 2.5; break;
                    case "C" : 
                        grade = 2.0; break;
                    case "D+": 
                        grade = 1.5; break;
                    case "D" : 
                        grade = 1.0; break;
                    case "F" : 
                        grade = 0.0; break;
                }
                double product = credit * grade;
                sumproduct += product;
                sum_credit += credit;
            }
        } while (true);
        sc.close();
        double GPAX = sumproduct / sum_credit;
        System.out.println("GPA = " + GPAX);
    }
}
