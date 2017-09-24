// Reads file of entrees and prices
// prompts user for a cutoff price
// and displays entrees that cost no more than the cutoff
import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;

public class FixDebugThirteen4 {
    public static void main(String args[]){
        Scanner keyBoard = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\bondm\\OneDrive\\University\\5th Year\\2nd Semester\\CP2406 - Programming 2\\CP2406-Prac-8\\FixDebugThirteen\\FixDebugData4.txt");
        String[] array = new String[2];
        String string = "";
        String delimiter = ",";
        double searchPrice;
        boolean wasFound = false;

        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println();

            System.out.println("Enter maximum price to search for >> ");
            searchPrice = Double.parseDouble(keyBoard.next());
            System.out.println("\nEntrees no more than $"+searchPrice+"\n");
            string = reader.readLine();
            while(string != null){
                array = string.split(delimiter);
                if(searchPrice >= Double.parseDouble(array[1])){
                    wasFound = true;
                    System.out.println(array[0]+" $"+array[1]);
                }
                string = reader.readLine();
            }
            if(!wasFound){
                System.out.println("No entrees found under $"+searchPrice);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
}
