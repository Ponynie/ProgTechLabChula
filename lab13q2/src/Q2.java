import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();
        try (Scanner scFile = new Scanner(new File("src\\wordlist.txt"))) {
            ArrayList<String> wordList = new ArrayList<String>();
            while (scFile.hasNextLine()) {
                wordList.add(scFile.nextLine());
            }
            boolean found = false;
            ArrayList<String> wordNotCon = new ArrayList<String>();
            String[] sentenceList = sentence.split(" ");
            for (String i : sentenceList) {
                if (!wordList.contains(i)) {
                    wordNotCon.add(i);
                    found = true;
                }
            }
            System.out.println("Words not contained: ");
            if (found) {
                for (String i : wordNotCon) {
                    System.out.println(i);
                }
            }
            else {
                System.out.println("N/A");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
