import java.io.File;
import java.util.Scanner; 

public class DirectorySize { 
    public static void main(String[] args) throws Exception { 
        // Prompt the user to enter a directory or a file 
        System.out.print("Enter a directory or a file: "); 
        Scanner input = new Scanner(System.in); 
        String directory = input.nextLine(); 
        // Display the size 
        System.out.println(getSize(new File(directory)) + " bytes"); 
        input.close(); 
    } 

    // เขียน method getSize()
    public static String getSize(File directory) {
        long size = 0;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                size = size + Long.parseLong(getSize(file));
            }
            else {
                size = size + file.length();
            }
        }
        return String.valueOf(size);
    }
}