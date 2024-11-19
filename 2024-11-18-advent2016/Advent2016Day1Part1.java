import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
public class Advent2016Day1Part1 {
    public static void main(String[] args) {
        System.out.println(calculateDistance("C:\\Users\\motta\\OneDrive\\Desktop\\APCS\\classwork-apcs-NotEquator\\2024-11-18-advent2016\\input.txt"));;
    }
    public static int calculateDistance(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scannerForAdvent = new Scanner(file);
            String line = scannerForAdvent.nextLine();
            String[]moves = line.split(", ");
            int x = 0;
            int y = 0;
            for (int i = 0; i < moves.length-1; i+=2) {
                if (moves[i].charAt(0) == 'R') {
                    x += Integer.parseInt(moves[i].substring(1));
                }
                else if (moves[i].charAt(0) == 'L') {
                    x -= Integer.parseInt(moves[i].substring(1));
                }
                if (moves[i+1].charAt(0) == 'R') {
                    y -= Integer.parseInt(moves[i+1].substring(1));
                }
                else if (moves[i+1].charAt(0) == 'L') {
                    y += Integer.parseInt(moves[i+1].substring(1));
                }
            }
            scannerForAdvent.close();
            System.out.println(x);
            System.out.println(y);
            return Math.abs(0 - x) + Math.abs(0-y);
        }
        catch (Exception ex){
            System.out.println("File not found");
            return 1000000;
        }
    }
}