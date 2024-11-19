import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
public class Advent2016Day1Part1 {
    public static int calculateDistance(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scannerForAdvent = new Scanner(file);
            String line = scannerForAdvent.nextLine();
            String[]moves = line.split(", ");
            int x = 0;
            int y = 0;
            int direction = 0;
            for (int i = 0; i < moves.length; i++) {
              int distance = Integer.parseInt(moves[i].substring(1));
              if (moves[i].charAt(0) == 'R') {
                direction = (direction + 1 + 4) % 4;
              }
              else {
                direction = (direction - 1 + 4) % 4;
              }
              if (direction == 0) {
                y += distance;
              }
              if (direction == 1) {
                x += distance;
              }
              if (direction == 2) {
                y -= distance;
              }
              if (direction == 3) {
                x -= distance;
              }
            }
            scannerForAdvent.close();
            return Math.abs(x) + Math.abs(y);
        }
        catch (Exception ex){
            System.out.println("File not found");
            return 1000000;
        }
    }
    public static void main(String[] args) {
        System.out.println(calculateDistance("input.txt"));;
    }
}
