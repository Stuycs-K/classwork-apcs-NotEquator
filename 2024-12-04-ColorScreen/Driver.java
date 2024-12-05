import java.util.Random;
public class Driver {
    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        drawBorder();
        Text.go(31, 1);
        System.out.print(Text.RESET);
    }

    private static void drawBorder() {
        for (int col = 1; col <= 80; col++) {
            Text.go(1, col);
            Text.color(Text.RED, Text.background(Text.RED));
            System.out.print(" ");

            Text.go(30, col);
            Text.color(Text.RED, Text.background(Text.RED));
            System.out.print(" ");
        }
        for (int row = 1; row <= 30; row++) {
            Text.go(row, 1);
            Text.color(Text.RED, Text.background(Text.RED));
            System.out.print(" ");

            Text.go(row, 80);
            Text.color(Text.RED, Text.background(Text.RED));
            System.out.print(" ");
        }
    }
}
