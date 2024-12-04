public class ColorDemo {
    public static final String CLEAR_SCREEN = "\u001b[2J";
    public static final String HIDE_CURSOR = "\u001b[?25l";
    public static final String SHOW_CURSOR = "\u001b[?25h";
    public static final String RESET = "\u001b[0m";

    public static void main(String[] args) {
        System.out.print(CLEAR_SCREEN + HIDE_CURSOR);
        run();
        System.out.print(RESET + SHOW_CURSOR);
    }
    public static void run() {
        for (int frame = 0; frame < 50; frame++) {
            draw(frame);
            sleep(100);
        }
    }
    public static void draw(int offset) {
        System.out.print("\u001b[H");
        int rows = 20;
        int cols = 40;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int red = (row * 10 + offset) % 256;
                int green = (col * 5 + offset) % 256;
                int blue = ((row + col) * 3 + offset) % 256;
                System.out.print("\u001b[38;2;" + red + ";" + green + ";" + blue + "m█");
            }
            System.out.println();
        }
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }
}
