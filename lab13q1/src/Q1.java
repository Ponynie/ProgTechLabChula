import java.io.*;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\test.txt");
        PrintWriter writer = new PrintWriter(file);
        Scanner scKey = new Scanner(System.in);
        while (true) {
            String line = scKey.nextLine();
            if (!line.equals("quit")) {
                writer.println(line);
            }
            else break;
        }
        writer.close();
        Scanner scFile = new Scanner(file);
        int wordCount = 0;
        int characterCount = 0;
        int lineCount = 0;
        while (scFile.hasNextLine()) {
            String line = scFile.nextLine();
            String[] word = line.split(" ");
            wordCount += word.length;
            characterCount += line.length();
            lineCount++;
        }
        System.out.println("Total characters : " + characterCount);
        System.out.println("Total words : " + wordCount);
        System.out.println("Total lines : " + lineCount);
        scKey.close();
        scFile.close();
    }
}
