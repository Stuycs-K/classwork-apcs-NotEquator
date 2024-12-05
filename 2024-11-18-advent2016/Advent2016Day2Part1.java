import java.io.File;
import java.util.Scanner;

public class Advent2016Day2Part1 {
    public static String getBathroomCode(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            char[][] keypad = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
            };
            int row = 1;
            int col = 1;
            String code = ""; 
            while (scanner.hasNextLine()) {
                String instructions = scanner.nextLine();
                for (int i = 0; i < instructions.length(); i++) {
                    char move = instructions.charAt(i);
                    if (move == 'U' && row > 0) {
                        row--;
                    } else if (move == 'D' && row < 2) {
                        row++;
                    } else if (move == 'L' && col > 0) {
                        col--;
                    } else if (move == 'R' && col < 2) {
                        col++;
                    }
                }
                code += keypad[row][col];
            }
            scanner.close();
            return code;
        } catch (Exception ex) {
            System.out.println("File not found");
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(getBathroomCode("C:\\Users\\motta\\OneDrive\\Desktop\\APCS\\classwork-apcs-NotEquator\\2024-11-18-advent2016\\input.txt"));
    }
}