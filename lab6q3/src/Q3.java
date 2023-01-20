import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Q3 {
    public static void main(String[] args) {
        try {
            File scoreFile = new File("C:\\Users\\CharmQuark\\Documents\\NetBeansProjects\\lab6q3s6434461423\\src\\score.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            int count = 0; double max = 0 , min = 0 , sum = 0 , average;
            while (scoreReader.hasNextLine()) {
                double score = Double.parseDouble(scoreReader.nextLine());
                sum += score;
                if (count == 0)  {
                    min = score; max = score;
                }
                max = Math.max(max, score);
                min = Math.min(min, score);
                count++;
            }
            average = sum / count;
            System.out.println("Average score = " + average);
            System.out.println("Highest score = " + max);
            System.out.println("Lowest score = " + min);
            scoreReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
