import java.util.*;
import java.io.*;
public class Advent2016Day2Part1 {
  public static String calculateCode(String fileName) {
    try {
        File file = new File(fileName);
        Scanner scannerForAdvent = new Scanner(file);
        String line = scannerForAdvent.nextLine();
        while (scannerForAdvent.hasNextLine()) {
          System.out.println(scannerForAdvent.nextLine());
        }
        return "";
    }
    catch (Exception ex){
        System.out.println("File not found");
        return "";
    }
  }
public static void main(String[] args) {
    System.out.println(calculateCode("input2.txt"));;
}
}
